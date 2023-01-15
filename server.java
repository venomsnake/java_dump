import java.io.*;
import java.net.*;

class MyTestServer{
	public static void main(String[] args){
		try{
			ServerSocket s1 = new ServerSocket(6666);
			Socket soc = s1.accept();

			DataInputStream di = new DataInputStream(soc.getInputStream());

			String str = di.readUTF();
			System.out.println(str);
			s1.close();

		}
		catch(Exception e){
			System.out.println("Error"+ e);
		}
	}
}