INSERT INTO regiones (id, nombre) VALUES (1, 'Sudamérica');
INSERT INTO regiones (id, nombre) VALUES (2, 'Centroamérica');
INSERT INTO regiones (id, nombre) VALUES (3, 'Norteamérica');
INSERT INTO regiones (id, nombre) VALUES (4, 'Europa');
INSERT INTO regiones (id, nombre) VALUES (5, 'Asia');
INSERT INTO regiones (id, nombre) VALUES (6, 'Africa');
INSERT INTO regiones (id, nombre) VALUES (7, 'Oceanía');
INSERT INTO regiones (id, nombre) VALUES (8, 'Antártida');

INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (1, 'John', 'Gonzalez', 'dagon@gmail.com','2018-08-14');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (2, 'Alejandro', 'Jaramillo', 'alejo@gmail.com','2015-09-09');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (4, 'David', 'Restrepo', 'david@gmail.com','2015-06-17');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (4, 'Andres', 'Arias', 'andres@gmail.com','2015-09-19');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (4, 'Cristiano', 'Giordany', 'cristiano@gmail.com','2017-08-08');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (3, 'Ronaldo', 'Nasario', 'ronaldo@gmail.com','2016-05-07');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (3, 'Elkin', 'Guzman', 'elkin@gmail.com','2016-04-18');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (3, 'Jairo', 'Rengifo', 'jairo@gmail.com','2015-03-09');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (3, 'Dario', 'Medina', 'dario@gmail.com','2015-02-04');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (5, 'Camilo', 'Gonzalez', 'camilo@gmail.com','2015-01-15');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (6, 'John', 'Gonzalez', 'dagon@gmail.com','2018-08-14');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (7, 'Alejandro', 'Jaramillo', 'alejo@gmail.com','2015-09-09');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (8, 'John', 'Gonzalez', 'dagon@gmail.com','2018-08-14');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (1, 'Alejandro', 'Jaramillo', 'alejo@gmail.com','2015-09-09');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (2, 'David', 'Restrepo', 'david@gmail.com','2015-06-17');



INSERT INTO `usuarios` (username, password, enabled) VALUES ('andres','$2a$10$AcUuanrrfjyB3D0QCKxIoerkgbPtiyrCFIBq1bnzyNkOfysLc7AIK', 1);
INSERT INTO `usuarios` (username, password, enabled) VALUES ('admin','$2a$10$hzJm5VkUeLF00Yyp2EDIAOouO0MwVYVN3l5WvwV4RJwGvv5Rl5MEi', 1);

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 1); 



