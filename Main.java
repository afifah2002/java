import java.awt.*;
import java.awt.event.*;

public class Main extends Frame implements ActionListener{

TextField tf1,tf2;
Label l;
Button b;

Main()
{
tf1=new TextField();
tf1.setBounds(50,50,100,25);

tf2=new TextField();
tf2.setBounds(50,100,200,25);

l=new Label();
l.setBounds(50,150,200,50);

b=new Button("divide");
b.setBounds(50,200,100,50);
b.addActionListener(this);

add(tf1);
add(tf2);
add(b);
add(l);

setLayout(null);
setSize(800,800);
setVisible(true);

}
public void actionPerformed(ActionEvent ae)

{ 
try
{
String n1=tf1.getText();
String n2=tf2.getText();

l.setText("quotient is : "+(Integer.parseInt(n1))/(Integer.parseInt(n2)));
}
catch(NumberFormatException e)
{

System.out.println("cannot divide no numerical values");
}
catch(ArithmeticException e)
{
System.out.println("cannot divide by zero");

}
}
public static void main(	String agrs[])
{
new Main();
}
}







