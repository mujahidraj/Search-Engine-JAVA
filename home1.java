import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class home1 implements ActionListener
{
		JFrame homeFrame;
	    
		JLabel l1,l2,l3,l4,l5;
		JTextField t1,t2;
		JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13; 
		JCheckBox c1,c2;
		ImageIcon icon1 = new ImageIcon("pointer.png");
		ImageIcon icon2 = new ImageIcon("setting.png");
		ImageIcon icon3 = new ImageIcon("plus.png");
		ImageIcon icon4 = new ImageIcon("facebook.png");
		ImageIcon icon5 = new ImageIcon("face.png");
		ImageIcon icon6;
		
		
		
	public home1()
	{
		homeFrame = new JFrame();
		
		 
		l1 = new JLabel("খোঁজ");
		l1.setHorizontalTextPosition(JLabel.CENTER);
		l1.setVerticalTextPosition(JLabel.TOP);
		l1.setFont(new Font("Nirmala UI",Font.BOLD,70));
		l1.setForeground(Color.white);
		l1.setBounds(550,20,400,300);		
		
		l2 = new JLabel (" Search "); 
		l2.setFont(new Font("Arial (Body CS)",Font.PLAIN,15));
		l2.setForeground(new Color(0x696969));
		l2.setBounds(400,300,150,25);
		
		
		l4 = new JLabel();
		l4.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l4.setForeground(Color.white);
		l4.setBounds(240,300,150,20);
		
		 l3=new JLabel("Enter Your Search : ");
		 l3.setFont(new Font("Arial (Body CS)",Font.PLAIN,20));
		 l3.setBounds(150,300,200,30);
		 l3.setBackground(Color.PINK);
		 l3.setForeground(Color.white);
		
		icon6 =new ImageIcon("Homepage.jpg");
		l5=new JLabel(icon6);
		l5.setBounds(0,0,1366,907);
		
		
		t1 = new JTextField();
		t1.setBounds(390,300,550,31);

		
		b1 = new JButton();
		b1.setForeground(Color.blue);
		b1.setBackground(Color.white);
		b1.setIcon(icon2);
		b1.setBounds(10,10,25,25);
		b1.addActionListener(this);

		b8 = new JButton("Contact");
		b8.setForeground(Color.blue);
		b8.setBackground(Color.white);
		b8.setBounds(10,670,100,25);
		b8.addActionListener(this);
		
		b2 = new JButton();
		b2.setBackground(Color.white);
		b2.setBounds(920,300,50,30);
		b2.setIcon(icon1); 
		b2.addActionListener(this);	
		
		
		b3 = new JButton("Help");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.setForeground(Color.blue);
		b3.setBackground(Color.white);
		b3.setBounds(1180,45,150,25);
		b3.addActionListener(this);
		
		
		
		b4 = new JButton("Contribution");
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b4.setForeground(Color.blue);
		b4.setBounds(1180,670,150,25);
		b4.setBackground(Color.white);
		b4.addActionListener(this);
		
		
		b5 = new JButton();
		b5.setText("Add shortcut");
		b5.setFont(new Font("Comic Sans MS",Font.BOLD,10));
		b5.setHorizontalTextPosition(JButton.CENTER);
		b5.setVerticalTextPosition(JButton.BOTTOM);
		b5.setForeground(Color.blue);
		b5.setBackground(Color.white);
		b5.setIcon(icon3);
		b5.setBounds(480,350,85,75);
		b5.setVisible(true);
		b5.addActionListener(this);
		
		
		b6 = new JButton();
		b6.setText("Facebook");
		b6.setFont(new Font("Comic Sans MS",Font.BOLD,10));
		b6.setHorizontalTextPosition(JButton.CENTER);
		b6.setVerticalTextPosition(JButton.BOTTOM);
		b6.setForeground(Color.blue);
		b6.setBackground(Color.white);
		b6.setIcon(icon4);
		b6.setBounds(390,350,85,75);
		b6.addActionListener(this);
		
		b9=new JButton();
		b9.setText("Google");
		b9.setFont(new Font("Times New Roman",Font.BOLD,10));
		b9.addActionListener(this);
        b9.setBounds(570,350,85,75);
        b9.setForeground(Color.blue);		
        b9.setBackground(Color.white);
		
		b13=new JButton();
		b13.setText("Document Search");
		b13.setFont(new Font("Times New Roman",Font.BOLD,13));
		b13.addActionListener(this);
        b13.setBounds(70,10,150,25);
        b13.setForeground(Color.blue);		
        b13.setBackground(Color.white);
		
		b10=new JButton();
		b10.setText("Wikipedia");
		b10.setFont(new Font("Times New Roman",Font.BOLD,10));
		b10.addActionListener(this);
        b10.setBounds(660,350,85,75);
        b10.setForeground(Color.blue);		
        b10.setBackground(Color.white);
		
		b11=new JButton();
		b11.setText("Youtube");
		b11.setFont(new Font("Times New Roman",Font.BOLD,10));
		b11.addActionListener(this);
        b11.setBounds(750,350,85,75);
        b11.setForeground(Color.blue);		
        b11.setBackground(Color.white);
		
		b12=new JButton();
		b12.setText("Gmail");
		b12.setFont(new Font("Times New Roman",Font.BOLD,10));
		b12.addActionListener(this);
        b12.setBounds(840,350,85,75);
        b12.setForeground(Color.blue);		
        b12.setBackground(Color.white);
		
		
		
		b7 = new JButton();
		b7.setText("Admin Sign in");
		b7.setHorizontalTextPosition(JButton.LEFT);
		//b7.setVerticalTextPosition(JButton.TOP);
		b7.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b7.setForeground(Color.blue);
		b7.setBackground(Color.white);
		b7.setIcon(icon5);
		b7.setBounds(1150,10,200,25);
		b7.addActionListener(this);

	
		c1 = new JCheckBox("Bangla");
        c1.setBounds(570, 620, 80, 30);
		
		
        c2 = new JCheckBox("English");
        c2.setBounds(670, 620, 80, 30);

        homeFrame.setTitle("Homepage");
		homeFrame.setSize(1580,900);
		homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		homeFrame.setResizable(false);
		homeFrame.setLayout(null);
		homeFrame.setVisible(true);

        homeFrame.add(l1);
        homeFrame.add(l2);
        homeFrame.add(l3);
        homeFrame.add(l4);
        homeFrame.add(l5);
        homeFrame.add(t1);
        homeFrame.add(b1);
        homeFrame.add(b2);
        homeFrame.add(b3);
        homeFrame.add(b4);
        homeFrame.add(b5);
        homeFrame.add(b6);
        homeFrame.add(b7);
        homeFrame.add(c1);
        homeFrame.add(c2);
        homeFrame.add(b8);
        homeFrame.add(b9);
        homeFrame.add(b10);
        homeFrame.add(b11);
        homeFrame.add(b12);
        homeFrame.add(b13);
	}

		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
				homeFrame.setVisible(false);
			    new setting1();
				
				// s.setVisible(true);
			}
			/*else if(ae.getSource()==b2)
			{
				home2 h = new home2();
				this.setVisible(false);
				h.setVisible(true);
			}*/
			else if(ae.getSource()==b7)
			{
				homeFrame.setVisible(false);
				logininfo li = new logininfo();
				li.setVisible(true);
				
			}
			else if(ae.getSource() ==b4 )
			{
            
            JOptionPane.showMessageDialog(homeFrame, "Member 1: "+"\n"+"Name :Mujahid Raj"+"\n"+"ID: 22-46398-1"+"\n"+
			    "Contribution : Home Page,Sign Up,sign in,logged in,about,interface,Gui Work,word,Hyperlink Addation, Shortcut Addition,Documnents,Others Works"+"\n"+"\n"+""+"\n"+"\n"+"Member 2: "+"\n"+
				"Name : Al Fahim "+"\n"+"ID: 22-46"+"\n"+"Contribution : Home Page, Advance Search,Search History"+"\n"+
				"Member 3: "+"\n"+"Name :Ashiqur Rahman Titas"+"\n"+"ID: 22-46396-1"+"\n"+
			    "Contribution : Search Panel,gui work"+"\n"+"Member 4: "+"\n"+"Name :Asif Bushra"+"\n"+"ID: 22-46388-1"+"\n"+"Contribution : Help",
				
                                   "ABOUT THE CONTRIBUTION :", JOptionPane.INFORMATION_MESSAGE);
				
			}
			else if(ae.getSource() ==b2 )
			{
				web1 w = new web1();
				homeFrame.setVisible(false);
				
			}
			else if (ae.getSource() ==b3 )
			{
				homeFrame.setVisible(false);
				new help();
				
			}
			else if (ae.getSource() ==b8 )
			{
				homeFrame.setVisible(false);
				new Contact();
				
			}
			else if (ae.getSource() ==b6 )
			{
				homeFrame.setVisible(false);
				new facebook();
				
			}
			else if (ae.getSource() ==b9 )
			{
				homeFrame.setVisible(false);
				new google();
				
			}
			else if (ae.getSource() ==b11 )
			{
				homeFrame.setVisible(false);
				new youtube();
				
			}
			else if (ae.getSource() ==b12 )
			{
				homeFrame.setVisible(false);
				new gmail();
				
			}
			else if (ae.getSource() ==b10 )
			{
				homeFrame.setVisible(false);
				new wikipedia();
				
			}
			else if (ae.getSource() ==b13 )
			{
				homeFrame.setVisible(false);
				WordDocument wd = new WordDocument();
                wd.setSize(1366,700);
                wd.setVisible(true);
				
			}
			 
			
		}


}
