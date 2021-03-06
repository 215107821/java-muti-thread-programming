package _6._4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Run {
	public static void main(String[] args) {

		try {
			MyObject myObject = MyObject.getInstance();

			FileOutputStream fos = new FileOutputStream(new File("MyObjectFile.txt"));

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(myObject);

			oos.close();

			fos.close();

			System.out.println(myObject.hashCode());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {

			FileInputStream fis = new FileInputStream(new File("MyObjectFile.txt"));

			ObjectInputStream ois = new ObjectInputStream(fis);

			MyObject myObject = (MyObject) ois.readObject();

			ois.close();

			fis.close();

			System.out.println(myObject.hashCode());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
