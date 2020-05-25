
import java.util.LinkedList;

import account.CajaAhorroDolar;
import account.CajaAhorroPeso;
import account.Cliente;
import account.Cuenta;
import account.CuentaCorriente;
import account.Tarjeta;


public class Cliente {

		private int cuit;
		private LinkedList<Cuenta> cuentas;
		private Tarjeta tarjeta;
		
	public Cliente(int cuit, CuentaCorriente cuentaCorriente, String alias, double descubierto, Tarjeta tarjeta) {
		
		cuentas = new LinkedList<Cuenta>();
		this.cuit = cuit;
		cuentaCorriente.setDescubierto(descubierto);
		cuentaCorriente.setAlias(alias);
		cuentas.add(cuentaCorriente);
		this.tarjeta = tarjeta;
		
			
	}
	
	public Cliente(int cuit, CajaAhorroDolar cuentaDolar, String alias, Tarjeta tarjeta) {
		
		cuentas = new LinkedList<Cuenta>();
		this.cuit = cuit;
		cuentaDolar.setAlias(alias);
		cuentas.add(cuentaDolar);
		this.tarjeta = tarjeta;
		
	}
	
	public Cliente(int cuit, CajaAhorroPeso cuentaPeso, Tarjeta tarjeta) {
		
		this.cuit = cuit;
		cuentas.add(new CajaAhorroPeso(this.cuit));
		this.tarjeta = tarjeta;
	}
	
	public Cliente(int cuit, CuentaCorriente cuentaCorriente, double descubierto, CajaAhorroDolar cuentaDolar, CajaAhorroPeso cuentaPeso, Tarjeta tarjeta) {
		
		this.cuit = cuit;
		cuentas.add(new CuentaCorriente(this.cuit, descubierto));
		cuentas.add(new CajaAhorroDolar(this.cuit));
		cuentas.add(new CajaAhorroPeso(this.cuit));
		this.tarjeta = tarjeta;
		
	}
	
	public Cliente(int cuit, CuentaCorriente cuentaCorriente, double descubierto, CajaAhorroDolar cuentaDolar, Tarjeta tarjeta) {
		
		this.cuit = cuit;
		cuentas.add(new CuentaCorriente(this.cuit, descubierto));
		cuentas.add(new CajaAhorroDolar(this.cuit));
		this.tarjeta = tarjeta;
	}
	
	public Cliente(int cuit, CajaAhorroPeso cuentaPeso, CajaAhorroDolar cuentaDolar, Tarjeta tarjeta) {
		
		this.cuit = cuit;
		cuentas.add(new CajaAhorroPeso(this.cuit));
		cuentas.add(new CajaAhorroDolar(this.cuit));
		this.tarjeta = tarjeta;
	}
	
	public Cliente(int cuit, CajaAhorroPeso cuentaPeso, double descubierto, CuentaCorriente cuentaCorriente, Tarjeta tarjeta) {
		
		this.cuit = cuit;
		cuentas.add(new CuentaCorriente(this.cuit, descubierto));
		cuentas.add(new CajaAhorroPeso(this.cuit));
		this.tarjeta = tarjeta;
	}

	
	public int getCuit() {
		return this.cuit;
	}
	public static void main(String[] args) {
		
			Cliente juan = new Cliente(36637814,new CuentaCorriente(),"MICHO.TITO.NEGRO",1200, new Tarjeta());
			System.out.println(juan.tarjeta.getID());
			System.out.println(juan.cuentas.get(0));
			System.out.println(juan.cuentas.get(0).getSaldo());
			System.out.println(juan.cuentas.get(0).getAlias());
			
			System.out.println();
			
			Cliente rosita = new Cliente(1, new CajaAhorroDolar(),"ROSITA.SOLDIERS.UNTREF", new Tarjeta());
			System.out.println(rosita.tarjeta.getID());
			System.out.println(rosita.cuentas.get(0).getSaldo());
			System.out.println(rosita.cuentas.get(0).getAlias());
	}
}