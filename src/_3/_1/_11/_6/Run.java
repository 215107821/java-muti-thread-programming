package _3._1._11._6;

public class Run {
	public static void main(String[] args) {
		MyStack myStack = new MyStack();

		P p1 = new P(myStack);
		P p2 = new P(myStack);
		P p3 = new P(myStack);
		P p4 = new P(myStack);
		P p5 = new P(myStack);
		P p6 = new P(myStack);

		C c1 = new C(myStack);

		P_Thread tp1 = new P_Thread(p1);
		P_Thread tp2 = new P_Thread(p2);
		P_Thread tp3 = new P_Thread(p3);
		P_Thread tp4 = new P_Thread(p4);
		P_Thread tp5 = new P_Thread(p5);
		P_Thread tp6 = new P_Thread(p6);
		tp1.start();
		tp2.start();
		tp3.start();
		tp4.start();
		tp5.start();
		tp6.start();

		C_Thread tc1 = new C_Thread(c1);
		tc1.start();
	}
}
