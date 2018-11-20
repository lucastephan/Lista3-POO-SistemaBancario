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
		super.imprimirInformacoes();
		System.out.println("Matricula: " + this.getMatricula());
	}
	
}
