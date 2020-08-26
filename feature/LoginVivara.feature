#language: pt

@LoginVivara
Funcionalidade: 003 - Realizar Login no site Vivara
  Como usuário necessito realizar Login no site Vivara
  Para realizar compras no site

  Cenario: CT003.001 Login site Vivara
    Dado que eu acesse a url vivara "https://www.vivara.com.br/login"
    Quando preencher login
    |USER            |SENHAENTRAR     |
    | Mila           |     123452           |
    Quando seleciono entrar
    Entao realizo login com sucesso


