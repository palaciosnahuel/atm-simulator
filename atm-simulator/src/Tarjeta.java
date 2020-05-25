
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