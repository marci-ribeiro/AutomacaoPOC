#language: pt

  @APIcorreio
  Funcionalidade: 004 - API correio
    Como analista de teste
    Quero testar requisições

  Cenario: CT004.001 Executa GET no serviço
    Quando envio uma requisicao de Get request para API "http://apps.widenet.com.br/busca-cep/api/cep/05847620.json"
    Entao o HTTP status 200 sera retornado com alguma descricao do book


