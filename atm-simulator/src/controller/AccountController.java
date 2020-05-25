package controller;
import java.util.LinkedList;
import java.util.List;
import model.business.Cuenta;
import model.business.Tarjeta;

public class AccountController {

	public List<Cuenta> loadAccounts(Tarjeta tarjeta) {
		AccountModel accmodel = new AccountModel();
		return accmodel.getCuentas(tarjeta);	
	}
	
}
