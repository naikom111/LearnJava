import javax.swing.*;
public class LoginForm
{
public static void main(String[] args)
{
JFrame f=new JFrame();
JLabel j1=new JLabel("Enter Username");
JLabel j2=new JLabel("Enter Password");
j1.setBounds(10,100,200,50);
j2.setBounds(10,300,200,50);
f.add(j1);
f.add(j2);
f.setSize(400,500);
f.setLayout(null);
f.setVisible(true);
}
}
