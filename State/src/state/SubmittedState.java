package state;

public class SubmittedState implements State {

	@Override
	public void handleRequest() {
		System.out.println("Document context was submitted");

	}

}
