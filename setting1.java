import java.awt.*;  
import javax.swing.*; 
import java.awt.event.*;
 
 
 class setting1 implements ActionListener
 {  
     
	 JLabel l1,l2,l3,l4,l5;
	 JButton b1,b2,b3,b4,b5,b6;	
	 ImageIcon icon6;
	 
	 JFrame settingFrame;


     setting1()  
     { 
		
      settingFrame = new JFrame(); 
	  
	  icon6 =new ImageIcon("settings.png");
		l5=new JLabel(icon6);
		l5.setBounds(0,0,1366,850);

		l1 = new JLabel();
		l1.setText("Quick Settings");
		l1.setFont(new Font("Times New Roman",Font.PLAIN,36));
		l1.setForeground(Color.black);
		l1.setBounds(60,20,300,45);
		
		l2 = new JLabel();
		l2.setText("Privacy");
		l2.setFont(new Font("Arial (Body CS)",Font.PLAIN,30));
		l2.setForeground(Color.black);
		l2.setBounds(625,120,150,35);
		
		

		
		//Search history
	   b1 = new JButton();
		b1.setText("Search history");
		b1.setFont(new Font("Times New Roman",Font.BOLD,25));
      b1.setBounds(550,180,255,30);
      b1.setForeground(Color.black);		
      b1.setBackground(Color.white);
      b1.addActionListener(this);
		
		
		
		
		
		l3 = new JLabel();
		l3.setText("Using search");
		l3.setFont(new Font("Arial (Body CS)",Font.PLAIN,30));
		l3.setForeground(Color.black);
		l3.setBounds(590,240,300,35);
		
		//Safe search
      b2 = new JButton();
      b2.setText("Safe search");
		b2.setFont(new Font("Times New Roman",Font.BOLD,25));		
      b2.setBounds(550,300,255,30); 
      b2.setForeground(Color.black);		
      b2.setBackground(Color.white);
		b2.addActionListener(this);
		
		
		//Language
		b3 = new JButton();
		b3.setText("Language");
		b3.setFont(new Font("Times New Roman",Font.BOLD,25));
      b3.setBounds(550,360,255,30);
		b3.setForeground(Color.black);
      b3.setBackground(Color.white);
		b3.addActionListener(this);
		
		
		//Advance search
		b4 = new JButton();
		b4.setText("Advance search");
		b4.setFont(new Font("Times New Roman",Font.BOLD,25));
      b4.setBounds(550,420,255,30);
		b4.setForeground(Color.black);
      b4.setBackground(Color.white);
		b4.addActionListener(this);
		 
		
		
		l4 = new JLabel();
		l4.setText("Appearance");
		l4.setFont(new Font("Arial (Body CS)",Font.PLAIN,30));
		l4.setForeground(Color.black);
		l4.setBounds(600,490,300,35);
		
		
		//Theme
		b5 = new JButton();
		b5.setText("Theme");
		b5.setFont(new Font("Times New Roman",Font.BOLD,25));
      b5.setBounds(550,550,255,30);
		b5.setForeground(Color.black);
      b5.setBackground(Color.white);
		b5.addActionListener(this);
		 
		
		
		b6 = new JButton("Back");  		
      b6.setBounds(1150,710,80,35); 
		b6.setForeground(Color.black);
      b6.setBackground(Color.white);
      b6.addActionListener(this);
		
       
		  
      settingFrame.setSize(1450,900);    
      settingFrame.setLayout(null);    
      settingFrame.setVisible(true); 
      settingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  settingFrame.setResizable(false);

		settingFrame.add(l1);
		settingFrame.add(l2);
		settingFrame.add(l3);
		settingFrame.add(l4);

		settingFrame.add(b1);
		settingFrame.add(b2);
		settingFrame.add(b3);
		settingFrame.add(b4);
		settingFrame.add(b5);				
		settingFrame.add(b6);
		settingFrame.add(l5);
    }
		public void actionPerformed(ActionEvent ae)
		{
			 if(ae.getSource() == b6)
			{
				settingFrame.setVisible(false);
				new home1();
				
			}
			 if(ae.getSource() == b4)
			{
				settingFrame.setVisible(false);
			   new advance();

			}
			if(ae.getSource() == b1)
			{
				settingFrame.setVisible(false);
			   new history();

			}
			if(ae.getSource() == b3)
			{
				settingFrame.setVisible(false);
			   new language();
			}
			if (ae.getSource() == b5)
			{
				settingFrame.setVisible(false);
			   new theme();
			}
			if(ae.getSource() == b2);
			{
				settingFrame.setVisible(false);
				new safesearch();

			}
		}
           				
 }
 