package homework.adapters;

import java.rmi.RemoteException;

import homework.abstracts.UserCheckService;
import homework.entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService{
	
	@Override
	public boolean CheckIfRealPerson(User user) {


	
	KPSPublicSoapProxy client = new KPSPublicSoapProxy();
	
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()), user.getFirstName.toUpperCase(), 
					user.getLastName.toUpperCase(), user.getDateOfBirth.getYear());
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
		return false;
	}
	
}
