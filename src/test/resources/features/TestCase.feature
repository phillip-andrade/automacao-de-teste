#language: pt
#encodeing: utf-8
#@run
Funcionalidade: Formulario Tricentis

    @run
    Cenario: Preencher Formulario
        Dado o usuario tem acesso ao sistema
        E o usuario seleciona o tipo de veiculo automovel
        E seleciona a primeira aba
        E preenche todos campos da primeira aba
        Quando clica em next na primeira aba
        Então a segunda aba sera exibida
        E preenche todos campos da segunda aba
        Quando clica em next na segunda aba
        Entao a terceira aba sera exibida
        E preenche todos campos da terceira aba
        Quando clica em next na terceira aba
        Entao a quarta aba sera exibida
        E seleciona a opcao de preco
        Quando clica em next na quarta aba
        Entao a quinta aba sera exibida
        E preenche todos campos da quinta aba
        Quando clica em send na quinta aba
        Entao o sweet alert sera exibido