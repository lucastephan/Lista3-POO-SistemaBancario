# Lista3-POO-SistemaBancario

Lista de exercícios de número 3, da matéria de Java Orientado a Objetos do Curso Técnico em Desenvolvimento de Sistemas da UTRAMIG.

Foi necessário me ater as solicitações do professor, mesmo que o projeto pudesse ser feito de maneira muito mais simples, prática e limpa.

As demandas impostas pelo professor foram as seguintes:

• Criar uma classe Banco:

Atributos: nomeBanco e cnpj

Métodos: 
- void imprimirInformacoes();  get e set

• Criar classe Data:

Atributos: dia, mês, ano --- todos do tipo int

Métodos: 
- void imprimirInformacoes();  get e set

• Criar classe Pessoa:

Atributos:nome, CPF, data

Métodos: 
- void imprimirInformacoes();  get e set
- int verificarIdade(Pessoa pessoa, int anoAtual) 

• Criar a classe Cliente:

Atributos:numeroContrato

Métodos: 
- void imprimirInformacoes();  get e set

• Criar a Classe Atendente:

Atributos: matricula

Métodos: 
- void imprimirInformacoes();  get e set

• Criar a classe Conta:

Atributos: numeroConta; saldo; limite; banco; cliente, atendente,  boolean emprestimo;

Métodos: 
- void imprimirInformacoes();  get e set
- void sacar(double valor)
- void depositar(double valor)
- double mostrarSaldoTotalDisponivel() ---- saldo + limite
- Conta(int numeroConta, double limite) ---- toda conta inicia com um número e o limite de 300 reais
- boolean verificaSaldoTotalDisponivelPositivo(double saldo, double limite) --- verifica se o retorno do método  mostrarSaldoTotalDisponivel() é maior que zero
- boolean pegarEmprestimo(double valor) --- valor deverá ser menor ou igual a 500 caso seja maior não haverá o empréstimo. Caso já exista um empréstimo não poderá haver um novo.
- String imprimirPegouEmprestimo(boolean emprestimo) --- imprimir se pegou empréstimo ou não
- transferir(Conta contaOrigem, Conta contaDestino, double valor) --- transferir de uma conta para outra

• Criar uma classe do tipo main instanciar os objetos e povoar os mesmos.
Fazer as chamadas de todos os métodos para teste. 
