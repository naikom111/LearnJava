import javax.swing.*;

public class MainPage
{
public static void main(String[] args)
{
JFrame f=new JFrame();
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JButton j1=new JButton("Student Registration");
JButton j2=new JButton("Book Entry");
JButton j3=new JButton("Issue Book");
JButton j4=new JButton("Return Book");

j1.setBounds(50,50,200,50);
j2.setBounds(50,150,200,50);
j3.setBounds(50,250,200,50);
j4.setBounds(50,350,200,50);
f.add(j1);
f.add(j2);
f.add(j3);
f.add(j4);
f.setSize(300,500);
f.setLayout(null);
f.setVisible(true);
//f.dispose();
//f.dispatchEvent(new WindowEvent(f,WindowEvent.WINDOW_CLOSING));
}
}
