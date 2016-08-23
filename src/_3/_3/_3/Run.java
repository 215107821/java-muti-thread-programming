package _3._3._3;

public class Run {
	public static ThreadLocalExt tl = new ThreadLocalExt();

	public static void main(String[] args) {
		if (null == tl.get()) {
			System.out.println("从未放过值");
			tl.set("我的值");
		}

		System.out.println(tl.get());
		System.out.println(tl.get());

	}
}
