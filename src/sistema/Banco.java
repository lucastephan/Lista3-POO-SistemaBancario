package sistema;

public class Banco {
	private String nomeBanco;
	private String cnpjBanco;
	
	// Getters e Setters
		public String getNomeBanco() {
			return nomeBanco;
		}
		public void setNomeBanco(String nomeBanco) {
			this.nomeBanco = nomeBanco;
		}
		public String getCnpjBanco() {
			return cnpjBanco;
		}
		public void setCnpjBanco(String cnpjBanco) {
			this.cnpjBanco = cnpjBanco;
		}
	
		
	public void imprimirInformacoes() {
		System.out.println("Banco: " + this.getNomeBanco());
		System.out.println("CNPJ: " + this.getCnpjBanco());
	}
	
}
