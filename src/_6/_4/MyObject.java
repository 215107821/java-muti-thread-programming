package _6._4;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class MyObject implements Serializable {

	private static final long serialVersionUID = 1447199908131841252L;

	private static class MyObjectHandler {
		private static final MyObject myObject = new MyObject();
	}

	private MyObject() {

	}

	public static MyObject getInstance() {
		return MyObjectHandler.myObject;
	}

	protected Object readResolve() throws ObjectStreamException {
		System.out.println("invoke readResolve ...");
		return MyObjectHandler.myObject;
	}
}
