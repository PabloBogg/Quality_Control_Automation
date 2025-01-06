 -- ---------------------------
 -- Ejercicios: Cláusula BETWEEN
  -- ---------------------------
 -- Encuentra a los empleados cuyas edades están entre 29 y 33 años. 
 -- Muestra el nombre y la edad de los registros que cumplan esa condición. 
select nombre,edad from empleados where edad between 29 and 33;

 -- Encuentra las ventas donde la cantidad de productos vendidos esté entre 2 y 3.
select * from ventas where cantidad between 2 and 3;

 -- Muestra las ventas donde el precio unitario esté entre $300.00 y $500.00.
 select * from ventas where precio_unitario between 300 and 500;