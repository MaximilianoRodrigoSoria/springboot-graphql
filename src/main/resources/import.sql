INSERT INTO cliente (nombre, apellido, email) VALUES('Maximiliano', 'Soria', 'max@gmail.com');
INSERT INTO cliente (nombre, apellido, email) VALUES('Yesica', 'Contrera', 'Yes@gmail.com');
INSERT INTO cliente (nombre, apellido, email) VALUES('Camila', 'Toledo', 'cam@gmail.com');

INSERT INTO producto (nombre, descripcion, precio) VALUES('Pilas', 'Pilas Enegicer',  35.0);
INSERT INTO producto (nombre, descripcion, precio) VALUES('Reloj', 'Casio', 500.00);
INSERT INTO producto (nombre, descripcion, precio) VALUES('Perfumante', 'Perfumante de tela', 300.00);

INSERT INTO compra (id, cantidad, date ,status,id_cliente,id_producto) VALUES(1, 50, NOW(), 'OK', 1,1);
INSERT INTO compra (id, cantidad, date ,status,id_cliente,id_producto) VALUES(2, 50, NOW(), 'OK', 1,2);
INSERT INTO compra (id, cantidad, date ,status,id_cliente,id_producto) VALUES(3, 50, NOW(), 'OK', 1,3);
INSERT INTO compra (id, cantidad, date ,status,id_cliente,id_producto) VALUES(4, 50, NOW(), 'OK', 2,2);
INSERT INTO compra (id, cantidad, date ,status,id_cliente,id_producto) VALUES(5, 50, NOW(), 'OK', 3,1);
INSERT INTO compra (id, cantidad, date ,status,id_cliente,id_producto) VALUES(6, 50, NOW(), 'OK', 3,3);