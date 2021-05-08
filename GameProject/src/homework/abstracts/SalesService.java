package homework.abstracts;

import homework.entities.Campaign;
import homework.entities.Game;
import homework.entities.User;

public interface SalesService {
	
	void sale(Game game, User user);
	void campaignSale(Game game, User user, Campaign campaign);

}
