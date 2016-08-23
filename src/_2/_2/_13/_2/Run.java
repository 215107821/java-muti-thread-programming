package _2._2._13._2;

import _2._2._13._2.PublicClass.PrivateClass;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		PublicClass publicClass = new PublicClass();

		publicClass.setUsername("usernameValue");
		publicClass.setPassword("passwordValue");

		System.out.println(publicClass.getUsername() + " " + publicClass.getPassword());

		PrivateClass privateClass = new PrivateClass();

		privateClass.setAge("ageValue");
		privateClass.setAddress("addressValue");

		System.out.println(privateClass.getAge() + " " + privateClass.getAddress());

	}
}
