use mi_db;
-- Ejercicios consultas multitabla - Parte 2 
-- Calcular el monto total de ventas por departamento y mostrar el nombre del departamento junto con el monto total de ventas.
select d.nombre departamento, sum(v.monto_total) "Ventas totales"
from departamentos d, ventas v, empleados e
where v.empleado_id=e.id and e.departamentos_id=d.id
group by departamento;

-- Encontrar el empleado más joven de cada departamento y mostrar el nombre del departamento 
-- junto con la edad del empleado más joven.


-- Calcular el volumen de productos vendidos por cada producto 
-- (por ejemplo, menos de 5 “bajo”, menos 8 “medio” y mayor o igual a 8 “alto”)
-- y mostrar la categoría de volumen junto con la cantidad y el nombre del producto.
select p.nombre producto, case 
when sum(v.cantidad)<5 then "bajo"
when sum(v.cantidad)<8 and sum(v.cantidad)>=5 then "medio"
when sum(v.cantidad)>=8 then "alto"
end as categoria,
sum(v.cantidad) cantidad
from ventas v, productos p
where v.producto_id=p.id
group by producto
order by cantidad desc;

-- Encontrar el cliente que ha realizado el mayor monto total de compras y mostrar su nombre y el monto total.
select c.nombre Nombre, max(v.monto_total)
from clientes c, ventas v
where v.cliente_id=c.id
group by Nombre;

-- Calcular el precio promedio de los productos vendidos por cada empleado y mostrar el 
-- nombre del empleado junto con el precio promedio de los productos que ha vendido.
select e.nombre nombre, avg(v.precio_unitario)
from empleados e, ventas v
where v.empleado_id=e.id
group by e.nombre;

SELECT e.nombre "Nombre del Empleado", AVG(p.precio) "Precio Promedio de
Productos Vendidos"
FROM empleados e, ventas v, productos p
WHERE e.id = v.empleado_id AND v.producto_id = p.id
GROUP BY e.nombre;

-- Encontrar el departamento con el salario mínimo más bajo entre los empleados y 
-- mostrar el nombre del departamento junto con el salario mínimo más bajo.
select d.nombre "Departamento", min(e.salario)
from departamentos d, empleados e
where e.departamentos_id=d.id
group by d.nombre;

-- Encuentra el departamento con el salario promedio más alto entre los empleados 
-- mayores de 30 años y muestra el nombre del departamento junto con el salario promedio. 
-- Limita los resultados a mostrar solo los departamentos con el salario promedio mayor a 3320
select d.nombre "Departamento", avg(e.salario) "Salario Promedio"
from departamentos d, empleados e
where e.departamentos_id=d.id and e.edad>30
group by d.nombre
having avg(e.salario)>3320;