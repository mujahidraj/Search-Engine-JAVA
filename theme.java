import java.lang.*;
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 import java.awt.image.*;
 
 
public class theme extends JFrame implements ActionListener
{  
	JButton b1;
    theme()  
        {  
        JFrame f= new JFrame("advance");    
        JPanel panel=new JPanel(); 
		panel.setSize(new Dimension(1200,700));         
        panel.setBackground(Color.white);
		panel.setLayout(null);
		

		JLabel l1=new JLabel();
		l1.setText("Appearance");
		l1.setFont(new Font("Arial (Body CS)",Font.PLAIN,40));
		l1.setForeground(Color.black);
		l1.setBounds(20,20,600,45);
		
		JLabel l2=new JLabel();
		l2.setText("Theme");
		l2.setFont(new Font("Arial (Body CS)",Font.PLAIN,40));
		l2.setForeground(Color.black);
		l2.setBounds(20,75,600,45);
		
		
	    String theme[]={"Light theme","Dark theme","Default theme"};        
        final JComboBox cb=new JComboBox(theme);    
        cb.setBounds(20, 150,200,40); 

        JLabel l3=new JLabel();
		l3.setText("Customize your homepage");
		l3.setFont(new Font("Arial (Body CS)",Font.PLAIN,30));
		l3.setForeground(Color.black);
		l3.setBounds(20,210,600,45);
		
		JLabel l4=new JLabel();
		l4.setText("Show menu bar");
		l4.setFont(new Font("Arial (Body CS)",Font.PLAIN,25));
		l4.setForeground(Color.black);
		l4.setBounds(20,260,600,30);
		
		
		JLabel l5=new JLabel();
		l5.setText("show homepage image");
		l5.setFont(new Font("Arial (Body CS)",Font.PLAIN,25));
		l5.setForeground(Color.black);
		l5.setBounds(20,300,600,30);
		
		JLabel l6=new JLabel();
		l6.setText("show most visited sites");
		l6.setFont(new Font("Arial (Body CS)",Font.PLAIN,25));
		l6.setForeground(Color.black);
		l6.setBounds(20,340,600,30);
		
		JButton b1=new JButton();
		b1.setText("Back");
		b1.setFont(new Font("Times New Roman",Font.BOLD,30));
		b1.addActionListener(this);
        b1.setBounds(20,540,155,40);
        b1.setForeground(Color.black);		
        b1.setBackground(Color.white);

		
        
		
		panel.add(l1);
		panel.add(l2);
		panel.add(cb); 
		panel.add(l3);
		panel.add(l4);
		panel.add(l5);
		panel.add(l6);
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
		
        public static void main(String args[])  
        {  
        new theme();  
        } 
		
    }  