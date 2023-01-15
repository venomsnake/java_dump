import java.io.*;
import java.net.*;

class MyClient{

	public static void main(String[] args){
		try{
			Socket soc = new Socket("localhost", 6666);
			DataOutputStream doo = new DataOutputStream(soc.getOutputStream());
			doo.writeUTF("help");
			doo.flush();
		}
		catch(Exception e){
			System.out.print(e);
		}

	}
}