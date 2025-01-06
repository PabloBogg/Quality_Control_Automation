use mi_db;
-- Ejercicios cláusula ORDER BY:

-- Ordena los empleados por salario de manera ascendente.
select * from empleados order by salario ASC;

-- Ordena los productos por nombre de manera descendente.
select * from productos order by nombre DESC;

-- Ordena las ventas por cantidad de manera ascendente y luego 
-- por precio_unitario de manera descendente.
select * from ventas order by cantidad asc, precio_unitario desc;