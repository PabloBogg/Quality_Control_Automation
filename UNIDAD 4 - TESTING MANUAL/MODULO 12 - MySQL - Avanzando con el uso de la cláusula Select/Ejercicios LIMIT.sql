-- Ejercicios LIMIT

-- Muestra los 5 productos más caros de la tabla "productos".
select * from productos order by precio desc limit 5;

-- Muestra los 10 primeros empleados en orden alfabético por apellido.
select * from empleados order by apellido asc limit 10;

-- Muestra las 3 ventas con el monto total más alto.
select * from ventas order by monto_total desc limit 3;