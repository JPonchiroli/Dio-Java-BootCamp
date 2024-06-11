-- Active: 1718017360083@@127.0.0.1@3306@viagens
UPDATE usuarios
set email = "teste@gmail.com"
where id = 3;

DELETE FROM destinos
where nome = "Praia das Tartarugas"