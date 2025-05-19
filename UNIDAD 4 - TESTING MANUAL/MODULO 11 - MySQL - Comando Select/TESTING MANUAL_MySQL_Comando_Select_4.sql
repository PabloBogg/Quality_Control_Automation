use mi_db;
-- -------------------------------------
--  Ejercicios: Operadores relacionales
-- -------------------------------------

-- Muestra los nombres de los empleados que tienen un salario superior a $3200.
select nombre from empleados where salario>3200;

-- Obtén una lista de empleados que tienen 28 años de edad.
select nombre from empleados where edad=28;

-- Lista a los empleados cuyos salarios sean menores a $2700.
select nombre from empleados where salario<2700;

-- Encuentra todas las ventas donde la cantidad de productos vendidos sea mayor que 2.
select * from ventas where cantidad >2;

-- Muestra las ventas donde el precio unitario sea igual a $480.00.
select * from ventas where precio_unitario=480;

-- Obtén una lista de ventas donde el monto total sea menor que $1000.00.
select * from ventas where monto_total<1000;

-- Encuentra las ventas realizadas por el empleado con el ID 1.
select * from ventas where empleado_id=5;