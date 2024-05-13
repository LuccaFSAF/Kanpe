Select * from Endereco;
<<<<<<< Updated upstream
Select * from Produtos;
Select * from Produtores;
Select * from Vendas;
Select * from Usuarios;
Select * from Clientes;
Select * from Carrinho;
=======

Select Clientes.idUsuarios, Usuarios.idUsuarios from Clientes inner join Usuarios on Clientes.idUsuarios = Usuarios.idUsuarios;
>>>>>>> Stashed changes

Select Clientes.idEnderecos, Enderecos.idEnderecos 
from Clientes
inner join Enderecos
on Clientes.idEnderecos = Enderecos.idEnderecos;

Select Produtores.idUsuarios, Usuarios.idUsuarios 
from Produtores
inner join Usuarios
on Produtores.idUsuarios = Usuarios.idUsuarios;

Select Produtores.idUsuarios, Enderecos.idEnderecos 
from Produtores
inner join Enderecos
on Produtores.idUsuarios = Enderecos.idEnderecos;

Select Vendas.idProdutores, Produtores.idProdutores
from Vendas
inner join Produtores
on Vendas.idProdutores = Produtores.idProdutores;

Select Vendas.idClientes, Clientes.idClientes
from Vendas
inner join Clientes
on Vendas.idClientes = Clientes.idClientes;

Select Produtos.idProdutores, Produtores.idProdutores
from Produtos
inner join Produtores
on Produtos.idProdutores = Produtores.idProdutores;

Select Carrinho.idVendas, Vendas.idVendas
from Carrinho
inner join Vendas
on Carrinho.idVendas = Vendas.idVendas;