package daemonthread;

public class Daemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Typingcode t1=new Typingcode();
		Savingcode t2=new Savingcode();
		Compliecode t3=new Compliecode();
		t2.setDaemon(true);
		t3.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();

	}

}
