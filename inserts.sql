INSERT INTO Produtos(quantidade, validade, nome_Produto, preco, Produtores_idProdutores) VALUES (4, '2029-05-07', 'Asquálio', 49.90, 12);
INSERT INTO Produtos(quantidade, validade, nome_Produto, preco, Produtores_idProdutores) VALUES (5, '2028-20-05', 'Brema', 68.00, 23);
INSERT INTO Produtos(quantidade, validade, nome_Produto, preco, Produtores_idProdutores) VALUES (2, '2032-08-03', 'Lúcio', 69.99, 27);


INSERT INTO Produtores(nomeNegocio, Nome, Usuarios_idUsuarios, Enderecos_idEnderecos) VALUES (?, ?, ?, ?);

INSERT INTO Produtores(nomeNegocio, Nome, Usuarios_idUsuarios, Enderecos_idEnderecos) VALUES 
('Joao', 'Jao Pedro Gonsalves', 4, 2), 
('Kanepe', 'Pedro Argentino', 5, 10), 
('Peixes Sao Luiz', 'Matheus Dos Santos Williams', 67, 44);


INSERT INTO vendas(quantidade, produtores_idProdutores, clientes_idClientes) VALUES (?, ?, ?);

INSERT INTO vendas(quantidade, produtores_idProdutores, clientes_idClientes) VALUES (27, 123, 456);
INSERT INTO vendas(quantidade, produtores_idProdutores, clientes_idClientes) VALUES (13, 789, 132);
INSERT INTO vendas(quantidade, produtores_idProdutores, clientes_idClientes) VALUES (64, 345, 865);

INSERT INTO Carrinho(Vendas_Id, Produtos_id) VALUES(?, ?);

INSERT INTO Carrinho(Vendas_Id, Produtos_id) VALUES(156, 32);
INSERT INTO Carrinho(Vendas_Id, Produtos_id) VALUES(78, 37);
INSERT INTO Carrinho(Vendas_Id, Produtos_id) VALUES(98, 48);
 
INSERT INTO Clientes (nome_cliente, Usuarios_id, Enderecos_id, nr_casa) VALUES(?, ?, ?, ?);

INSERT INTO Clientes(nome_cliente, Usuarios_id, Enderecos_id, nr_casa) VALUES('marcos', 34, 96, 14, 1234);
INSERT INTO Clientes(nome_cliente, Usuarios_id, Enderecos_id, nr_casa) VALUES('roger', 43, 69, 41, 4321);
INSERT INTO Clientes(nome_cliente, Usuarios_id, Enderecos_id, nr_casa) VALUES('marcos', 45, 17, 25, 5678);

INSERT INTO Usuarios(idUsuarios, nome_Usario, senha_Usuario,email_Usuario) VALUES (6, 'ViniciusGamer', '456123789', 'vinicius.pn13@gmail.com');
INSERT INTO Usuarios(idUsuarios, nome_Usario, senha_Usuario,email_Usuario) VALUES (4, 'neekolynx114', 'senhafortissima444', 'neeskolyxn114@gmail.com');
INSERT INTO Usuarios(idUsuarios, nome_Usario, senha_Usuario,email_Usuario) VALUES (8, 'lezikxc', 'senhauau1795', 'lezio456@gmail.com');

INSERT INTO enderecos(idEnderecos, Cidade, Rua, Bairro) VALUES (?, ?, ?, ?);

INSERT INTO Endereco(idEnderecos, Cidade, Rua, Bairro) VALUES (1, 'Gaspar', 'Rua da Lombada', 'Centro');
Insert INTO Endereco(idEnderecos, Cidade, Rua, Bairro) VALUES (2, 'Gaspar', 'Rua de Gaspar', 'Centro');
Insert INTO Endereco(idEnderecos, Cidade, Rua, Bairro) VALUES (3, 'Blumenau', 'Rua das Flores', 'Velha');
