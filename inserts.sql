INSERT INTO Produtores(nomeNegocio, Nome, Usuarios_idUsuarios, Enderecos_idEnderecos) VALUES (?, ?, ?, ?);
INSERT INTO vendas(quantidade, produtores_idProdutores, clientes_idClientes) VALUES (?, ?, ?);
INSERT INTO Carrinho(Vendas_Id, Produtos_id) VALUES(?, ?);
INSERT INTO Clientes (nome_cliente, Usuarios_id, Enderecos_id, nr_casa) VALUES(?, ?, ?, ?);
INSERT INTO enderecos(idEnderecos, Cidade, Rua, Bairro) VALUES (?, ?, ?, ?);


INSERT INTO Enderecos(Cidade, Rua, Bairro) VALUES ('Gaspar', 'Rua da Lombada', 'Centro');
Insert INTO Enderecos(Cidade, Rua, Bairro) VALUES ('Gaspar', 'Rua de Gaspar', 'Centro');
Insert INTO Enderecos(Cidade, Rua, Bairro) VALUES ('Blumenau', 'Rua das Flores', 'Velha');

INSERT INTO Usuarios(nome_Usuario, senha_Usuario, email_Usuario) VALUES ('ViniciusGamer', '456123789', 'vinicius.pn13@gmail.com');
INSERT INTO Usuarios(nome_Usuario, senha_Usuario, email_Usuario) VALUES ('neekolynx114', 'senhafortissima444', 'neeskolyxn114@gmail.com');
INSERT INTO Usuarios(nome_Usuario, senha_Usuario, email_Usuario) VALUES ('lezikxc', 'senhauau1795', 'lezio456@gmail.com');

INSERT INTO Clientes(nome_cliente, Usuarios_idUsuarios, Enderecos_idEnderecos, nr_casa) VALUES('marcos', 1, 3, 1234);
INSERT INTO Clientes(nome_cliente, Usuarios_idUsuarios, Enderecos_idEnderecos, nr_casa) VALUES('roger', 2, 2, 4321);
INSERT INTO Clientes(nome_cliente, Usuarios_idUsuarios, Enderecos_idEnderecos, nr_casa) VALUES('marcos', 3, 1, 5678);

INSERT INTO Produtores(nomeNegocio, Nome, Usuarios_idUsuarios, Enderecos_idEnderecos) VALUES 
('Joao', 'Jao Pedro Gonsalves', 3, 1), 
('Kanepe', 'Pedro Argentino', 2, 2), 
('Peixes Sao Luiz', 'Matheus Dos Santos Williams', 1, 3);

INSERT INTO Produtos(quantidade, validade, nome_Produto, preco, Produtores_idProdutores) VALUES (4, '2029-05-07', 'Asquálio', 49.90, 1);
INSERT INTO Produtos(quantidade, validade, nome_Produto, preco, Produtores_idProdutores) VALUES (5, '2028-09-20', 'Brema', 68.00, 2);
INSERT INTO Produtos(quantidade, validade, nome_Produto, preco, Produtores_idProdutores) VALUES (2, '2032-08-03', 'Lúcio', 69.99, 3);


INSERT INTO vendas(quantidade, produtores_idProdutores, clientes_idClientes) VALUES (27, 1, 3);
INSERT INTO vendas(quantidade, produtores_idProdutores, clientes_idClientes) VALUES (13, 2, 2);
INSERT INTO vendas(quantidade, produtores_idProdutores, clientes_idClientes) VALUES (64, 3, 1);

INSERT INTO Carrinho(Vendas_IdVendas, Produtos_idProdutos) VALUES(1, 3);
INSERT INTO Carrinho(Vendas_IdVendas, Produtos_idProdutos) VALUES(2, 2);
INSERT INTO Carrinho(Vendas_IdVendas, Produtos_idProdutos) VALUES(3, 1);






