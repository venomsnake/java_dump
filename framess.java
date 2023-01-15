import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Test_frames extends JFrame implements ActionListener{

	JLabel lb1, lb2,lb3;
	JTextField txt1,txt2,txt3;
	JButton btn,btn2;
	JFrame fr1;
	FlowLayout fl;
	Test_frames(){
		lb1 = new JLabel("num1");
		lb2 = new JLabel("num2");
		lb3 = new JLabel("num3");

		fl = new FlowLayout();

		txt1 = new JTextField(15);
		txt2 =  new JTextField(15);
		txt3 = new JTextField(15);

		btn = new JButton("small");
		btn2 = new JButton("Greater");
		fr1 = new JFrame("Test");

		fr1.add(lb1);
		fr1.add(lb2);
		fr1.add(lb3);
		fr1.add(txt1);
		fr1.add(txt2);
		fr1.add(txt3);
		fr1.add(btn);
		fr1.add(btn2);
		fr1.setLayout(new FlowLayout());
		fr1.setSize(300,300);
		fr1.setVisible(true);

		btn.addActionListener(this);
		btn2.addActionListener(this);
	}

		public void actionPerformed(ActionEvent e) {
    
    	//String action = e.getActionCommand();
		int num = Integer.parseInt(txt1.getText());
	    int num_2 = Integer.parseInt(txt2.getText());
    	if(e.getSource() == btn){

    		if(num>num_2){
    			String s1 = String.valueOf(num);
    			txt3.setText(s1);
    		}
    	}
    	else{
    		String s2 = String.valueOf(num_2);
    		txt3.setText(s2);
    	}
	}
	public static void main(String[] args){
		Test_frames t1 = new Test_frames();

	}
	
}