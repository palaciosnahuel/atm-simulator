package account;

import java.util.LinkedList;


public class Cliente {

		private int cuit;
		private LinkedList<Cuenta> cuentas = new LinkedList<Cuenta>();
		private Tarjeta tarjeta;
		private int TipoDeCuenta;
		

	
	public Cliente(int cuit, int tipoDeCuenta, Tarjeta tarjeta, String alias, double descubierto) {
		
		switch(tipoDeCuenta) {
		
			// Accede a cuenta corriente ( CC )
		case 01 :
			
				this.cuit = cuit;
				this.tarjeta = tarjeta;
				
				CuentaCorriente cuentaCorriente = new CuentaCorriente();
				cuentaCorriente.setAlias(alias);
				cuentaCorriente.setDescubierto(descubierto);
				cuentas.add(cuentaCorriente);
		
			// Accede a cajaAhorroPeso ( CAP )
				
		case 02 :

				this.cuit = cuit;
			
				CuentaCorriente cajaAhorroPeso = new CuentaCorriente();
				cajaAhorroPeso.setAlias(alias);
				tarjeta = new Tarjeta();
				cuentas.add(cajaAhorroPeso);
			
			
			// Accede a cajaAhorroDolar ( CAD )
			
		case 03 :

				this.cuit = cuit;
			
				CuentaCorriente cuentaAhorroDolar = new CuentaCorriente();
				cuentaAhorroDolar.setAlias(alias);
				tarjeta = new Tarjeta();
				cuentas.add(cuentaAhorroDolar);
		}
	}

	public int getCuit() {
		return this.cuit;
	}
	
	public void agregarCuenta(int tipoDeCuenta, String alias, double descubierto) {
		
		switch (tipoDeCuenta) {
			
			case 01 :
				
				
				
				CuentaCorriente cuentaCorriente = new CuentaCorriente();
				cuentaCorriente.setAlias(alias);
				cuentaCorriente.setDescubierto(descubierto);
				cuentas.add(cuentaCorriente);
				
			case 02 :
				
				
				
				CuentaCorriente cajaAhorroPeso = new CuentaCorriente();
				cajaAhorroPeso.setAlias(alias);
				cuentas.add(cajaAhorroPeso);
				
			case 03 :
			
				CuentaCorriente cuentaAhorroDolar = new CuentaCorriente();
				cuentaAhorroDolar.setAlias(alias);
				cuentas.add(cuentaAhorroDolar);
		}
	}
	

	public static void main(String[] args) {
		
		//(int cuit, int tipoDeCuenta, Tarjeta tarjeta, String alias, double descubierto)
		
			Cliente juan = new Cliente(36637814,01,new Tarjeta(),"ROSITA.SOLDIERS.UNTREF",1200);
			juan.agregarCuenta(02, "CAJON.PEPE.MANDARINA", 0);
			
			System.out.println(juan.cuentas.get(0).getAlias());
			System.out.println(juan.tarjeta.getID());
			System.out.println(juan.cuentas.get(1).getAlias());
			System.out.println(juan.tarjeta.getID());
			
	}
}