# OrdemAlfabetica.java
Este projeto em Java implementa um sistema simples de cadastro e gerenciamento de clientes. O programa permite:

Cadastrar vários clientes

Armazenar nome e montante de vendas

Exibir os dados cadastrados

Calcular o total de vendas

Ordenar os clientes em ordem alfabética

Exibir os dados do último cliente após a ordenação

O sistema é executado via console.

Estrutura do Projeto

O projeto é composto por duas classes:

1. Cliente.java

Classe responsável por representar a entidade Cliente.

Atributos

nome (String): Nome do cliente

montanteVendas (float): Valor total de vendas do cliente

Métodos

setNome(String nome)

getNome()

setMontanteVendas(float montanteVendas)

getMontanteVendas()

toString(): Retorna uma representação textual do cliente

2. DemoCliente.java

Classe principal responsável pela execução do programa.

Funcionalidades

Solicita ao usuário a quantidade de clientes.

Lê os dados (nome e montante de vendas) de cada cliente.

Armazena os clientes em um vetor.

Exibe os dados cadastrados.

Calcula e exibe a soma total dos montantes de vendas.

Ordena os clientes em ordem alfabética pelo nome.

Exibe a lista ordenada.

Mostra os dados do último cliente após a ordenação.

Entre com a quant de clientes:
2

========Entrada de Dados========
Dados do cliente: 1:
Nome:
Ana
Montantes de vendas:
1500

Dados do cliente: 2:
Nome:
Carlos
Montantes de vendas:
2300

=== Impressão de dados ===

Dados do Cliente 1:
Nome: Ana
MontanteVendas: 1500.0

Dados do Cliente 2:
Nome: Carlos
MontanteVendas: 2300.0

====Soma do Montante de Vendas dos Clientes ===
Resultado total do montante de vendas: 3800.0

=== Ordem alfabetica dos Clientes ===
...

=========Dados do ultimo Cliente=======
...
