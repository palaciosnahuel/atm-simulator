import SimuladorATM.CajaDeAhorroDolar;
import SimuladorATM.CajaDeAhorroPeso;
import SimuladorATM.Cliente;
import SimuladorATM.Cuenta;

public class Tarjeta {
	
	private int clave= 1234;
	private int numeroTarjeta;
	private int cuit;
	private Cuenta[]tiposDeCuentas;

	
	//Cuenta corriente + Caja de ahorro en Pesos;
	public Tarjeta (Cliente cliente, Cuenta cuentacorriente , CajaDeAhorroPeso cajadeahorropeso) {
				
	}
	//Cuenta corriente;
	public Tarjeta (Cliente cliente, Cuenta cuentacorriente) {
				
	}
	//Cuenta corriente + Caja de ahorro en Pesos + Caja de ahorro en Dolares; 
	public Tarjeta (Cliente cliente, Cuenta cuentacorriente, CajaDeAhorroPeso cajaahorropeso, CajaDeAhorroDolar cajaahorrodolar) {
				
	}
	//Cuenta corriente + Caja de ahorro en Dolares; 
	public Tarjeta (Cliente cliente, CajaDeAhorroPeso cajaahorropeso, CajaDeAhorroDolar cajaahorrodolar) {
				
	}
	
	public void agregarCuenta () {
		
	}

	public int getClave() {
		return clave;
	}
	public void setClave(int clave) {
		this.clave = clave;
	}
	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(int numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public int getCuit() {
		return cuit;
	}
	public void setCuit(int cuit) {
		this.cuit = cuit;
	}
	public Cuenta[] getCuentas() {
		return tiposDeCuentas;
	}
	public void setCuentas(Cuenta[] cuentas) {
		this.tiposDeCuentas = cuentas;
	}
}