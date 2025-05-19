-- Ejercicios AS

-- Crea una consulta que muestre el salario de los empleados junto con el salario 
-- aumentado en un 10% nombrando a la columna como “Aumento del 10%”.
select salario, salario*1.1 as "Aumento del 10%" from empleados; 

-- Crea una consulta que calcule el monto total de las compras realizadas por cliente y 
-- que la columna se llame “Monto total gastado”.
select * from ventas;
select cliente_id, sum(monto_total) as "Monto total gastado" from ventas group by cliente_id;   

-- Muestra los nombres completos de los empleados concatenando los campos "nombre" y "apellido" 
-- y que la columna se llame “Nombre y apellido”. Recuerda el uso de la función CONCAT(texto1, texto2, texto3).
select concat(nombre," ",apellido) "Nombre y apellido" from empleados;
