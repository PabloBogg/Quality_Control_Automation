-- ✏️Ejercicios Función MAX() 
-- Encuentra el salario máximo de todos los empleados.
select max(salario) from empleados;
-- Encuentra la cantidad máxima de productos vendidos en una sola venta.
select max(cantidad) from ventas;
-- Encuentra la edad máxima de los empleados.
select max(edad) from empleados;


-- ✏️Ejercicios Función MIN()
-- Encuentra el salario mínimo de todos los empleados.
select min(salario) from empleados;
-- Encuentra la cantidad mínima de productos vendidos en una sola venta.
select min(cantidad) from ventas;
-- Encuentra la edad mínima de los empleados.
select min(edad) from empleados;


-- ✏️Ejercicios de la Función COUNT()
-- Cuenta cuántos empleados hay en total.
select count(id) from empleados;
-- Cuenta cuántas ventas se han realizado.
select count(*) from ventas;
-- Cuenta cuántos productos tienen un precio superior a $500.
select count(id) from productos where precio>500;


-- ✏️Ejercicios de la Función SUM()
-- Calcula la suma total de salarios de todos los empleados.
select sum(salario) from empleados;
-- Calcula la suma total de montos vendidos en todas las ventas.
select sum(monto_total) from ventas;
-- Calcula la suma de precios de productos con ID par.
select sum(precio) from productos where id%2=0;

-- ✏️Ejercicios Función AVG()
-- Calcula el salario promedio de todos los empleados.
select avg(salario) from empleados;
-- Calcula el precio unitario promedio de todos los productos.
select avg(precio) from productos;
-- Calcula la edad promedio de los empleados.
select avg(edad) from empleados;