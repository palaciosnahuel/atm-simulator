
import java.util.LinkedList;

import account.Cliente;
import account.CuentaCorriente;
import account.Tarjeta;


public class Cliente {

	private int cuit;
	private LinkedList<Cuenta> cuentas;
	private Tarjeta tarjeta;
	
public Cliente(int cuit, CuentaCorriente cuentaCorriente, String aliasCC, double descubierto, Tarjeta tarjeta) {
	
	cuentas = new LinkedList<Cuenta>();
	
	this.cuit = cuit;
	this.tarjeta = tarjeta;
	
	cuentaCorriente.setDescubierto(descubierto);
	cuentaCorriente.setAlias(aliasCC);
	cuentas.add(cuentaCorriente);
	
	
		
}

public Cliente(int cuit, CajaAhorroDolar cuentaDolar, String aliasCAD, Tarjeta tarjeta) {
	
	cuentas = new LinkedList<Cuenta>();
	
	this.cuit = cuit;
	this.tarjeta = tarjeta;
	
	cuentaDolar.setAlias(aliasCAD);
	cuentas.add(cuentaDolar);
	
	
}

public Cliente(int cuit, CajaAhorroPeso cuentaPeso, String aliasCAP, Tarjeta tarjeta) {
	
	cuentas = new LinkedList<Cuenta>();
	
	this.cuit = cuit;
	this.tarjeta = tarjeta;
	
	cuentas.add(cuentaPeso);
	cuentaPeso.setAlias(aliasCAP);
	
}

public Cliente(int cuit, CuentaCorriente cuentaCorriente, String aliasCC, double descubierto, CajaAhorroDolar cuentaDolar,String aliasCAD, CajaAhorroPeso cuentaPeso,String aliasCAP, Tarjeta tarjeta) {
	
	cuentas = new LinkedList<Cuenta>();
	
	this.cuit = cuit;
	this.tarjeta = tarjeta;
	
	cuentas.add(cuentaCorriente);
	cuentaCorriente.setAlias(aliasCC);
	cuentaCorriente.setDescubierto(descubierto);
	
	cuentas.add(cuentaDolar);
	cuentaDolar.setAlias(aliasCAD);
	
	cuentas.add(cuentaPeso);
	cuentaPeso.setAlias(aliasCAP);
	
	
}

public Cliente(int cuit, CuentaCorriente cuentaCorriente, String aliasCC, double descubierto, CajaAhorroDolar cuentaDolar, String aliasCAD, Tarjeta tarjeta) {
	
	cuentas = new LinkedList<Cuenta>();
	
	this.cuit = cuit;
	this.tarjeta = tarjeta;
	
	cuentas.add(cuentaCorriente);
	cuentaCorriente.setAlias(aliasCC);
	cuentaCorriente.setDescubierto(descubierto);
	
	cuentas.add(cuentaDolar);
	cuentaDolar.setAlias(aliasCAD);
	
}

public Cliente(int cuit, CajaAhorroPeso cuentaPeso, String aliasCAP, CajaAhorroDolar cuentaDolar, String aliasCAD, Tarjeta tarjeta) {
	
	cuentas = new LinkedList<Cuenta>();
	
	this.cuit = cuit;
	this.tarjeta = tarjeta;
	
	cuentas.add(cuentaDolar);
	cuentaDolar.setAlias(aliasCAD);
	
	cuentas.add(cuentaPeso);
	cuentaPeso.setAlias(aliasCAP);
}

public Cliente(int cuit, CajaAhorroPeso cuentaPeso, String aliasCAP, double descubierto, CuentaCorriente cuentaCorriente, String aliasCC, Tarjeta tarjeta) {
	
	cuentas = new LinkedList<Cuenta>();
	
	this.cuit = cuit;
	this.tarjeta = tarjeta;
	
	cuentas.add(cuentaPeso);
	cuentaPeso.setAlias(aliasCAP);
	
	cuentas.add(cuentaCorriente);
	cuentaCorriente.setAlias(aliasCC);
	cuentaCorriente.setDescubierto(descubierto);
}

	
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
		
		Cliente juan = new Cliente(36637814,01,new Tarjeta(),"ROSITA.SOLDIERS.UNTREF",1200);
		juan.agregarCuenta(02, "CAJON.PEPE.MANDARINA", 0);
		
		System.out.println(juan.cuentas.get(0).getAlias());
		System.out.println(juan.tarjeta.getID());
		System.out.println(juan.cuentas.get(1).getAlias());
		System.out.println(juan.tarjeta.getID());
	}
}