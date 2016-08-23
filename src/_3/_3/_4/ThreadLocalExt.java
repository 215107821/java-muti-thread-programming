package _3._3._4;

import java.util.Date;

public class ThreadLocalExt extends ThreadLocal {

	@Override
	protected Object initialValue() {

		return new Date().getTime();
	}
}
