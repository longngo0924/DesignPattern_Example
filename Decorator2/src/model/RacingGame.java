package model;

public class RacingGame extends Game {
	private String privateCategory;

	public RacingGame(String privateCategory, String name) {
		this.privateCategory = privateCategory;
		this.name = name;
		this.category = "Racing";
	}

	public String getPrivateCategory() {
		return privateCategory;
	}
}
