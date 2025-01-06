-- EJERCICIOS CON FUNCIÓN  GROUP BY()

-- Agrupa las ventas por cliente y muestra el monto total gastado por cada cliente.
select cliente_id, sum(monto_total) from ventas group by cliente_id;
-- Encuentra el salario máximo por departamento.
select departamentos_id, max(salario) from empleados group by departamentos_id;
-- Encuentra el salario mínimo por departamento.
select departamentos_id, min(salario) from empleados group by departamentos_id;
-- Obtén la suma total de salarios por departamento.
select departamentos_id, sum(salario) from empleados group by departamentos_id;
-- Encuentra la cantidad total de productos vendidos por empleado.
select empleado_id, sum(cantidad) from ventas group by empleado_id;

-- EJERCICIOS CON FUNCIÓN  HAVING()

-- Encuentra los departamentos con al menos 2 empleados con una edad menor de 30 años.
select departamentos_id, count(*) "cantidad" from empleados where edad<30 group by departamentos_id having cantidad>2;  
-- Muestra los clientes que han gastado más de $2,000 en total en compras.
select cliente_id, sum(monto_total) "total_en_compras" from ventas group by cliente_id having total_en_compras>2000;