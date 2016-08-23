package _2._2._7._2;

public class Service {
	private String usernameParam;
	private String passwordParam;

	public void setUsernamePassword(String username, String password) {
		String anyString = new String();

		try {
			synchronized (anyString) {
				System.out.println("线程名称为： " + Thread.currentThread().getName() + "在 "
						+ System.currentTimeMillis() + "进入同步块");

				usernameParam = username;

				Thread.sleep(3000);

				passwordParam = password;

				System.out.println("线程名称为： " + Thread.currentThread().getName() + "在 "
						+ System.currentTimeMillis() + "离开同步块");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
