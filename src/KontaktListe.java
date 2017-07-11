package newtcpGUIBeginner;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JList;

public class KontaktListe extends JFrame{
	
	public JComponent liste;
	DefaultListModel listModel = new DefaultListModel();
	
	public KontaktListe(DefaultListModel aDLM) {
		listModel = aDLM;
		liste = new JList(aDLM);
		
		this.setSize(200,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		 MouseListener mouseListener = new MouseAdapter() {
		      public void mouseClicked(MouseEvent mouseEvent) {
		        JList theList = (JList) mouseEvent.getSource();
		        if (mouseEvent.getClickCount() == 2) {
		          int index = theList.locationToIndex(mouseEvent.getPoint());
		          if (index >= 0) {
		            Object o = theList.getModel().getElementAt(index);
		            //Text of Element: o.toString();
		            
		            ChatFenster cf = new ChatFenster(o.toString());
		            cf.setVisible(true);
		          }
		        }
		      }
		    };
		    liste.addMouseListener(mouseListener);
		
		this.add(liste);
		
		
		
		
	}
	
	public void setKontaktListe(DefaultListModel AListModel){
		listModel.addElement(AListModel);		
	}
}
