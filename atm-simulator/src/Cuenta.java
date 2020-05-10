import SimuladorATM.Cliente;

public abstract class Cuenta {

	private String alias = null;
	private int cuit;
	private double saldoPesos = 0;
	private double saldoDolar=0;
	
	public Cuenta (Cliente cliente) {
		this.cuit = cliente.getCuit();
	}
	
	public void depositar(int monto) {
		this.setSaldoPesos(this.getSaldoPesos()+monto);
		
	}
	
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public int getCuit() {
		return cuit;
	}
	public void setCuit(int cuit) {
		this.cuit = cuit;
	}
	public double getSaldoPesos() {
		return saldoPesos;
	}
	public void setSaldoPesos(double saldoPesos) {
		this.saldoPesos = saldoPesos;
	}
	public double getSaldoDolar() {
		return saldoDolar;
	}
	public void setSaldoDolar(double saldoDolar) {
		this.saldoDolar = saldoDolar;
	}

}
