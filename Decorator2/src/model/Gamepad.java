package model;

public class Gamepad extends AccessoryDecorator {

	Game game;

	public Gamepad(Game game) {
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

	public String hasGamepad() {
		return "name: "+ game.getName() + ", category: " + game.getCategory() + " with gamepad";
	}

}
