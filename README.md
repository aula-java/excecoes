## [Linguagem de Programação Orientada a Objetos 1](https://rodrigonoll.github.io/aula/lpoo-1.html)

### [Exercício: Exceções](https://rodrigonoll.github.io/aula/java-api/#/2)

1. Crie a estrutura de classes abaixo. Os métodos de saque devem lançar a exceção de cheque especial quando a conta estiver em déficit.
Crie os testes unitários para o método saca da ContaCorrente. Crie os testes unitários para o método saca da ContaCorrente. Altere ChequeEspecialException para estender RuntimeException e analise o que aconteceu.

<img height="400" src="https://rodrigonoll.github.io/aula/java-api/excecoes/exerc-1.png">

2. Evolua o modelo acima criando a exceção ParametroIlegalException que estende RuntimeException para ser lançada sempre que tentar sacar ou depositar um valor inválido (nulo ou negativo). A exceção deve armazenar também o parâmetro inválido. Crie os testes unitários para o método saca e deposita da ContaCorrente
