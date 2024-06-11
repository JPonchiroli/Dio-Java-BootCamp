-- Active: 1718017360083@@127.0.0.1@3306@viagens
ALTER TABLE destinos
MODIFY COLUMN id INT AUTO_INCREMENT,
ADD PRIMARY KEY (id);

ALTER TABLE reservas
MODIFY COLUMN id INT AUTO_INCREMENT,
ADD PRIMARY KEY (id);

ALTER TABLE reservas
ADD CONSTRAINT fk_reservas_usuarios
FOREIGN KEY (id_usuario) REFERENCES usuarios (id);

ALTER TABLE reservas
ADD CONSTRAINT fk_reservas_destino
FOREIGN KEY (id_destino) REFERENCES destinos (id);