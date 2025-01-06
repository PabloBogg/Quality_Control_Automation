 use mi_db;
 -- Inserta una venta en la tabla "ventas" donde el cliente "Juan Pérez" compra una "Laptop" 
 -- con una cantidad de 2 y el vendedor tiene el nombre "Ana" y apellido "Rodríguez". 
 insert into ventas (producto_id,cliente_id,cantidad,precio_unitario,empleado_id) 
 values(
 (select id from productos where nombre='Laptop'), 
 (select id from clientes where nombre='Juan Pérez'),
 2,
 (select precio from productos where nombre='Laptop'),
 (select id from empleados where (nombre='Ana' and apellido='Rodríguez'))
 );
 
 -- Inserta una venta en la tabla "ventas" donde el cliente "María García" 
 -- compra un "Teléfono móvil" con una cantidad de 3 y el vendedor tiene el 
 -- nombre "Carlos" y apellido "López".
insert into ventas (producto_id,cliente_id,cantidad,precio_unitario,empleado_id) 
 values(
 (select id from productos where nombre='Teléfono móvil'), 
 (select id from clientes where nombre='María García'),
 3,
 (select precio from productos where nombre='Teléfono móvil'),
 (select id from empleados where (nombre='Carlos' and apellido='López'))
 );
 
 -- Crea una venta en la tabla "ventas" donde el cliente "Carlos Sánchez" compra una 
 -- "Impresora" con una cantidad de 1 y el vendedor tiene el nombre "Marta" y apellido "Ramírez".
insert into ventas (producto_id,cliente_id,cantidad,precio_unitario,empleado_id) 
 values(
 (select id from productos where nombre='Impresora'), 
 (select id from clientes where nombre='Carlos Sánchez'),
 1,
 (select precio from productos where nombre='Impresora'),
 (select id from empleados where (nombre='Marta' and apellido='Ramírez'))
 );
 
 -- Inserta una venta en la tabla "ventas" donde el cliente "Ana López" compra una 
 -- "Laptop" con una cantidad de 1 y el vendedor tiene el nombre "Carlos" y apellido "López".
insert into ventas (producto_id,cliente_id,cantidad,precio_unitario,empleado_id) 
 values(
 (select id from productos where nombre='Laptop'), 
 (select id from clientes where nombre='Ana López'),
 1,
 (select precio from productos where nombre='Laptop'),
 (select id from empleados where (nombre='Carlos' and apellido='López'))
 );
 
 -- Crea una venta en la tabla "ventas" donde el cliente "Juan Pérez" compra una 
 -- "Tablet" con una cantidad de 2 y el vendedor tiene el nombre "Luis" y apellido "Fernández".
insert into ventas (producto_id,cliente_id,cantidad,precio_unitario,empleado_id) 
 values(
 (select id from productos where nombre='Tablet'), 
 (select id from clientes where nombre='Juan Pérez'),
 2,
 (select precio from productos where nombre='Tablet'),
 (select id from empleados where (nombre='Luis' and apellido='Fernández'))
 );

 --  Inserta una venta en la tabla "ventas" donde el cliente "María García" compra un 
 -- "Teléfono móvil" con una cantidad de 1 y el vendedor tiene el nombre "Marta" y apellido "Ramírez".
 insert into ventas (producto_id,cliente_id,cantidad,precio_unitario,empleado_id) 
 values(
 (select id from productos where nombre='Teléfono móvil'), 
 (select id from clientes where nombre='María García'),
 1,
 (select precio from productos where nombre='Teléfono móvil'),
 (select id from empleados where (nombre='Marta' and apellido='Ramírez'))
 );
 
 -- Crea una venta en la tabla "ventas" donde el cliente "Carlos Sánchez" compra una 
 -- "Impresora" con una cantidad de 2 y el vendedor tiene el nombre "Lorena" y apellido "Guzmán".
  insert into ventas (producto_id,cliente_id,cantidad,precio_unitario,empleado_id) 
 values(
 (select id from productos where nombre='Impresora'), 
 (select id from clientes where nombre='Carlos Sánchez'),
 2,
 (select precio from productos where nombre='Impresora'),
 (select id from empleados where (nombre='Lorena' and apellido='Guzmán'))
 );
 
 -- Haz una consulta simple de los datos de la tabla ventas y verifica que se presente de la siguiente manera:
 select * from ventas;
 