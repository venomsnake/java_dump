import java.io.*;

class Testio{

	public static void main(String[] args){
		String s = "Haha Whaman";
		//byte s[]=st.getBytes();
		try{
			FileInputStream fi =  new FileInputStream("C:\\Users\\markr\\Desktop\\jdbchuh\\sample.txt");
			FileOutputStream fo = new FileOutputStream("C:\\Users\\markr\\Desktop\\jdbchuh\\sample.txt");
			//if(int c = fi.read()!=-1){
				fo.write(s);
			//}
			fo.close();
			int read_bit = 0;
			while((read_bit = fi.read())!=-1){
				System.out.print((char)read_bit);
			}
		}
		catch(Exception e){
			System.out.println("Error!");
		}
	}
}