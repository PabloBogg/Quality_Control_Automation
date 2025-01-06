use mi_db;
create table clientes (id int auto_increment primary key,nombre varchar(50),direccion varchar(100));
create table productos (id int auto_increment primary key,nombre varchar(50),precio decimal(10,2),empleado_id int);
alter table productos drop empleado_id;
create table ventas (id int auto_increment primary key,producto_id int,cliente_id int,cantidad int,precio_unitario decimal(10,2),monto_total decimal(10,2),empleado_id int);
alter table ventas add foreign key (producto_id) references productos(id);
alter table ventas add foreign key (cliente_id) references clientes(id);
alter table ventas add foreign key (empleado_id) references empleados(id);

-- Inserta un nuevo cliente en la tabla "clientes" con el nombre "Juan Pérez" y la dirección "Libertad 3215, Mar del Plata"
insert into clientes (nombre,direccion) values ('Juan Perez',"Libertad 3215, Mar del Plata");

-- Inserta un nuevo producto en la tabla "productos" con el nombre "Laptop" y un precio de 1200.00 .
insert into productos (nombre,precio) values ("Laptop",1200.00);

-- Modifica la columna monto_total de la tabla ventas para que por defecto sea el resultado 
-- de multiplicar la cantidad por el precio del producto_id
alter table ventas modify monto_total decimal(10,2) default (cantidad*precio_unitario);
ALTER TABLE ventas MODIFY monto_total decimal(10,2) GENERATED ALWAYS AS (cantidad*precio_unitario) STORED;

-- Crea una venta en la tabla "ventas" donde el cliente "Juan Pérez" compra "Laptop" 
-- por una cantidad de 2 unidades y el vendedor tenga el nombre “Ana" y apellido "Rodriguez”.
--  Ten en cuenta que debes “tener” los ID y valores correspondientes previamente, luego 
-- aprenderemos a recuperarlos con subconsultas.
insert into ventas (producto_id,cliente_id,cantidad,precio_unitario,empleado_id) values (1,1,2,1200,5);

-- Haz una consulta simple de los datos de la tabla ventas y verifica que se presente 
-- de la siguiente manera:
select * from ventas;
