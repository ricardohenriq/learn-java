package teste;

import java.net.*;
import java.io.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server extends Thread {
	
	public static void main(String args[]) throws Exception {
		ServerSocket server = new ServerSocket(9300);
		DataInputStream in;
		DataOutputStream out;
		/*BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<Runnable>();
		int maximumPoolSize = 10;
		ThreadPoolExecutor t23 = new ThreadPoolExecutor(50, maximumPoolSize , 82, TimeUnit.SECONDS, workQueue );
		Runnable target = null;
		t23.execute(target);*/
		int i = 1;
		int maximumConnections = 9999;
		
		while(true)
		{
			DatagramSocket asocket = new DatagramSocket();
			asocket.setSoTimeout(10);
			Socket socket = server.accept();
			in = new DataInputStream(socket.getInputStream());
			out = new DataOutputStream(socket.getOutputStream());
			int result = in.readInt();
			System.out.println("Recebendo o resultado");
			if(armazenar(result) == true)
				System.out.println("Resultado lido e armazenado - "+result);
			else
				System.out.println("Resultado lido mas NÃO armazenado - "+result);
			
			i++;
			if(i == maximumConnections)
				break;
		}
		in.close();
		out.close();
		server.close();
	}
	
	/*
	 *Armazenar em um BD
	 */
	public static boolean armazenar(int num)
	{
		return true;
	}
} 
