import java.net.*;
import java.io.*;
import java.util.Scanner;;

public class Cliente extends Thread{
	
	private DataInputStream in;
	private DataOutputStream out;
	private Socket client;
	private int number1;
	private int number2;
	public Cliente(String str,int socketPort,int n1,int n2)
	{
		try{
			client = new Socket(str,socketPort);
			in = new DataInputStream(client.getInputStream());
			out = new DataOutputStream(client.getOutputStream());
			number1 = n1;
			number2 = n2;
			
		}
		catch(Exception e)
		{
			
			System.out.println("e 2");
		}
		
	
	}
	
	public void run(){
		try
		{
			int result;
			
			/*lógica do negócio*/
			result = number1*number2;
			
			out.writeInt(result);
			in.close();
			out.close();
			client.close();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
