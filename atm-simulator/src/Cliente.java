
import java.util.LinkedList;


public class Cliente {

	private int cuit;
	private LinkedList<Cuenta> cuentas = new LinkedList<Cuenta>();
	private Tarjeta tarjeta;

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
			this.tarjeta = tarjeta;
			
			CajaAhorroPeso cajaAhorroPeso = new CajaAhorroPeso();
			cajaAhorroPeso.setAlias(alias);
			tarjeta = new Tarjeta();
			cuentas.add(cajaAhorroPeso);
		
		
		// Accede a cajaAhorroDolar ( CAD )
		
	case 03 :

			this.cuit = cuit;
			this.tarjeta = tarjeta;
			
			CajaAhorroDolar cajaAhorroDolar = new CajaAhorroDolar();
			cajaAhorroDolar.setAlias(alias);
			tarjeta = new Tarjeta();
			cuentas.add(cajaAhorroDolar);
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

			CajaAhorroPeso cajaAhorroPeso = new CajaAhorroPeso();
			cajaAhorroPeso.setAlias(alias);
			cuentas.add(cajaAhorroPeso);
			
		case 03 :
		
			CajaAhorroDolar cajaAhorroDolar = new CajaAhorroDolar();
			cajaAhorroDolar.setAlias(alias);
			cuentas.add(cajaAhorroDolar);
	}
}
	public static void main(String[] args) {
		
		Cliente juan = new Cliente(36637814,01,new Tarjeta(),"ROSITA.SOLDIERS.UNTREF",1200);
		juan.agregarCuenta(02, "CAJON.PEPE.MANDARINA", 0);
		juan.agregarCuenta(03, "CEREZA.FLOR.AUTO", 0);
		
		System.out.println(juan.cuentas.get(0).getAlias());
		System.out.println(juan.tarjeta.getID());
		System.out.println(juan.cuentas.get(1).getAlias());
		System.out.println(juan.tarjeta.getID());
		System.out.println(juan.cuentas.get(2).getAlias());
		System.out.println(juan.tarjeta.getID());
	}
}