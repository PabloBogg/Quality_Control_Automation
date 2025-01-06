use mi_db;
-- ✏️Ejercicios GROUP BY()
-- Agrupa las ventas por empleado y muestra la cantidad total de ventas realizadas por cada empleado.
select empleado_id, count(*) from ventas group by empleado_id; 

-- Agrupa los productos por precio y muestra la cantidad de productos con el mismo precio.
select precio, count(*) from productos group by precio order by precio asc;

-- Agrupa los empleados por departamento y muestra la cantidad de empleados en cada departamento.
select departamentos_id, count(*) from empleados group by departamentos_id;

-- ✏️Ejercicios HAVING
-- Encuentra los departamentos con un salario promedio de sus empleados superior a $3,000.
select departamentos_id, avg(salario) from empleados group by departamentos_id;
SELECT departamentos_id, AVG(salario) as "salario_promedio" FROM empleados GROUP BY departamentos_id HAVING salario_promedio > 3000;

-- Encuentra los productos que se han vendido al menos 5 veces.
select producto_id, sum(cantidad) as "Cantidad total vendido" from ventas group by producto_id having sum(cantidad)>5 order by sum(cantidad) asc;

-- Selecciona los empleados que tengan una “o” en su nombre o apellido y agrúpalos por 
-- departamento y muestra los que tengan el salario máximo.
select departamentos_id, max(salario) from (select nombre,apellido, departamentos_id, salario from empleados where nombre or apellido like "%o%" or "o%" or "%o") as tabla_1 group by departamentos_id;
select departamentos_id, max(salario) from empleados where nombre or apellido like "%o%" or "o%" or "%o" group by departamentos_id having max(salario)=max(salario);