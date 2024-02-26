package daemonthread;

public class Savingcode extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Saving code");
			try {
					Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
