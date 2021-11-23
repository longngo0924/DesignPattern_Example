package model;

public class SteeringWheel extends AccessoryDecorator {

	Game game;

	public SteeringWheel(Game game) {
		super();
		this.game = game;
	}

	@Override
	public String getName() {
		return game.getName();
	}

	@Override
	public String getCategory() {
		return game.getCategory();
	}

	public String hasSteeringWheel() {
		return "name: "+ game.getName() + ", category: " + game.getCategory() + " with steering wheel";
	}

}
