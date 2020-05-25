package controller;
import model.business.Tarjeta;

public class LoginController {

	public Tarjeta validateLogin(int tarjetaId, int password ) {
		
		LoginModel loginmodel = new LoginModel();
		
		if(password > 3) {
			// Valido en la base de datos que exista la tarejeta y luego que la contraseña sea correcta.	
			Tarjeta tarjeta = loginmodel.getTarjeta(tarjetaId, password);
			return tarjeta;
		}
	
	}	
}
