CREATE TABLE usuarios_novos (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(255) NOT NULL COMMENT 'Nome do Usuario',
  email VARCHAR(100) NOT NULl UNIQUE COMMENT 'Email do Usuario',
  endereco VARCHAR(50) NOT NULL COMMENT 'Endereco do Usuario',
  data_nascimento DATE NOT NULL COMMENT 'Data de Nascimento do Usuario'
)

INSERT INTO usuarios_novos
SELECT * FROM usuarios

DROP TABLE usuarios

ALTER TABLE usuarios_novos RENAME usuarios

ALTER TABLE usuarios MODIFY COLUMN endereco VARCHAR(100)