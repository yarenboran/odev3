package homework.concrete;

import homework.abstracts.UserCheckService;
import homework.abstracts.UserService;
import homework.entities.User;

public class UserManager implements UserService{
	
	private UserCheckService userCheckService;
	
	public UserManager(UserCheckService userCheckService) {
		super();
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) {
		if(userCheckService.CheckIfRealPerson(user)) {
			System.out.println("Welcome : " + user.getFirstName());
		}
		else {
			System.out.println(user.getFirstName() + user.getLastName() + " NOT A VALID PERSON");
		}
		
	}

	@Override
	public void delete(User user) {
		System.out.println("User deleted : " + user.getFirstName() + user.getLastName());
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + " Update successfully");
		
	}
	
	

}
