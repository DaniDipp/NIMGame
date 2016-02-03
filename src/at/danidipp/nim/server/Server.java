package at.danidipp.nim.server;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable {
	
	ServerSocket server;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			//initializing the server-socket and the connection-socket
			server = new ServerSocket(8888);
			Socket connection = server.accept();
			
			//creating OutputWriter.
			PrintWriter writer = new PrintWriter(connection.getOutputStream());
	}

}
}
