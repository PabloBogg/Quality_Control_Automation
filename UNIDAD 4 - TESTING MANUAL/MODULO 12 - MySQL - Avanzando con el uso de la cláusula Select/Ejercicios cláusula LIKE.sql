-- Ejercicios cláusula LIKE


-- Encuentra los empleados cuyos nombres comienzan con "L".
select * from empleados where nombre like "l%";

-- Busca los productos cuyos nombres contengan la palabra "Teléfono".
select * from productos where nombre like "%Telefono%";

-- Encuentra los clientes cuyas direcciones contienen la palabra "Calle".
select * from clientes where direccion like "%calle%";