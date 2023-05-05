import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class safesearch extends JFrame implements ActionListener 
{  
	JButton b1;
     safesearch()  
        {  
        JFrame f= new JFrame("safe search");    
        JPanel panel=new JPanel(); 
		panel.setSize(new Dimension(1200,700));         
        panel.setBackground(Color.white);
		panel.setLayout(null);
		
		JLabel l1=new JLabel();
		l1.setText("Explicit results filter");
		l1.setFont(new Font("Arial (Body CS)",Font.PLAIN,40));
		l1.setForeground(Color.black);
		l1.setBounds(20,20,600,45);
		
		
		JLabel l2=new JLabel();
		l2.setText("When safe search is on, it helps hide explicit content on search");
		l2.setFont(new Font("Arial (Body CS)",Font.PLAIN,30));
		l2.setForeground(Color.black);
		l2.setBounds(20,90,1100,45);
		
		JLabel l3=new JLabel();
		l3.setText("When safe search is off, you'll see the most relevant result for your search.");
		l3.setFont(new Font("Arial (Body CS)",Font.PLAIN,30));
		l3.setForeground(Color.black);
		l3.setBounds(20,140,1100,40);
		
		JLabel l4=new JLabel();
		l4.setText("which may include explicit content like image of violence.");
		l4.setFont(new Font("Arial (Body CS)",Font.PLAIN,30));
		l4.setForeground(Color.black);
		l4.setBounds(20,180,1100,40);
		
		JLabel l5=new JLabel();
		l5.setText("More about safeSearch");
		l5.setFont(new Font("Arial (Body CS)",Font.PLAIN,30));
		l5.setForeground(Color.black);
		l5.setBounds(20,240,1100,45);
		
		JLabel l6=new JLabel();
		l6.setText("While SafeSearch isn't 100% accurate,its design to help block explicit result,.");
		l6.setFont(new Font("Arial (Body CS)",Font.PLAIN,30));
		l6.setForeground(Color.black);
		l6.setBounds(20,290,1100,40);
		
		JLabel l7=new JLabel();
		l7.setText("like pornography, from your khoj search reasult.");
		l7.setFont(new Font("Arial (Body CS)",Font.PLAIN,30));
		l7.setForeground(Color.black);
		l7.setBounds(20,330,1100,40);
		
		JLabel l8=new JLabel();
		l8.setText("It can be turned on for:");
		l8.setFont(new Font("Arial (Body CS)",Font.PLAIN,30));
		l8.setForeground(Color.black);
		l8.setBounds(20,390,1100,40);
		
		JButton b1=new JButton();
		b1.setText("Back");
		b1.setFont(new Font("Times New Roman",Font.BOLD,30));
        b1.setBounds(20,540,155,40);
        b1.addActionListener(this);
        b1.setForeground(Color.black);		
        b1.setBackground(Color.white);
		
		
		
		
		
		
		
		
		
		
		panel.add(l1);
		panel.add(l2);
		panel.add(l3);
		panel.add(l4);
		panel.add(l5);
		panel.add(l6);
		panel.add(l7);
		panel.add(l8);
		panel.add(b1);
		f.add(panel);  
                f.setSize(1200,700);    
                f.setLayout(null);    
                f.setVisible(true); 
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        f.setResizable(false);
		
		}
		 public void actionPerformed(ActionEvent ae)
        {
             if(ae.getSource()==b1);
            {
                setting1 s1 = new setting1();
                this.setVisible(false);
                //s1.setVisible(true);
             }
          }
}

