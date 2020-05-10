

public class CuentaCorriente extends Cuenta {

	private double descubierto=0;
	
	public CuentaCorriente(Cliente cliente, double descubierto) {
		super(cliente);
		this.descubierto =descubierto;
	}
	
	public void retirarEfectivo(int monto) {
		this.setSaldoPesos(this.getSaldoPesos()-monto);
	}

	public void realizarTransferencia(double monto, Cliente clientedestino) {

		if (this.getSaldoPesos()>monto ) {
			this.setSaldoPesos(this.getSaldoPesos()-monto);
		}
	}
	
	public void comprarDolares(double monto) {
		if(this.getSaldoPesos()> (monto+ ((monto*30/100)))){
			this.setSaldoDolar(this.getSaldoDolar()+(monto/30));
		}
	}
	
	public double getDescubierto() {
		return descubierto;
	}
	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}
		
}