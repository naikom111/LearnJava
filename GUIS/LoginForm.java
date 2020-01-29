import javax.swing.*;

public class LoginForm
{
public static void main(String[] args)
{
JFrame f=new JFrame();
//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JLabel j1=new JLabel("Enter Username");
JLabel j2=new JLabel("Enter Password");
j1.setBounds(10,100,200,50);
j2.setBounds(10,300,200,50);
JTextField jt1=new JTextField();
JTextField jt2=new JTextField();
jt1.setBounds(260,100,200,50);
jt2.setBounds(260,300,200,50);

f.add(j1);
f.add(j2);
f.add(jt1);
f.add(jt2);
f.setSize(400,500);
f.setLayout(null);
f.setVisible(true);
//f.dispose();
//f.dispatchEvent(new WindowEvent(f,WindowEvent.WINDOW_CLOSING));
}
}
