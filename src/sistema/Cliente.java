package sistema;

public class Cliente extends Pessoa{
	public int numeroContrato;

	// Getters e Setters
		public int getNumeroContrato() {
			return numeroContrato;
		}
		public void setNumeroContrato(int numeroContrato) {
			this.numeroContrato = numeroContrato;
		}
	
	@Override
	public void imprimirInformacoes() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("CPF: " + this.getCpf());
		getData().imprimirInformacoes();
		System.out.println("Numero de Contrato: " + this.getNumeroContrato());
		System.out.println("Idade: " + this.verificarIdade(this, 2018) + " anos");
	}
	
}
