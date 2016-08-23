package _2._2._7._5;

import java.util.ArrayList;
import java.util.List;

public class MyOneList {

	private List list = new ArrayList<>();

	synchronized public void add(String data) {
		list.add(data);
	}

	synchronized public int getSize() {
		return list.size();
	}

}
