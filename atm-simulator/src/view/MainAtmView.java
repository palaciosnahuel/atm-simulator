package view;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import controller.LoginController;
import model.business.Cuenta;
import model.business.Tarjeta;

public class MainAtmView {

	
	
	
	private static void loginMenu() {
	
	    // Load controller
	    LoginController logincontroller = new LoginController();	
			
		//Ingreso tarjeta
		System.out.println("Ingresar Tarjeta");
		Scanner sc = new Scanner(System.in);
		String card = sc.nextLine();
		
		//Ingreso Contraseña
		System.out.println("Ingresar Contraseña");
		String contraseña = sc.nextLine();
		   
		//Validar contraseña
		
		// Parseo lo ingresado por consola (String) a Int.
		// El numero de tarjeta es guardado en una variable, ya que lo necesitamos para crear la nueva tarjeta y sería más costoso parsearlo 2 veces.sd
		int cardInt = Integer.parseInt(card);
		Tarjeta tarjetavalidada = logincontroller.validateLogin(cardInt, Integer.parseInt(contraseña));
		
		if(tarjetavalidada != null) {
			System.out.flush();  
			System.out.println("Contraseña o Tarjeta incorrecta");
			loginMenu();	
		}
		else {
			accountsMenu(tarjetavalidada);	
		}
        
	}
	
	public static void accountsMenu(Tarjeta tarjeta) {
		
		/*
		 * // Load Account AccountController accountcontroller = new
		 * AccountController();
		 * 
		 * // Cargar todas las cuentas List<Cuenta> cuentas =
		 * accountcontroller.loadAccounts(tarjeta);
		 * 
		 * for (int i = 0; i < cuentas.size(); i++) {
		 * System.out.println("Seleccione la cuenta ingresando dos dígitos."); if(CAJA
		 * DE AHORRO){ System.out.println("01. CA"); } else if(CAJA DE AHORRO EN PESOS)
		 * { System.out.println("01. CC"); } else if(CAJA DE AHORRO EN DOLARES) {
		 * System.out.println("01. CAD"); } }
		 * 
		 * TransactionContrroller transaccioncontroller = new TransactionContrroller();
		 */
		
	}
	
	
	public static void main(String[] args) {
		
		loginMenu();
		
         
         
         //if(login.validateLogin(tarjeta,contraseña)) { // -> new LoginModel(tarjeta,contraseña) devuelve true o false .	 
        //	List<Cuentas> = LoginController.getAccounts(tarjeta);   	 
        // }
        // else {
       // 	 System.out.println("Usuario o contraseña incorrectos.");
       //  }
       
         // Selecciono tipo de cuenta
         
         // Abro menú con las opciones. (Comprar dolares no puede comprar dolares)
         // 01. Depositar, 02. Extraer, 03. Transferir, 04. Transferir
         
         //Selecciono Opción
         
         // 01. Depositar
           //  TransactionController.depositar(cuenta,monto); -> TransactionModel.setSaldoPesos(cuenta,monto);
         // 02. Extraer
           //  TransactionController.extraer(cuenta,monto); -> TransactionModel.setSaldoPesos(cuenta,monto);
         // 03. Transferir
           //  TransactionController.transferir(cuenta,monto); -> TransactionModel.setSaldoPesos(cuenta,monto);
         // 04. ComprarDolares
          //  TransactionController.comprardolares(cuenta,monto); -> TransactionModel.setSaldoPesos(cuenta,monto); // setSaldoDolares..
         
        // if(true) { 
        //	 System.out.println("Login correcto" + tarjeta +" "+ contraseña); 
        	 // gettipo de cuenta
        	 // switch 01 , 02 , 03     	 
        // }
		
	}
	
	
	
	
	
}
