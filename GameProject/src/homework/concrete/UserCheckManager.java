package homework.concrete;

import homework.abstracts.UserCheckService;
import homework.entities.User;

public class UserCheckManager implements UserCheckService{

	@Override
	public boolean CheckIfRealPerson(User user) {
		
		return false;
	}
	
	
	
	

}
