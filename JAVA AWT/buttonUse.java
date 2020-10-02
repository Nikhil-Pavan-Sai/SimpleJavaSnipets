import java.awt.*;
import java.awt.event.*;  
class buttonUse implements ActionListener
{
	Frame f;TextField tf;Label l;
	buttonUse()
	{
		f=new Frame("Use button");
		tf=new TextField();
		Button b=new Button("click");
		l = new Label();
		l.setBounds(200,200,400,50);
		tf.setBounds(10,50,250,50);
		b.setBounds(50,300,100,30);
		b.addActionListener(this);
		f.add(b);f.add(tf);f.add(l);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){  
            String s =tf.getText(); 
		int a=Integer.parseInt(s);
		int b=a*a;
		l.setText("square = "+b);	 }
	public static void main(String arg[]){
	new buttonUse();}
}
		
