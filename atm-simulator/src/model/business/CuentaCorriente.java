package model.business;
public class CuentaCorriente extends Cuenta{

		private double descubierto;
		
	public CuentaCorriente() {
		
		
	}
	
	public double getDescubierto() {
		
		return this.descubierto;
	}
	
	public void setDescubierto(double descubierto) {
		
		this.descubierto = descubierto;
	}
	
	@Override
	public void depositar(int monto) {
		
	}
	@Override
	public void extraer(int monto) {
		
	}
}