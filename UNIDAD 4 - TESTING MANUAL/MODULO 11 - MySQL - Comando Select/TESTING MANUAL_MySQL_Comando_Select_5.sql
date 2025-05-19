use mi_db;
-- ------------------------------
-- Ejercicios: Operadores lógicos
-- ------------------------------
-- Muestra los nombres de los empleados que trabajan en el Departamento 1 y tienen un salario superior a $3000.
select nombre from empleados where departamentos_id=1 and salario>3000;

-- Lista los empleados que tienen 32 años de edad o trabajan en el Departamento 3.
select * from empleados where edad=32 or departamentos_id=3;

-- Lista las ventas donde el producto sea el ID 1 y la cantidad sea mayor o igual a 2.
select * from ventas where producto_id=1 and cantidad>=2;

-- Muestra las ventas donde el cliente sea el ID 1 o el empleado sea el ID 2.
select * from ventas where cliente_id=1 or empleado_id=2;

-- Obtén una lista de ventas donde el cliente sea el ID 2 y la cantidad sea mayor que 2.
select * from ventas where cliente_id=2 and cantidad>2;

-- Encuentra las ventas realizadas por el empleado con el ID 1 y donde el monto total sea mayor que $2000.00.
select * from ventas where empleado_id=1 and monto_total>2000;