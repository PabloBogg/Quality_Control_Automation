-- --------------------------------------
-- Actividad: Ejercicios Complementarios
-- --------------------------------------

-- Encontrar la cantidad de productos vendidos por cada empleado y mostrar el nombre del empleado junto con la cantidad de productos vendidos.
select concat(e.nombre," ",e.apellido) "Nombre", sum(v.cantidad) "Cantidad"
from empleados e, ventas v
where v.empleado_id=e.id
group by concat(e.nombre," ",e.apellido);

-- Calcular el monto total de ventas por cada cliente y mostrar el nombre del cliente junto con el monto total de sus compras.
select c.nombre "Nombre", sum(v.monto_total) "Monto vendido"
from clientes c, ventas v
where v.cliente_id=c.id
group by c.nombre;

-- Encontrar el producto más caro vendido y mostrar su nombre y precio.
select p.nombre "Producto", max(v.precio_unitario) "Precio"
from productos p, ventas v
where v.producto_id=p.id
group by p.nombre
order  by max(v.precio_unitario) desc;

-- Calcular el salario promedio de los empleados en cada departamento y mostrar el nombre del departamento junto con el salario promedio.
select d.nombre "Departamento", avg(e.salario) "Salario Promedio"
from departamentos d, empleados e
where e.departamentos_id=d.id 
group by d.nombre;

-- Encontrar la cantidad total de ventas realizadas por cada empleado y mostrar el nombre y apellido 
-- del empleado junto con la cantidad total de ventas.
select concat(e.nombre," ",e.apellido) "Nombre", count(v.cantidad) "Cantidad de ventas"
from empleados e, ventas v
where v.empleado_id=e.id
group by concat(e.nombre," ",e.apellido);

-- Encuentra la cantidad de ventas realizadas por cada empleado y muestra el nombre y apellido del 
-- empleado junto con la cantidad total de ventas. 
-- Limita los resultados a mostrar solo a los empleados que hayan realizado más de 5 ventas y 
-- ordenarlos de forma descendente con respecto a la cantidad de ventas.
select concat(e.nombre," ",e.apellido) "Nombre", count(v.cantidad) "Cantidad de ventas"
from empleados e, ventas v
where v.empleado_id=e.id
group by concat(e.nombre," ",e.apellido)
having count(v.cantidad)>5
order by count(v.cantidad) desc;

-- Calcula el monto total vendido por cada empleado y muestra el nombre del empleado junto con el monto total. 
-- Usa la cláusula HAVING para filtrar a aquellos empleados que hayan vendido más de 10 productos en total. 
-- Muestra el resultado en orden descendente según el monto total vendido.
select concat(e.nombre," ",e.apellido) "Nombre", sum(v.monto_total) "Monto toal vendido"
from empleados e, ventas v
where v.empleado_id=e.id
group by concat(e.nombre," ",e.apellido)
having sum(v.cantidad)>10
order by sum(v.monto_total) desc;

-- Encuentra el monto total vendido a cada cliente y muestra el nombre del cliente junto con el monto total. 
-- Usa la cláusula HAVING para filtrar a aquellos clientes cuyo monto total promedio en sus compras sea superior a $1500. 
-- Muestra el resultado en orden descendente según el monto total vendido.
SELECT c.nombre Cliente,
      SUM(v.monto_total) Total
FROM clientes c, ventas v
WHERE v.cliente_id = c.id
GROUP BY cliente_id
HAVING SUM(v.monto_total) > 15000
ORDER BY Total DESC;

-- Calcula la cantidad total de ventas realizadas a cada cliente y muestra el nombre del 
-- cliente junto con la cantidad total de ventas. Limita los resultados a mostrar solo 
-- a los clientes que hayan realizado más de 3 ventas ordénalos de forma descendente según la cantidad de ventas.
select c.nombre "Nombre", count(v.cantidad) "Cantidad"
from clientes c, ventas v
where v.cliente_id=c.id
group by c.nombre
having count(v.cantidad)>3
order by count(v.cantidad) desc; 

-- Encuentra los productos más caros vendidos (precio mayor a 1000), 
-- muestra su nombre y precio y ordenarlos de forma descendente por precio.
select p.nombre "Producto", max(v.precio_unitario) "Precio"
from productos p, ventas v
where v.producto_id=p.id
group by p.nombre
order  by max(v.precio_unitario) desc;