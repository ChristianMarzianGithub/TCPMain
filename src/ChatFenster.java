package newtcpGUIBeginner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ChatFenster extends JFrame {

	public ChatFenster(String reciepient) {
		
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setTitle(reciepient);
		
		
		this.setLayout(null);
		
		JTextArea ta = new JTextArea();		
		ta.setSize(500,100);
		ta.setLocation(0, 300);
		this.add(ta);
		
		
		JButton btnSenden = new JButton("Senden");
		btnSenden.setSize(100, 25);
		btnSenden.setLocation(200, 400);
		this.add(btnSenden);

		JTextArea taReceipt = new JTextArea();		
		taReceipt.setSize(500,250);
		taReceipt.setLocation(0, 0);
		taReceipt.setEditable(false);
		this.add(taReceipt);
		
		
		
	}


}
