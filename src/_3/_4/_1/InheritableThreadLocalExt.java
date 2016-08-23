package _3._4._1;

import java.util.Date;

public class InheritableThreadLocalExt extends InheritableThreadLocal {

	@Override
	protected Object initialValue() {
		return new Date().getTime();
	}
}
