package homework.concrete;

import homework.abstracts.GameService;
import homework.entities.Game;

public class GameManager implements GameService{
	
	public void add(Game game) {
		System.out.println("Game added : " + game.getGameName());
	}

	@Override
	public void delete(Game game) {
		System.out.println("Game deleted : " + game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Game update : " + game.getGameName());
		
	}

}
