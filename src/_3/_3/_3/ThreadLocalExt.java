package _3._3._3;

public class ThreadLocalExt extends ThreadLocal {

	@Override
	protected Object initialValue() {

		return "我是默认值 第一次get不再为null";
	}
}
