package sistema;

public class Conta {
	private int numeroConta;
	private double saldoConta;
	private double limiteConta;
	private Banco banco;
	private Cliente cliente;
	private Atendente atendente;
	private boolean emprestimo;
	
	// Getters e Setters
		public int getNumeroConta() {
			return numeroConta;
		}
		public void setNumeroConta(int numeroConta) {
			this.numeroConta = numeroConta;
		}
		public double getSaldoConta() {
			return saldoConta;
		}
		public void setSaldoConta(double saldoConta) {
			this.saldoConta = saldoConta;
		}
		public double getLimiteConta() {
			return limiteConta;
		}
		public void setLimiteConta(double limiteConta) {
			this.limiteConta = limiteConta;
		}
		public Banco getBanco() {
			return banco;
		}
		public void setBanco(Banco banco) {
			this.banco = banco;
		}
		public Cliente getCliente() {
			return cliente;
		}
		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}
		public Atendente getAtendente() {
			return atendente;
		}
		public void setAtendente(Atendente atendente) {
			this.atendente = atendente;
		}
		public boolean isEmprestimo() {
			return emprestimo;
		}
		public void setEmprestimo(boolean emprestimo) {
			this.emprestimo = emprestimo;
		}
	
		
	public Conta(int numeroConta) {
		this.numeroConta = numeroConta;
		this.limiteConta = 300;
	}
	
	public void imprimirInformacoes() {
		System.out.println("");
		System.out.println("Numero da Conta: " + this.numeroConta);
		System.out.println("Saldo: " + this.saldoConta);
		System.out.println("Limite: " + this.limiteConta);
		System.out.println("Possui emprestimo ativo: " + this.emprestimo);
		System.out.println("");
		getBanco().imprimirInformacoes();
		System.out.println("");
		getCliente().imprimirInformacoes();
		System.out.println("");
		getAtendente().imprimirInformacoes();
		System.out.println("");
	}
	
	public void sacar(double valor) {
		this.saldoConta -= valor;
	}
	
	public void depositar(double valor) {
		this.saldoConta += valor;
	}
	
	double saldoDisponivel;
	public double mostrarSaldoTotalDisponivel() {
		saldoDisponivel = this.saldoConta + this.limiteConta;
		return saldoDisponivel;
	}
	
	// Verificar
	public boolean verificaSaldoTotalDisponivelPositivo(double saldo, double limite) {
		saldo = this.saldoConta;
		limite = this.limiteConta;
		if (saldoDisponivel > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	// Verificar
	public boolean pegarEmprestimo(double valor) {
		if (this.emprestimo == false) {
			if (valor <= 500) {
				this.saldoConta += valor;
				return this.emprestimo = true;
			}
		} else {
			System.out.println("Nao e possivel solicitar um emprestimo.");
		}
		return false;
	}
	
	public String imprimirPegouEmprestimo(boolean emprestimo) {
		emprestimo = this.emprestimo;
		if (emprestimo == true) {
			return "Pegou emprestimo";
		} else {
			return "Nao pegou emprestimo.";
		}
	}
	
	public void transferir(Conta contaOrigem, Conta contaDestino, double valor) {
		contaOrigem.saldoConta -= valor;
		contaDestino.saldoConta += valor;
	}
	
}