#language: pt
#author: Marcos Barbosa
#date: 21/03/2022


Funcionalidade: Compras
  @bug_login
  Cenario: Validar fechamento de pedido com sucesso
    Dado que o cliente esteja logado no app
    E que o cliente realize a busca do produto "cold life"
    E adicionar o produto ao carrinho
    Quando finalizar a compra com "boleto"
    Entao deve visualizar o número do pedido gerado com sucesso

  @smoke_test
  Cenario: Validar fechamento de pedido com sucesso
    Dado que o cliente realize a busca do produto "cold life"
    Quando adicionar o produto ao carrinho
    Entao deve visualizar os detelhes do produto na sacola