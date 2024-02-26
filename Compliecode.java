package daemonthread;

public class Compliecode extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("compile code");
			try {
					Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
