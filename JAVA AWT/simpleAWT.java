import java.awt.*;  
class First extends Frame{  
First(String s){  
super(s);
Button b=new Button("click me");  
b.setBounds(30,100,80,30);// setting button position  
add(b);//adding button into frame  
setSize(800,800);//frame size 300 width and 300 height  
setLayout(null);//no layout manager  
setVisible(true);//now frame will be visible, by default not visible  
}  
public static void main(String args[]){  
First f=new First("hi");  
}}  
