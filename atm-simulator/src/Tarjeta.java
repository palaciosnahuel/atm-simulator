
public class Tarjeta {
		
		private int id;
		private int pinInicial;
		private int pin;
		
	public Tarjeta() {
		
		id = (int)((Math.random()+1)*50005010);
		pinInicial = 1234;
	}
	
	public int getID() {
		
		return this.id;
	}
	
	public int getPinInicial() {
		
		return pinInicial;
	}
	
	public void setPin(int pin) {
		
		this.pin = pin;
	}
	
	public int getPin() {
		
		return this.pin;
	}
}
	

	public int getClave() {
		return clave;
	}
	public void setClave(int clave) {
		this.clave = clave;
	}
	public void getNumeroTarjeta() {
		
		for(int i=0; i<this.numeroTarjeta.length; ++i) {
		System.out.println(this.numeroTarjeta[i]);
		}
	}
	public void setNumeroTarjeta() {
		
		for(int i=0; i<this.numeroTarjeta.length; ++i) {
		this.numeroTarjeta[i] = (int)((Math.random()+1)*2);
		}
	}
	public int getCuit() {
		return cuit;
	}
	public void setCuit(int cuit) {
		this.cuit = cuit;
	}
	public Cuenta[] getCuentas() {
		return cuentas;
	}
	public void setCuentas(Cuenta[] cuentas) {
		this.cuentas = cuentas;
	}
}