use mi_db;
-- Inserta un nuevo producto en la tabla "productos" con el nombre "Teléfono móvil" y un precio de 450.00.
insert into productos (nombre, precio) values ("Teléfono móvil",450.00);

-- Inserta un nuevo cliente en la tabla "clientes" con el nombre "María García" 
-- y la dirección "Constitución 456, Luján".
insert into clientes (nombre,direccion) values("María García","Constitución 456, Luján");

-- Modifica la columna correo_electronico de la tabla empleados para que se genere automáticamente 
-- concatenado el nombre, apellido y el string “@mail.com” (Recuerda usar la cláusula “GENERATED ALWAYS AS 
-- (expresion) STORED”.Para concatenar textos puedes usar la función “concat(texto1, texto2, texto3, …)”)
alter table empleados modify correo_electronico varchar(100) GENERATED ALWAYS AS (concat(nombre,apellido,"@mail.com")) STORED;
describe empleados;

-- Inserta un nuevo empleado en la tabla "empleados" con el nombre "Luis” y apellido “Fernández", 
-- edad 28, salario 2800.00 y que pertenezca al departamento “ventas”. 
insert into empleados (nombre, apellido,edad,salario,departamentos_id) values ("Luis","Fernández",28,2800.00,1);

 -- Actualiza el precio del producto "Laptop" a 1350.00 en la tabla "productos". 
 UPDATE productos SET precio = 1350.00 WHERE nombre = 'Laptop';
 set sql_safe_updates=0;
 
 -- Modifica la dirección del cliente "Juan Pérez" a "Alberti 1789, Mar del Plata" en la tabla "clientes".
 update clientes set direccion="Alberti 1789, Mar del Plata" where nombre="Juan Pérez";
 
 -- Incrementa el salario de todos los empleados en un 5% en la tabla "empleados".
 UPDATE empleados SET salario = salario * 1.05;
 
 -- Inserta un nuevo producto en la tabla "productos" con el nombre "Tablet" y un precio de 350.00.
 insert into productos (nombre,precio) values("Tablet",350.00);
 
 -- Inserta un nuevo cliente en la tabla "clientes" con el nombre "Ana López" 
 -- y la dirección "Beltrán 1452, Godoy Cruz". 
 insert into clientes (nombre,direccion) values ("Ana López","Beltrán 1452, Godoy Cruz");
 
 -- Inserta un nuevo empleado en la tabla "empleados" con el nombre "Marta", apellido "Ramírez",
 -- edad 32, salario 3100.00 y que pertenezca al departamento “ventas”. 
 insert into empleados (nombre, apellido,edad,salario,departamentos_id) values ("Marta","Ramírez",32,3100.00,1);

-- Actualiza el precio del producto "Teléfono móvil" a 480.00 en la tabla "productos".
update productos set precio=480.00 where nombre="Teléfono móvil";

-- Modifica la dirección del cliente "María García" a "Avenida 789, Ciudad del Este" en la tabla "clientes". 
 update clientes set direccion="Avenida 789, Ciudad del Este" where nombre="María García";
 
 -- Incrementa el salario de todos los empleados en el departamento de "Ventas" en un 
 -- 7% en la tabla "empleados". 
 UPDATE empleados SET salario = salario * 1.07 WHERE departamentos_id =(SELECT id FROM departamentos WHERE nombre = 'Ventas');
 
 -- Inserta un nuevo producto en la tabla "productos" con el nombre "Impresora" y un precio de 280.00.
 insert into productos (nombre,precio) values("Impresora",280.00);
 
 -- Inserta un nuevo cliente en la tabla "clientes" con el nombre "Carlos Sánchez" y 
 -- la dirección "Saavedra 206, Las Heras". 
 insert into clientes (nombre,direccion) values ("Carlos Sánchez","Saavedra 206, Las Heras");
 
 -- Inserta un nuevo empleado en la tabla "empleados" con el nombre "Lorena", apellido 
 -- "Guzmán", edad 26, salario 2600.00 y que pertenezca al departamento “ventas”. 
 insert into empleados (nombre, apellido,edad,salario,departamentos_id) values ("Lorena","Guzmán",26,2600.00,(SELECT id FROM departamentos WHERE nombre = 'Ventas'));

select * from empleados;
select * from clientes;
select * from productos;

