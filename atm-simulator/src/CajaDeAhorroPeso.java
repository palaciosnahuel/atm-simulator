

public class CajaDeAhorroPeso extends CajaDeAhorro {

	public CajaDeAhorroPeso(Cliente cliente) {
		super(cliente);

	}

	
	public void retirarEfectivo(int monto) {
		this.setSaldoPesos(this.getSaldoPesos()-monto);
	}
	
	public void comprarDolares(double cantidad, String aliasCajaAhorroEnDolares) {
		
	}

}