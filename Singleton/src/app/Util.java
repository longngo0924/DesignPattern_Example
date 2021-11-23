package app;

public class Util {
	private static Util instance = null;
	private String message;

	private Util() {
		super();
		message = "Hello world";
	}

	public static synchronized Util getInstance() {
		if (instance == null)
			instance = new Util();
		return instance;
	}

	public String getMessage() {
		return message;
	}

}
