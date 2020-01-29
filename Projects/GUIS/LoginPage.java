import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import MasterFrame.MasterFrame;

public class LoginPage implements ActionListener
{

public LoginPage()
{
MasterFrame f=new MasterFrame("Login Page");
f.setSize(500,500);
Container c=f.getContentPane();
JLabel j1=new JLabel("Enter Username");
JLabel j2=new JLabel("Enter Password");
j1.setBounds(10,100,200,50);
j2.setBounds(10,300,200,50);
JTextField jt1=new JTextField();
JPasswordField jp1=new JPasswordField();
jt1.setBounds(260,100,200,50);
jp1.setBounds(260,300,200,50);
c.add(j1);
c.add(j2);
c.add(jt1);
c.add(jp1);
JButton jb1=new JButton("Login");
JButton jb2=new JButton("Cancel");
jb1.addActionListener(this);
jb2.addActionListener(this);
jb1.setBounds(10,400,200,50);
jb2.setBounds(260,400,200,50);
c.add(jb1);
c.add(jb2);
f.setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
//if(ae.getSource==jb1)
//{

//}
}
public static void main(String args[])
{
LoginPage l1=new LoginPage();
}
}
