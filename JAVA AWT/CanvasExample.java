import java.awt.*;  
public class CanvasExample  
{    
  public static void main(String args[])  
  {  
    Frame f= new Frame("Canvas Example");  
    f.add(new MyCanvas());  
    f.setLayout(null);  
    f.setSize(400, 400);  
    f.setVisible(true); 
  }  
}  
class MyCanvas extends Canvas
{
MyCanvas()
{
	setBackground(Color.yellow);
	setSize(100,100);
}
public void paint(Graphics g)
{
	g.setColor(Color.white);
	g.fillOval(50,50,50,50);
}
}

   
