package _3._1._11._5;

public class Run {
	public static void main(String[] args) {
		MyStack myStack = new MyStack();

		P p = new P(myStack);
		C c1 = new C(myStack);
		C c2 = new C(myStack);
		C c3 = new C(myStack);
		C c4 = new C(myStack);
		C c5 = new C(myStack);

		P_Thread tp = new P_Thread(p);
		tp.start();

		C_Thread tc1 = new C_Thread(c1);
		C_Thread tc2 = new C_Thread(c2);
		C_Thread tc3 = new C_Thread(c3);
		C_Thread tc4 = new C_Thread(c4);
		C_Thread tc5 = new C_Thread(c5);
		tc1.start();
		tc2.start();
		tc3.start();
		tc4.start();
		tc5.start();
	}
}
