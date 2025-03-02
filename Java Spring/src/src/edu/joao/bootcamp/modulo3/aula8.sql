-- Active: 1718017360083@@127.0.0.1@3306@viagens
SELECT COUNT(*) FROM usuarios;

SELECT AVG(TIMESTAMPDIFF(YEAR, data_nascimento, CURRENT_DATE())) AS idade
FROM usuarios;

SELECT SUM(TIMESTAMPDIFF(YEAR, data_nascimento, CURRENT_DATE())) AS media_idade
FROM usuarios;

SELECT MIN(TIMESTAMPDIFF(YEAR, data_nascimento, CURRENT_DATE())) AS media_idade
FROM usuarios;

SELECT MAX(TIMESTAMPDIFF(YEAR, data_nascimento, CURRENT_DATE())) AS media_idade
FROM usuarios;

SELECT *, COUNT(*) AS total_reservas FROM reservas GROUP BY id_destino ;


SELECT *, COUNT(*) AS total_reservas FROM reservas GROUP BY id_destino LIMIT 1 OFFSET 2;

SELECT *, COUNT(*) AS total_reservas FROM reservas GROUP BY id_destino LIMIT 1;

SELECT nome
FROM usuarios
ORDER BY nome;

SELECT nome, data_nascimento
FROM usuarios
ORDER BY data_nascimento, nome;

SELECT nome, data_nascimento
FROM usuarios
ORDER BY data_nascimento, nome DESC;