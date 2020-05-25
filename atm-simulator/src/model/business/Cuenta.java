package model.business;


public class Cuenta {

		private String alias;
		private double saldo;
		
	public Cuenta() {
		
		saldo = 0;
	}
	
	public double getSaldo() {
		
		return saldo;
	}
	
	public void setAlias(String alias) {
		
		this.alias = alias;
	}
	
	public String getAlias() {
		
		return this.alias;
	}

	public void extraer(int monto) {
		
	}
	
	public void depositar(int monto) {
		
	}
}
