package homework;

import java.time.LocalDate;

import homework.abstracts.GameService;
import homework.abstracts.SalesService;
import homework.adapters.MernisServiceAdapter;
import homework.concrete.CampaignManager;
import homework.concrete.GameManager;
import homework.concrete.SalesManager;
import homework.concrete.UserManager;
import homework.entities.Campaign;
import homework.entities.Game;
import homework.entities.User;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager(new MernisServiceAdapter());
		userManager.add(new User(1, "Yaren", "Boran", LocalDate.of(2001, 8, 10), "89765432145"));
		
		System.out.println("-------------------");
		
		GameService iGameService = new GameManager();
		GameService.add(new Game(1, "Valorant", 32));
		
		System.out.println("----------------------");
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(new Campaign(1, "Weekend Offer", 20, 10 ));
		
		System.out.println("-----------------------");
		
		SalesService SalesService = new SalesManager();
		SalesService.sale(new Game(1, "Valorant", 32),new User(1, "Yaren", "Boran", LocalDate.of(2001, 8, 10), "89765432145"));
		
	
	}

	}