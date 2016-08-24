package _6._5;

public class MyObject {

	private static MyObject instance = null;

	private MyObject() {

	}

	static {
		instance = new MyObject();
	}

	public static MyObject getInstance() {
		return instance;
	}

}
