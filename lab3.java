//<applet ="Test.class" height = 300 width = 300></applet>
import javax.swing.*;
import java.awt;
import java.awt.event.*;

class Test extends JApplet{

	public void init(){

		try{
			JLabel lb1 = new JLabel("Welcome");
			add(lb1);
		}
			catch(Exception e){System.out.println(e);}
		}
	}