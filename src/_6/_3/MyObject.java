package _6._3;

/**
 * 使用静态内置类实现单例模式
 * 
 * @date 2016年8月23日 下午8:32:38
 */
public class MyObject {
	private static class MyObjectHandler {
		private static MyObject myObject = new MyObject();
	}

	private MyObject() {

	}

	public static MyObject getInstance() {
		return MyObjectHandler.myObject;
	}
}
