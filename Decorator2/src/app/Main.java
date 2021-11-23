package app;

import model.ActionGame;
import model.Game;
import model.Gamepad;
import model.SteeringWheel;

public class Main {

	public static void main(String[] args) {
		Game game1 = new ActionGame("Fight", "Game 1");
		Gamepad gamepad = new Gamepad(game1);
		SteeringWheel steeringWheel = new SteeringWheel(gamepad);

		System.out.println(steeringWheel.hasSteeringWheel());

	}

}
