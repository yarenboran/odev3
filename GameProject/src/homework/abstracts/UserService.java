package homework.abstracts;

import homework.entities.User;

public interface UserService {
	
	void add(User user);
	void delete(User user);
	void update(User user);

}
