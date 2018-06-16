## [Linguagem de Programação Orientada a Objetos 1](https://rodrigonoll.github.io/java/lpoo-1.html)

### [Exercício: Implementaçoes: Exceções](https://rodrigonoll.github.io/java/implementacao/#/2)

1. Crie a estrutura de classes abaixo. Os métodos de saque devem lançar a exceção de cheque especial quando a conta estiver em déficit.
Crie os testes unitários para o método saca da ContaCorrente. Crie os testes unitários para o método saca da ContaCorrente. Altere ChequeEspecialException para estender RuntimeException e analise o que aconteceu.

<img height="400" src="https://rodrigonoll.github.io/java/implementacao/excecoes/exerc-1.png">

2. Evolua o modelo acima criando a exceção ParametroIlegalException que estende RuntimeException para ser lançada sempre que tentar sacar ou depositar um valor inválido (nulo ou negativo). A exceção deve armazenar também o parâmetro inválido. Crie os testes unitários para o método saca e deposita da ContaCorrente
