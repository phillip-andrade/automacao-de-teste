#language: pt
#encodeing: utf-8
#@run
Funcionalidade: Formulario Tricentis

    @run
    Cenario: Preencher Formulario
        Dado que acesso o formulario
        Quando selecionar tipo de veiculo automovel
        E clicar na primeira aba
        E preencher todos campos na primeira aba
        E clique em next na primeira aba
        Entao avancou para a segunda aba