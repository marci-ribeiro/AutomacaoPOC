#language: pt

@Pesquisa
Funcionalidade: 001 - Acessar site Le Livros e realizar pesquisa
  Como usuário necessito acessar o site Le Livros
  Para realizar pesquisas de livros

  Cenario: CT001.001 - Acessar site Le Livros e realizar pesquisa de um livro
    Dado que eu acesse a url "http://lelivros.love"
    Quando buscar o livro
      |   LIVRO                                    |
      |   O voo da bailarina                       |
    Entao eu encontro a opcao de baixar ou ler online para selecionar

