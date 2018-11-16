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
			
		Atendente atendente1 = new Atendente();
			atendente1.setNome("Dalilah");
			atendente1.setCpf("987.654.321-00");
			Data dataAtendente1 = new Data(8, 12, 1996);
			atendente1.setData(dataAtendente1);
			atendente1.setMatricula(156);
			
		Banco banco1 = new Banco();
			banco1.setNomeBanco("Inter");
			banco1.setCnpjBanco("00.416.968/0001-01");
		
		Conta conta1 = new Conta(123678);
			conta1.setCliente(cliente1);
			conta1.setSaldoConta(9850.32);
			conta1.setLimiteConta(1000);
			conta1.setBanco(banco1);
			conta1.setAtendente(atendente1);
			
			
		Pessoa pessoa1 = new Pessoa();
			pessoa1.setNome("Gotardo");
			pessoa1.setCpf("1092830198098");
			Data dataPessoa1 = new Data(01, 02, 2003);
			pessoa1.setData(dataPessoa1);
			
			
		conta1.sacar(27000);
		conta1.depositar(100);
		System.out.println("Saldo disponivel: " + conta1.mostrarSaldoTotalDisponivel());
		System.out.println("Saldo positivo: " + conta1.verificaSaldoTotalDisponivelPositivo(conta1.getSaldoConta(), conta1.getLimiteConta()));
		// conta1.pegarEmprestimo(1200);
		System.out.println("Pegou emprestimo: " + conta1.imprimirPegouEmprestimo(conta1.isEmprestimo()));
		
		conta1.imprimirInformacoes();

	}

}
