package _3._1._11._5_2;

public class C {
	private MyStack myStack;

	public C(MyStack myStack) {
		super();
		this.myStack = myStack;
	}

	public void popService() {
		System.out.println("pop=" + myStack.pop() + " by " + Thread.currentThread().getName());
	}
}
