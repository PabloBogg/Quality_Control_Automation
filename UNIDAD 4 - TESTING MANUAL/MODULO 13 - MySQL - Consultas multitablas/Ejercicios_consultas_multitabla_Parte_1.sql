use mi_db;
-- -------------------------------------------
-- Ejercicios consultas multitabla  - Parte 1
-- -------------------------------------------

-- Une las tablas de empleados con departamentos y solo muestra las columnas nombre, 
-- apellido, edad, salario de empleados y la columna nombre de departamentos. 
select e.nombre, e.apellido, e.edad, e.salario, d.nombre
from empleados as e, departamentos as d where e.departamentos_id= d.id;


-- Une las tablas ventas con la tabla empleados donde se muestren todas las columnas de 
-- ventas exceptuando la columna empleado_id y en su lugar muestres el nombre y apellido de 
-- la tabla empleados.
select v.id,  v.producto_id, v.cliente_id, v.cantidad, v.precio_unitario, v.monto_total, 
concat(e.nombre," ",e.apellido) as "Nombre_Apellido"
from ventas as v, empleados as e where v.empleado_id=e.id;

-- Une las tablas ventas con la tabla productos donde se muestren todas las columnas de 
-- ventas exceptuando la columna producto_id y en su lugar muestres la columna nombre de la 
-- tabla productos.
select v.id, v.cliente_id, v.cantidad, v.precio_unitario, v.monto_total, v.empleado_id, p.nombre 
from ventas as v, productos as p where v.producto_id=p.id;

-- Une las tablas ventas con la tabla clientes donde se muestren todas las columnas de 
-- ventas exceptuando la columna cliente_id y en su lugar muestres la columna nombre de la 
-- tabla clientes.
select v.id, v.producto_id, v.cantidad, v.precio_unitario, v.monto_total, v.empleado_id, c.nombre 
from ventas as v, clientes as c where v.cliente_id=c.id;

-- Une las tablas ventas con la tablas empleados y departamentos donde se muestren todas 
-- las columnas de ventas exceptuando la columna empleado_id y en su lugar muestres el nombre 
-- y apellido de la tabla empleados y además muestres la columna nombre de la tabla departamentos.
select v.id,  v.producto_id, v.cliente_id, v.cantidad, v.precio_unitario, v.monto_total, 
concat(tabla_1.nombre, " ",tabla_1.apellido) as "Nombre Apellido", tabla_1.nombre_d 
from ventas as v, (select e.id, e.nombre, e.apellido, d.nombre as nombre_d
from empleados as e, departamentos as d where e.departamentos_id= d.id) as tabla_1 where v.empleado_id=tabla_1.id;

select v.id,  v.producto_id, v.cliente_id, v.cantidad, v.precio_unitario, v.monto_total, 
concat(e.nombre, " ",e.apellido) as "Nombre Apellido", d.nombre as Departamento
from ventas as v, empleados as e, departamentos as d where e.departamentos_id= d.id and v.empleado_id=e.id;

-- Une las tablas ventas, empleados, productos y clientes donde se muestren las columnas 
-- de la tabla ventas reemplazando sus columnas de FOREIGN KEYs con las respectivas columnas 
-- de “nombre” de las otras tablas.
select 
v.id, v.cantidad, v.precio_unitario, v.monto_total, 
concat(e.nombre, " ",e.apellido) as Empleado, 
d.nombre as Departamento,
c.nombre as Cliente,
p.nombre as Producto
from 
ventas 			as v, 
empleados 		as e, 
departamentos 	as d, 
clientes 		as c, 
productos 		as p 
where 
e.departamentos_id= d.id 	and 
v.empleado_id=e.id			and
e.departamentos_id= d.id 	and
v.cliente_id=c.id 			and
v.producto_id=p.id;

-- Calcular el salario máximo de los empleados en cada departamento y mostrar el nombre 
-- del departamento junto con el salario máximo.
select d.nombre as Departamento, max(e.salario) as Salario_Maximo from empleados as e, departamentos as d 
where e.departamentos_id= d.id group by Departamento;