package sistema;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	// Getters e Setters
		public int getDia() {
			return dia;
		}
		public void setDia(int dia) {
			this.dia = dia;
		}
		public int getMes() {
			return mes;
		}
		public void setMes(int mes) {
			this.mes = mes;
		}
		public int getAno() {
			return ano;
		}
		public void setAno(int ano) {
			this.ano = ano;
		}
		
		
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	
	public void imprimirInformacoes() {
		System.out.println("Data de Nascimento: " + this.getDia() + "/" + this.getMes() + "/" + this.getAno());
	}
	
}
