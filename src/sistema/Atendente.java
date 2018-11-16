package sistema;

public class Atendente extends Pessoa {
	public int matricula;

	// Getters e Setters
		public int getMatricula() {
			return matricula;
		}
		public void setMatricula(int matricula) {
			this.matricula = matricula;
		}
	
	@Override	
	public void imprimirInformacoes() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("CPF: " + this.getCpf());
		getData().imprimirInformacoes();
		System.out.println("Matricula: " + this.getMatricula());
		System.out.println("Idade: " + this.verificarIdade(this, 2018) + " anos");
	}
	
}
