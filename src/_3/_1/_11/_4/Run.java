package _3._1._11._4;

public class Run {
	public static void main(String[] args) {
		MyStack myStack = new MyStack();

		P p = new P(myStack);
		C c = new C(myStack);

		P_Thread tp = new P_Thread(p);
		C_Thread tc = new C_Thread(c);

		tp.start();
		tc.start();
	}
}
