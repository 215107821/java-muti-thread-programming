package _3._1._14;

public class BackUpB extends Thread {
	private DBTools dbTools;

	public BackUpB(DBTools dbTools) {
		super();
		this.dbTools = dbTools;
	}

	@Override
	public void run() {
		dbTools.backupB();
	}
}
