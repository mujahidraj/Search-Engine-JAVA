import java.lang.*;
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 
 
public class language extends JFrame implements ActionListener
{  
	JButton b1,b2;
     language()  
        {  
        JFrame f= new JFrame("advance");    
        JPanel panel=new JPanel(); 
		panel.setSize(new Dimension(1200,700));         
        panel.setBackground(Color.white);
		panel.setLayout(null);
		
		
		JLabel l1=new JLabel();
		l1.setText("Current device language");
		l1.setFont(new Font("Arial (Body CS)",Font.PLAIN,40));
		l1.setForeground(Color.black);
		l1.setBounds(20,20,600,45);
		
		JLabel l2=new JLabel();
		l2.setText("English(United kingdom)");
		l2.setFont(new Font("Arial (Body CS)",Font.PLAIN,40));
		l2.setForeground(Color.black);
		l2.setBounds(20,60,600,45);
		
		
		JLabel l3=new JLabel();
		l3.setText("Content languages");
		l3.setFont(new Font("Arial (Body CS)",Font.PLAIN,40));
		l3.setForeground(Color.black);
		l3.setBounds(20,130,600,45);
		
		JLabel l4=new JLabel();
		l4.setText("English(United kingdom)");
		l4.setFont(new Font("Arial (Body CS)",Font.PLAIN,40));
		l4.setForeground(Color.black);
		l4.setBounds(20,180,600,45);
		
		
		JLabel l5=new JLabel();
		l5.setText("English(United kingdom)");
		l5.setFont(new Font("Arial (Body CS)",Font.PLAIN,40));
		l5.setForeground(Color.black);
		l5.setBounds(20,220,600,45);
		
		
		JLabel l6=new JLabel();
		l6.setText("English");
		l6.setFont(new Font("Arial (Body CS)",Font.PLAIN,40));
		l6.setForeground(Color.black);
		l6.setBounds(20,260,600,45);
		
		
		
		JButton b1=new JButton();
		b1.setText("Save");
		b1.setFont(new Font("Times New Roman",Font.BOLD,30));
        b1.setBounds(800,540,255,40);
        b1.setForeground(Color.black);		
        b1.setBackground(Color.white);
		
		JButton b2=new JButton();
		b2.setText("Back");
		b2.setFont(new Font("Times New Roman",Font.BOLD,30));
        b2.setBounds(20,540,155,40);
        b2.addActionListener(this);
        b2.setForeground(Color.black);		
        b2.setBackground(Color.white);
		
		
		panel.add(l1);
		panel.add(l2);
		panel.add(l3);
		panel.add(l4);
		panel.add(l5);
		panel.add(l6);
		panel.add(b1);
		panel.add(b2);
		
		
		
		
		
		
		
		f.add(panel);  
                f.setSize(1200,700);    
                f.setLayout(null);    
                f.setVisible(true); 
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        f.setResizable(false);
		
		}
		public void actionPerformed(ActionEvent ae)
        {
             if(ae.getSource()==b2);
            {
                setting1 s1 = new setting1();
                this.setVisible(false);
                //s1.setVisible(true);
             }
          }
		
		
		
        public static void main(String args[])  
        {  
        new language();  
        } 
		
    }  