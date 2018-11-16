package sistema;

public class Main {

	public static void main(String[] args) {
		// Instancias
		Cliente cliente1 = new Cliente();
			cliente1.setNome("Joao Lucas");
			cliente1.setCpf("123.456.789-00");
			Data dataCliente1 = new Data(4, 9, 1998);
			cliente1.setData(dataCliente1);
			cliente1.setNumeroContrato(287);
			
		Cliente cliente2 = new Cliente();
			cliente2.setNome("Fulano de Tal");
			cliente2.setCpf("128.731.900-11");
			Data dataCliente2 = new Data(3, 6, 2000);
			cliente2.setData(dataCliente2);
			cliente2.setNumeroContrato(462);
			
		Atendente atendente1 = new Atendente();
			atendente1.setNome("Dalilah");
			atendente1.setCpf("987.654.321-00");
			Data dataAtendente1 = new Data(8, 12, 1996);
			atendente1.setData(dataAtendente1);
			atendente1.setMatricula(156);
			
		Atendente atendente2 = new Atendente();
			atendente2.setNome("Beltrana da Silva");
			atendente2.setCpf("888.654.236-21");
			Data dataAtendente2 = new Data(14,4,1989);
			atendente2.setData(dataAtendente2);
			atendente2.setMatricula(486);
			
		Banco banco1 = new Banco();
			banco1.setNomeBanco("Inter");
			banco1.setCnpjBanco("00.416.968/0001-01");
			
		Banco banco2 = new Banco();
			banco2.setNomeBanco("Itau");
			banco2.setCnpjBanco("60.701.190/0001-04");
		
		Conta conta1 = new Conta(123678);
			conta1.setCliente(cliente1);
			conta1.setSaldoConta(9850.32);
			conta1.setLimiteConta(1000);
			conta1.setBanco(banco1);
			conta1.setAtendente(atendente1);
			
		Conta conta2 = new Conta(47871);
			conta2.setCliente(cliente2);
			conta2.setSaldoConta(27321.55);
			conta2.setLimiteConta(5000);
			conta2.setBanco(banco2);
			conta2.setAtendente(atendente2);
		
		// Uso dos metodos da classe Conta
		conta1.sacar(20000);
		conta1.depositar(100);
		System.out.println("Saldo disponivel: " + conta1.mostrarSaldoTotalDisponivel());
		System.out.println("Saldo positivo: " + conta1.verificaSaldoTotalDisponivelPositivo(conta1.getSaldoConta(), conta1.getLimiteConta()));
		conta1.pegarEmprestimo(300);
		System.out.println("Pegou emprestimo: " + conta1.imprimirPegouEmprestimo(conta1.isEmprestimo()));
		conta1.transferir(conta2, conta1, 17000);
		
		// Imprimir informacoes
		System.out.println("");
		System.out.println("Conta 1");
		conta1.imprimirInformacoes();
		System.out.println("Conta 2");
		conta2.imprimirInformacoes();

	}

}
