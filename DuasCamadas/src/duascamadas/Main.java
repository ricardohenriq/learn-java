import java.util.*;
public class Main extends Thread{
	public static void main(String[] args)
	{
		for(int i = 0; i < 5;i++)
		{			
			Thread t1 = new Thread( new Cliente("localhost",9300,i,i*i) );
			t1.start();
		}
		
	}
}
