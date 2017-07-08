package newtcpGUIBeginner;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable{

	private ServerSocket srvr;
	private Socket skt;
	private String data;
	private PrintWriter out;
	private int port;
	
	public Server(int APort) {
		this.port = APort;		
	}
	
	@Override
	public void run() {
		try {
			 srvr = new ServerSocket(1234);
	         skt = srvr.accept();
	         System.out.print("Server has connected!\n");
	         PrintWriter out = new PrintWriter(skt.getOutputStream(), true);
	         System.out.print("Sending string: '" + data + "'\n");	         
	         out.print(data);	         	         
	      }
	      catch(Exception e) {
	         System.out.print("Whoops! It didn't work!\n");
	         out.close();
	         try {
				skt.close();
				srvr.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	         
	      }
	}
	
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
}
