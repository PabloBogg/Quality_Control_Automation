use mi_db;
-- -----------------------
-- Ejercicios JOIN Parte 2
-- -----------------------
-- Calcula la cantidad de ventas por departamento, incluso si el departamento no tiene ventas.
select d.nombre "Departamento", count(v.id) "Cantidad ventas"
from departamentos d
left join empleados e on e.departamentos_id=d.id
left join ventas v on v.empleado_id=e.id
group by d.nombre;

-- Encuentra el nombre y la dirección de los clientes que han comprado más de 3 productos distintos y muestra la cantidad de productos comprados.
select c.nombre "Nombre", c.direccion "Direccion", count(distinct v.producto_id) "Cantidad"
from clientes c
left join ventas v on c.id=v.cliente_id
group by c.nombre, c.direccion
having count(distinct v.producto_id)>3;

-- Calcula el monto total de ventas realizadas por cada departamento y muestra el nombre del departamento junto con el monto total de ventas.
select d.nombre "Departamento", sum(v.monto_total) "Ventas totales"
from departamentos d
left join empleados e on e.departamentos_id=d.id
left join ventas v on v.empleado_id=e.id
group by d.nombre;