package _3._1._11._5;

import java.util.ArrayList;
import java.util.List;

/**
 * 本示例是使生产者想堆栈List对象中放入数据，使消费者从List堆栈中取出数据。<br>
 * List最大容量是1
 * 
 * @date 2016年8月24日 下午8:01:15
 */
public class MyStack {
	private List list = new ArrayList();

	synchronized public void push() {
		try {
			if (list.size() == 1) {
				this.wait();
			}

			list.add("anyString=" + Math.random());
			this.notify();
			System.out.println("push=" + list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	synchronized public String pop() {
		String returnValue = "";
		try {
			if (list.size() == 0) {
				System.out.println("pop操作中的：" + Thread.currentThread().getName() + " 线程呈wait状态");
				this.wait();
			}

			returnValue = "" + list.get(0);
			list.remove(0);
			this.notify();
			System.out.println("pop=" + list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnValue;
	}
}
