#language: pt

@Cadastro
Funcionalidade: 002 - Acessar site e realizar cadastro
  Como usuário necessito realizar cadastro
  Para realizar login e utilizar o sistema

#massa de CPF e CEP encontrada no site 4Devs
#para cadastro de maior quantidade, aumentar a lista no dataTable:
Cenario: CT002.001 - realizar cadastro
  Dado que eu acesse a url vivara "https://www.vivara.com.br/login"
  Quando selecionar Novo Cadastro
  E realizar cadastro
  E preencher dados
    |   CPF           |NOME    |SOBRENOME  |CELULAR      |DATADENASC    |
    |   73272116087   |Carla   |Almeida    |11964507977  |25071990      |
  E seleciono Proximo
  E preencho dados de endereço
    |   CEP          |NUMERO  |COMPLEMENTO     |
    |   70830011     |1500    |casa 2          |
  E seleciono Proximo
  E preencho dados de contato
    |   EMAIL                      |SENHA       |CONFIRMARSENHA    |
    |   carlaAlm1@hotmail.com      |teste2001   |teste2001       |
  Entao Conclui cadastro com sucesso