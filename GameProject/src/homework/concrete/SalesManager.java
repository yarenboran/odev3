package homework.concrete;

import homework.abstracts.SalesService;
import homework.entities.Campaign;
import homework.entities.Game;
import homework.entities.User;

public class SalesManager implements SalesService{
	
	@Override
	public void sale(Game game, User user) {
		
		System.out.println(user.getFirstName() + user.getLastName() + " is purchased " + game.getGameName() + ".");
		
	}

	@Override
	public void campaignSale(Game game, User user, Campaign campaign) {
		
		System.out.println(campaign.getCampaignName() + " is applied to " + game.getGameName() + " by: " + user.getFirstName() + user.getLastName());
		
	}

	
	
	

}
