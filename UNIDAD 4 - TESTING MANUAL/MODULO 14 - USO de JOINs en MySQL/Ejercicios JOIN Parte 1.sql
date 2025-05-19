use mi_db;
-- ------------------------
-- Ejercicios JOIN Parte 1
-- ------------------------
-- Encuentra el nombre y apellido de los empleados junto con la cantidad total de ventas que han realizado.
SELECT CONCAT(e.nombre, ' ', e.apellido) as nombre_empleado, COUNT(v.id) as total_ventas
FROM empleados e
LEFT JOIN ventas v
ON e.id = v.empleado_id
GROUP BY nombre_empleado;

-- Calcula el monto total vendido a cada cliente y muestra el nombre del cliente, su dirección y el monto total.
SELECT c.nombre as "cliente", c.direccion, SUM(v.monto_total) as "$ gastada"
FROM clientes c LEFT JOIN ventas v
on c.id = v.cliente_id
group by c.nombre, c.direccion order by SUM(v.monto_total) ASC;

-- Encuentra los productos vendidos por cada empleado en el departamento de "Ventas" y muestra el nombre del empleado junto con el nombre de los productos que han vendido.
SELECT e.nombre as "empleado", p.nombre as "producto"
FROM empleados e
inner join departamentos d on e.departamento_id = d.id
join ventas v on e.id = v.empleado_id
join productos p on v.producto_id = p.id
where d.nombre = "Ventas"
order by e.nombre, p.nombre;

-- Encuentra el nombre del cliente, el nombre del producto y la cantidad comprada de productos con un precio superior a $500.
select c.nombre "Cliente", p.nombre "Producto", SUM(v.cantidad) "Cantidad"
from ventas v
join clientes c on v.cliente_id=c.id
join productos p on v.producto_id=p.id
where v.precio_unitario>500
group by c.nombre, p.nombre
order by SUM(v.cantidad) DESC;