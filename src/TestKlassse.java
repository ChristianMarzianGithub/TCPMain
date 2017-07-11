package newtcpGUIBeginner;

import javax.swing.DefaultListModel;

public class TestKlassse {

	public TestKlassse() {
	}

	public static void main(String[] args) {		
		Server svr = new Server(1234);
		Client clnt = new Client("127.0.0.1");

		
		Thread t1 = new Thread(svr);
		Thread t2 = new Thread(clnt);
		
	
		DefaultListModel dlm = new DefaultListModel();
		dlm.addElement("asdf");
		dlm.addElement("qwer");
		dlm.addElement("opui");
		
		
		
		KontaktListe x = new KontaktListe(dlm);
		x.setVisible(true);
		
		//t1.start();
		//t2.start();
		
		
		
	}

}
