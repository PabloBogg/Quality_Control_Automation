use mi_db;
-- ---------------------------------------
-- Actividad: Ejercicios Complementarios
-- ---------------------------------------

-- Muestra el nombre y apellido de los empleados que pertenecen al departamento de "Recursos Humanos" y han realizado más de 5 ventas.
select concat(e.nombre, " ", e.apellido) "Nombre", count(v.id) "Ventas"
from empleados e
left join ventas v on v.empleado_id=e.id
left join departamentos d on e.departamentos_id=d.id
where d.nombre="Recursos Humanos"
group by concat(e.nombre, " ", e.apellido)
having count(v.id)>5;

-- Muestra el nombre y apellido de todos los empleados junto con la cantidad total de ventas que han realizado, incluso si no han realizado ventas.
select concat(e.nombre, " ", e.apellido) "Nombre", count(v.id) "Ventas"
from ventas v
right join  empleados e on v.empleado_id=e.id
group by concat(e.nombre, " ", e.apellido);

-- Encuentra el empleado más joven de cada departamento y muestra el nombre del departamento junto con el nombre y la edad del empleado más joven.
select d.nombre "Departamento", min(e.edad) "Edad"
from empleados e
left join departamentos d on e.departamentos_id=d.id
group by d.nombre;
  
-- Calcula el volumen de productos vendidos por cada producto (por ejemplo, menos de 5 como "bajo", entre 5 y 10 como "medio", y más de 10 como "alto")
--  y muestra la categoría de volumen junto con la cantidad y el nombre del producto