package _3._1._14;

public class BackUpA extends Thread {
	private DBTools dbTools;

	public BackUpA(DBTools dbTools) {
		super();
		this.dbTools = dbTools;
	}

	@Override
	public void run() {
		dbTools.backupA();
	}
}
