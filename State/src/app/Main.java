package app;

import model.DocumentContext;
import state.NewState;

public class Main {
	public static void main(String[] args) {
		DocumentContext context = new DocumentContext();
		context.setState(new NewState());
		context.applyState();
	}
}
