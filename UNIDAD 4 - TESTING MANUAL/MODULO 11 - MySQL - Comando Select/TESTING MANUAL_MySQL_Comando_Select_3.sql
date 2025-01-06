-- ----------------------------
-- Ejercicios: Cláusula DISTINCT
-- ----------------------------

-- Lista los nombres de los empleados sin duplicados
select distinct nombre from empleados;

-- Obtén una lista de correos electrónicos únicos de todos los empleados.
select distinct correo_electronico from empleados;

-- Encuentra la lista de edades distintas entre los empleados.
select distinct edad from empleados;