package model;

public class ActionGame extends Game {

	private String privateCategory;

	public ActionGame(String privateCategory, String name) {
		this.privateCategory = privateCategory;
		this.name = name;
		this.category = "Action";
	}

	public String getPrivateCategory() {
		return privateCategory;
	}

}
