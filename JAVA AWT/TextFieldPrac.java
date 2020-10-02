import java.awt.*;
import java.awt.event.*;
class TextFieldPrac
{
	public static void main(String arg[])
	{
		Frame f=new Frame("TextField");Button b=new Button("count");
		TextArea ta=new TextArea("sample");
		ta.setBounds(100,100,200,200);
		f.setSize(500,500);
		Label l=new Label();
		l.setBounds(50,50,100,20);
		b.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
	{
		String s=ta.getText();
		l.setText("Charcters : "+s.length());
	}});b.setBounds(150,340,80,20);
		f.setLayout(null);
		f.setVisible(true);f.add(ta);f.add(l);f.add(b);
	}
	
}
