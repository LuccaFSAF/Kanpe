INSERT INTO Produtos(quantidade, validade, nome_Produto, preco, Produtores_idProdutores) VALUES (?, ?, ?, ?, ?);

INSERT INTO Produtores(nomeNegocio, Nome, Usuarios_idUsuarios, Enderecos_idEnderecos) VALUES (?, ?, ?, ?);

INSERT INTO vendas(quantidade, produtores_idProdutores, clientes_idClientes) VALUES (?, ?, ?);

INSERT INTO vendas(quantidade, produtores_idProdutores, clientes_idClientes) VALUES (27, 123, 456);
INSERT INTO vendas(quantidade, produtores_idProdutores, clientes_idClientes) VALUES (13, 789, 132);
INSERT INTO vendas(quantidade, produtores_idProdutores, clientes_idClientes) VALUES (64, 345, 865);

INSERT INTO Carrinho(Vendas_Id, Produtos_id) VALUES(?, ?);
 
INSERT INTO Clientes (nome_cliente, Usuarios_id, Enderecos_id, nr_casa) VALUES(?, ?, ?, ?);

insert into Usuarios(idUsuarios, nome_Usario, senha_Usuario,email_Usuario) values (?, ?, ?, ?);

insert into enderecos(idEnderecos, Cidade, Rua, Bairro) values (?, ?, ?, ?);
