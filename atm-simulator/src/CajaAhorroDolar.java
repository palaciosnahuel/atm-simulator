
public class CajaDeAhorroDolar extends CajaDeAhorro{
	
	public CajaDeAhorroDolar(Cliente cliente) {
		super(cliente);

	}
	@Override
	public void depositar(int monto) {
		this.setSaldoDolar(this.getSaldoDolar()+monto);
	}
}