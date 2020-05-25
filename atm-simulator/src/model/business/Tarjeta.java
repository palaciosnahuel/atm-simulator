package model.business;

public class Tarjeta {
		
		private int id;
		private int pinInicial;
		private int pin;
		
	public Tarjeta(int id,int pin) {
		this.id = id;
		this.pin = pin;
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