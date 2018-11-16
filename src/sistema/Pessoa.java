package sistema;

public class Pessoa {
	private String nome;
	private String cpf;
	private Data data;
	
	// Getters e Setters
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public Data getData() {
			return data;
		}
		public void setData(Data data) {
			this.data = data;
		}
	
	
	public void imprimirInformacoes() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("CPF: " + this.getCpf());
		getData().imprimirInformacoes();
		System.out.println("Idade: " + this.verificarIdade(this, 2018) + " anos");
	}
	
	public int verificarIdade(Pessoa pessoa, int anoAtual) {
		int idade = anoAtual - data.getAno();
		return idade;
	}
	
}
