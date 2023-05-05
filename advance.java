import java.lang.*;
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 
 
public class advance extends JFrame implements ActionListener
{  
	JButton b1,b2;
     advance()  
        {  
		
        JFrame f= new JFrame("advance");    
        JPanel panel=new JPanel(); 
		panel.setSize(new Dimension(1200,700));         
        panel.setBackground(Color.white);
		panel.setLayout(null);
		
		
		JLabel l1=new JLabel("Advanced Search");
		l1.setFont(new Font("Arial (Body CS)",Font.PLAIN,40));
		l1.setForeground(Color.black);
		l1.setBounds(20,20,400,45);
		
		JLabel l2=new JLabel("Find pages with....");
		l2.setFont(new Font("Arial (Body CS)",Font.PLAIN,30));
		l2.setForeground(Color.black);
		l2.setBounds(20,80,300,40);
		
		
		JLabel l3=new JLabel("To do this in the search box.");
		l3.setFont(new Font("Arial (Body CS)",Font.PLAIN,20));
		l3.setForeground(Color.black);
		l3.setBounds(760,82,350,30);
		
		
		JLabel l4=new JLabel("all these words:");
		l4.setFont(new Font("Arial (Body CS)",Font.PLAIN,25));
		l4.setForeground(Color.black);
		l4.setBounds(20,140,250,30);
		
		JTextField t1 = new JTextField();
		t1.setBounds(330,140,400,40);
		
		
		JLabel l5=new JLabel("Type the important words:");
		l5.setFont(new Font("Arial (Body CS)",Font.PLAIN,20));
		l5.setForeground(Color.black);
		l5.setBounds(760,140,250,30);
			
		
		JLabel l6=new JLabel("this exact word or phrase:");
		l6.setFont(new Font("Arial (Body CS)",Font.PLAIN,25));
		l6.setForeground(Color.black);
		l6.setBounds(20,190,290,30);
		
		JTextField t2 = new JTextField();
		t2.setBounds(330,190,400,40);
		
		JLabel l7=new JLabel("Put exact words in quotes:");
		l7.setFont(new Font("Arial (Body CS)",Font.PLAIN,20));
		l7.setForeground(Color.black);
		l7.setBounds(760,190,290,30);
		
	
		JLabel l8=new JLabel("Then narrow your results by ...");
		l8.setFont(new Font("Arial (Body CS)",Font.PLAIN,30));
		l8.setForeground(Color.black);
		l8.setBounds(20,240,400,40);
		
		JLabel l9=new JLabel("language:");
		l9.setFont(new Font("Arial (Body CS)",Font.PLAIN,25));
		l9.setForeground(Color.black);
		l9.setBounds(20,290,300,30);
		
		
		JTextField t3 = new JTextField();
		t3.setBounds(330,290,400,40);
		
		JLabel l10=new JLabel("Find pages in the language:");
		l10.setFont(new Font("Arial (Body CS)",Font.PLAIN,20));
		l10.setForeground(Color.black);
		l10.setBounds(760,290,400,30);
		
		JLabel l11=new JLabel("region:");
		l11.setFont(new Font("Arial (Body CS)",Font.PLAIN,25));
		l11.setForeground(Color.black);
		l11.setBounds(20,340,300,30);
		
		
		JTextField t4 = new JTextField();
		t4.setBounds(330,340,400,40);
		
		JLabel l12=new JLabel("Find pages published in a particular region:");
		l12.setFont(new Font("Arial (Body CS)",Font.PLAIN,20));
		l12.setForeground(Color.black);
		l12.setBounds(760,340,400,35);
		
		JLabel l13=new JLabel("site or domain:");
		l13.setFont(new Font("Arial (Body CS)",Font.PLAIN,25));
		l13.setForeground(Color.black);
		l13.setBounds(20,390,300,30);
		
		
		JTextField t5 = new JTextField();
		t5.setBounds(330,390,400,40);
		
		JLabel l14=new JLabel("Search one site or limit your result:");
		l14.setFont(new Font("Arial (Body CS)",Font.PLAIN,20));
		l14.setForeground(Color.black);
		l14.setBounds(760,390,400,30);
		
		JLabel l15=new JLabel("file type:");
		l15.setFont(new Font("Arial (Body CS)",Font.PLAIN,25));
		l15.setForeground(Color.black);
		l15.setBounds(20,440,300,30);
		
		
		JTextField t6 = new JTextField();
		t6.setBounds(330,440,400,40);
		
		JLabel l16=new JLabel("Find pages in the format:");
		l16.setFont(new Font("Arial (Body CS)",Font.PLAIN,20));
		l16.setForeground(Color.black);
		l16.setBounds(760,440,400,30);
		
		
		JButton b1=new JButton();
		b1.setText("Advance search");
		b1.setFont(new Font("Times New Roman",Font.BOLD,30));
        b1.setBounds(780,550,255,40);

        b1.setForeground(Color.black);		
        b1.setBackground(Color.white);
		
		
		JButton b2=new JButton();
		b2.setText("Back");
		b2.setFont(new Font("Times New Roman",Font.BOLD,30));
        b2.setBounds(20,550,155,40);
        b2.addActionListener(this);
        b2.setForeground(Color.black);		
        b2.setBackground(Color.white);
		
		
		
		
		
		panel.add(l1);
		panel.add(l2);
		panel.add(l3);
		panel.add(l4);
		panel.add(l5);
		panel.add(l6);
		panel.add(l7);
		panel.add(l8);
		panel.add(l9);
		panel.add(l10);
		panel.add(l11);
		panel.add(l12);
		panel.add(l13);
		panel.add(l14);
		panel.add(l15);
		panel.add(l16);
		
		panel.add(t1);
		panel.add(t2);
		panel.add(t3);
		panel.add(t4);
		panel.add(t5);
		panel.add(t6);
		
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
		 // public static void main(String args[])  
       // {  
       // new advance();  
       // } 
		
    }