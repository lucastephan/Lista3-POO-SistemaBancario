package sistema;

public class Atendente {
	public int matricula;

	// Getters e Setters
		public int getMatricula() {
			return matricula;
		}
		public void setMatricula(int matricula) {
			this.matricula = matricula;
		}
	
		
	public void imprimirInformacoes() {
		System.out.println("Matricula: " + this.getMatricula());
	}
	
}
