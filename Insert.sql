INSERT INTO Produtos(quantidade, validade, nome_Produto, preco, Produtores_idProdutores) VALUES (?, ?, ?, ?, ?);

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

INSERT INTO Carrinho(Vendas_Id, Produtos_id) VALUE(156, 32);
INSERT INTO Carrinho(Vendas_Id, Produtos_id) VALUE(78, 37);
INSERT INTO Carrinho(Vendas_Id, Produtos_id) VALUE(98, 48);
 
INSERT INTO Clientes (nome_cliente, Usuarios_id, Enderecos_id, nr_casa) VALUES(?, ?, ?, ?);

INSERT INTO Clientes(nome_cliente, Usuarios_id, Enderecos_id, nr_casa) VALUES('marcos', 34, 96, 14, 1234);
INSERT INTO Clientes(nome_cliente, Usuarios_id, Enderecos_id, nr_casa) VALUES('roger', 43, 69, 41, 4321);
INSERT INTO Clientes(nome_cliente, Usuarios_id, Enderecos_id, nr_casa) VALUES('marcos', 45, 17, 25, 5678);

insert into Usuarios(idUsuarios, nome_Usario, senha_Usuario,email_Usuario) values (?, ?, ?, ?);

insert into enderecos(idEnderecos, Cidade, Rua, Bairro) values (?, ?, ?, ?);
