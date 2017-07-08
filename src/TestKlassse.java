package newtcpGUIBeginner;

public class TestKlassse {

	public TestKlassse() {
	}

	public static void main(String[] args) {		
		Server svr = new Server(1234);
		Client clnt = new Client("127.0.0.1");

		
		Thread t1 = new Thread(svr);
		Thread t2 = new Thread(clnt);
		
		
		t1.start();
		t2.start();
	}

}
