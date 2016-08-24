package _3._1._11._5_2;

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
			while (list.size() == 1) {
				this.wait();
			}

			list.add("anyString=" + Math.random() + " by " + Thread.currentThread().getName());
			this.notifyAll();
			System.out.println("push=" + list.size() + " by " + Thread.currentThread().getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	synchronized public String pop() {
		String returnValue = "";
		try {
			while (list.size() == 0) {
				System.out.println("pop操作中的：" + Thread.currentThread().getName() + " 线程呈wait状态");
				this.wait();
			}

			returnValue = "" + list.get(0);
			list.remove(0);
			this.notifyAll();
			System.out.println("pop=" + list.size() + " by " + Thread.currentThread().getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnValue;
	}
}
