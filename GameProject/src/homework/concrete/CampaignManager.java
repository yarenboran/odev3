package homework.concrete;

import homework.abstracts.CampaignService;
import homework.entities.Campaign;

public class CampaignManager implements CampaignService{
	
	@Override
	public void add(Campaign campaign) {
		System.out.println("Campaign added : " + campaign.getCampaignName());
	}
	
	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign deleted : " + campaign.getCampaignName());
	}
	
	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign updated : " + campaign.getCampaignName());
	}
	
	
	
	
	

}
