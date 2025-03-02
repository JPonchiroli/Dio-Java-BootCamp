-- Active: 1718017360083@@127.0.0.1@3306@viagens
SELECT * FROM usuarios us
INNER JOIN reservas rs ON us.id = rs.id_usuario
INNER JOIN destinos ds ON rs.id_destino = ds.id

INSERT INTO viagens.destinos ( nome, descricao) VALUES 
('Deestino sem reserva', 'Uma bela praia com areias brancas e mar cristalino')

SELECT * FROM reservas rs
RIGHT JOIN destinos des ON des.id = rs.id_destino;

SELECT * FROM destinos des
LEFT JOIN reservas rs ON des.id = rs.id_destino;

SELECT nome
FROM usuarios
WHERE id NOT IN (SELECT id_usuario FROM reservas);


SELECT nome
FROM destinos
WHERE id NOT IN (SELECT id_destino FROM reservas)
ORDER BY id;

SELECT nome, (SELECT COUNT(*) FROM reservas WHERE id_usuario = usuarios.id) AS total_reservas
FROM usuarios;
