-- Active: 1718017360083@@127.0.0.1@3306@viagens
INSERT INTO viagens.usuarios (nome, email, data_nascimento, endereco) VALUES
  ("João Ponchiroli", "joao@gmail.com", "2006-03-27", "Rua General Osório, 1655"),
  ("Maria Santos", "maria@example.com", "1985-08-22", "Rua B, 456, Cidade Y, Estado Z"),
  ("Pedro Souza", "pedro@example.com", "1998-02-10", "Avenida C, 789, Cidade X, Estado Y");

INSERT INTO viagens.destinos (id, nome, descricao) VALUES 
(1, "Praia das Tartarugas", "Uma bela praia com areias brancas e mar cristalino"),
(2, "Cachoeira do Vale Verde", "Uma cachoeira exuberante cercada por natureza"),
(3, "Cidade Histórica de Pedra Alta", "Uma cidade rica em história e arquitetura");

INSERT INTO viagens.reservas (id, id_usuario, id_destino, data, status) VALUES 
(1, 1, 2, '2023-07-10', 'confirmada'),
(2, 2, 1, '2023-08-05', 'pendente'),
(3, 3, 3, '2023-09-20', 'cancelada');

SELECT * FROM destinos
