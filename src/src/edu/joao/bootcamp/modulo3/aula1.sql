-- Active: 1718017360083@@127.0.0.1@3306@viagens
CREATE TABLE usuarios (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(255) NOT NULL COMMENT 'Nome do Usuario',
  email VARCHAR(100) NOT NULl UNIQUE COMMENT 'Email do Usuario',
  endereco VARCHAR(50) NOT NULL COMMENT 'Endereco do Usuario',
  data_nascimento DATE NOT NULL COMMENT 'Data de Nascimento do Usuario'
)

CREATE TABLE viagens.destinos (
  id INT,
  nome VARCHAR(255) NOT NULL UNIQUE COMMENT 'Nome do destino',
  descricao VARCHAR(255) NOT NULL COMMENT 'Descrição do destino'
);

CREATE TABLE viagens.reservas (
  id INT COMMENT 'Identificador único da reserva',
  id_usuario INT COMMENT 'Referência ao ID do usuário que fez a reserva',
  id_destino INT COMMENT 'Referência ao ID do destino da reserva',
  data DATE COMMENT 'Data da reserva',
  status VARCHAR(255) DEFAULT 'pendente' COMMENT 'Status da reserva (confirmada, pendente, cancelada, etc.)'
);