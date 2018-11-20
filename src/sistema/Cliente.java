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
		super.imprimirInformacoes();
		System.out.println("Numero de Contrato: " + this.getNumeroContrato());
	}
	
}
