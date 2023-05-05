import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class web1 extends JFrame implements ActionListener
{
		JLabel l2, l3,l4,l5;
		JTextField t1,t2;
		JButton b1,b2,b3,b4,b5,b6,b7,b8;
		JPanel p1,p2,p3;
		JCheckBox c1,c2;


	public web1()
	{


		super(" Search ");
		this.setSize(1500,900);
		 this.setVisible(true); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		p1 = new JPanel();
		p1.setSize(new Dimension(1500,100));
		p1.setBackground(Color.pink);
		p1.setLayout(null);




		b5 = new JButton("KHOJ");
		b5.setFont(new Font("Algerian",Font.BOLD,20));
		//b5.setForeground(Color.black);
		b5.setBackground(Color.pink);
		b5.addActionListener(this);
		b5.setBounds(50,20,150,50);
		p1.add(b5);




		t1 = new JTextField();
		t1.setBounds(280,20,500,30);
		p1.add(t1);



		b1 = new JButton("S");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.blue);
		b1.setBackground(Color.white);
		b1.setBounds(1320,20,50,25);
		b1.addActionListener(this);
		p1.add(b1);

		b3 = new JButton("Ap");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.setForeground(Color.blue);
		b3.setBackground(Color.white);
		b3.setBounds(1380,20,50,25);
		b3.addActionListener(this);
		p1.add(b3);




		p2 = new JPanel();
		p2.setSize(new Dimension(1500,800));
		p2.setBackground(Color.white);
		p2.setLayout(null);




		 l2=new JLabel("https://www.google.com");
		 l2.setFont(new Font("Times New Roman",Font.BOLD, 15));
		 l2.setBounds(120,130,500,20);
		 l2.setBackground(Color.white);
		 //userLabel.setOpaque(true);
		 l2.setForeground(Color.black);
		 p2.add(l2);





		 b6=new JButton("Google");
		 b6.setFont(new Font("Times New Roman",Font.BOLD, 23));
		 b6.setBounds(120,150,120,30);
		 b6.setBackground(Color.white);
		 //userLabel.setOpaque(true);
		 b6.setForeground(Color.black);
		 p2.add(b6);



		 l2 = new JLabel("Google LLC is an American multinational technology company that focuses on search engine technology online advertising cloud computing computer software quantum computing e-commerce artificial intelligence and consumer electronics Wikipedia ");
		 l2.setFont(new Font("Times New Roman",Font.BOLD, 15));
		 l2.setBounds(120,180,700,30);
		 l2.setBackground(Color.white);
		 //userLabel.setOpaque(true);
		 l2.setForeground(Color.black);
		 p2.add(l2);







		 l2 = new JLabel("Drive");
		 l2.setFont(new Font("Times New Roman",Font.BOLD, 23));
		 l2.setBounds(130,220,500,30);
		 l2.setBackground(Color.white);
		 //userLabel.setOpaque(true);
		 l2.setForeground(Color.black);
		 p2.add(l2);



		 l2 = new JLabel("Drive can provide encrypted and secure access to your files.");
		 l2.setFont(new Font("Times New Roman",Font.BOLD, 15));
		 l2.setBounds(130,240,700,30);
		 l2.setBackground(Color.white);
		 //userLabel.setOpaque(true);
		 l2.setForeground(Color.black);
		 p2.add(l2);






		 l2 = new JLabel("Account");
		 l2.setFont(new Font("Times New Roman",Font.BOLD, 23));
		 l2.setBounds(130,280,500,30);
		 l2.setBackground(Color.white);
		 //userLabel.setOpaque(true);
		 l2.setForeground(Color.black);
		 p2.add(l2);



		 l2 = new JLabel("Helps you. When you're signed in, all of the Google services you ...");
		 l2.setFont(new Font("Times New Roman",Font.BOLD, 15));
		 l2.setBounds(130,310,700,30);
		 l2.setBackground(Color.white);
		 //userLabel.setOpaque(true);
		 l2.setForeground(Color.black);
		 p2.add(l2);







		 l2 = new JLabel("Image");
		 l2.setFont(new Font("Times New Roman",Font.BOLD, 23));
		 l2.setBounds(130,350,500,30);
		 l2.setBackground(Color.white);
		 //userLabel.setOpaque(true);
		 l2.setForeground(Color.black);
		 p2.add(l2);



		 l2 = new JLabel("Google Images. The most comprehensive image search ...");
		 l2.setFont(new Font("Times New Roman",Font.BOLD, 15));
		 l2.setBounds(130,380,700,30);
		 l2.setBackground(Color.white);
		 //userLabel.setOpaque(true);
		 l2.setForeground(Color.black);
		 p2.add(l2);






		 l2 = new JLabel("Business Profile");
		 l2.setFont(new Font("Times New Roman",Font.BOLD, 23));
		 l2.setBounds(130,420,500,30);
		 l2.setBackground(Color.white);
		 //userLabel.setOpaque(true);
		 l2.setForeground(Color.black);
		 p2.add(l2);



		 l2 = new JLabel("Manage now - Services Solutions - Restaurant Solutions - FAQs");
		 l2.setFont(new Font("Times New Roman",Font.BOLD, 15));
		 l2.setBounds(130,450,700,30);
		 l2.setBackground(Color.white);
		 //userLabel.setOpaque(true);
		 l2.setForeground(Color.black);
		 p2.add(l2);





		 l2 = new JLabel("More results from google.com »");
		 l2.setFont(new Font("Times New Roman",Font.BOLD, 15));
		 l2.setBounds(130,490,700,30);
		 l2.setBackground(Color.white);
		 //userLabel.setOpaque(true);
		 l2.setForeground(Color.black);
		 p2.add(l2);







		 l2=new JLabel("https://twitter.com/Google");
		 l2.setFont(new Font("Times New Roman",Font.BOLD, 15));
		 l2.setBounds(120,550,500,20);
		 l2.setBackground(Color.white);
		 //userLabel.setOpaque(true);
		 l2.setForeground(Color.black);
		 p2.add(l2);





		 l2=new JLabel("Twitter");
		 l2.setFont(new Font("Times New Roman",Font.BOLD, 23));
		 l2.setBounds(120,570,500,30);
		 l2.setBackground(Color.white);
		 //userLabel.setOpaque(true);
		 l2.setForeground(Color.black);
		 p2.add(l2);



		 l2 = new JLabel("Stay up to date with Google company news and products. Discover stories about our culture, philosophy, and how Google technology is impacting others.");
		 l2.setFont(new Font("Times New Roman",Font.BOLD, 15));
		 l2.setBounds(120,600,700,30);
		 l2.setBackground(Color.white);
		 //userLabel.setOpaque(true);
		 l2.setForeground(Color.black);
		 p2.add(l2);




		 l2=new JLabel("https://linkedIn.com/Google");
		 l2.setFont(new Font("Times New Roman",Font.BOLD, 15));
		 l2.setBounds(120,670,500,20);
		 l2.setBackground(Color.white);
		 //userLabel.setOpaque(true);
		 l2.setForeground(Color.black);
		 p2.add(l2);




		 l2 = new JLabel("Google - LinkedIn");
		 l2.setFont(new Font("Times New Roman",Font.BOLD, 23));
		 l2.setBounds(120,690,500,30);
		 l2.setBackground(Color.white);
		 //userLabel.setOpaque(true);
		 l2.setForeground(Color.black);
		 p2.add(l2);



		 l2 = new JLabel("Googlers build products that help create opportunities for everyone whether down the street or across the globe. Bring your insight, imagination and a healthy ...");
		 l2.setFont(new Font("Times New Roman",Font.BOLD, 15));
		 l2.setBounds(120,720,700,30);
		 l2.setBackground(Color.white);
		 //userLabel.setOpaque(true);
		 l2.setForeground(Color.black);
		 p2.add(l2);









		b4 = new JButton("All");
		b4.setFont(new Font("Georgia",Font.BOLD,10));
		b4.setForeground(Color.blue);
		b4.setBounds(280,50,70,30);
		b4.setBackground(Color.white);
		b4.addActionListener(this);
		p1.add(b4);


		b4 = new JButton("Images");
		b4.setFont(new Font("Georgia",Font.BOLD,10));
		b4.setForeground(Color.blue);
		b4.setBounds(350,50,70,30);
		b4.setBackground(Color.white);
		b4.addActionListener(this);
		p1.add(b4);



		b4 = new JButton("Videos");
		b4.setFont(new Font("Georgia",Font.BOLD,10));
		b4.setForeground(Color.blue);
		b4.setBounds(420,50,70,30);
		b4.setBackground(Color.white);
		b4.addActionListener(this);
		p1.add(b4);



		b4 = new JButton("News");
		b4.setFont(new Font("Georgia",Font.BOLD,10));
		b4.setForeground(Color.blue);
		b4.setBounds(490,50,70,30);
		b4.setBackground(Color.white);
		b4.addActionListener(this);
		p1.add(b4);



		b4 = new JButton("Books");
		b4.setFont(new Font("Georgia",Font.BOLD,10));
		b4.setForeground(Color.blue);
		b4.setBounds(560,50,70,30);
		b4.setBackground(Color.white);
		b4.addActionListener(this);
		p1.add(b4);




		b4 = new JButton("more");
		b4.setFont(new Font("Georgia",Font.BOLD,10));
		b4.setForeground(Color.blue);
		b4.setBounds(680,50,70,30);
		b4.setBackground(Color.white);
		b4.addActionListener(this);
		p1.add(b4);




		b4 = new JButton("Tools");
		b4.setFont(new Font("Georgia",Font.BOLD,10));
		b4.setForeground(Color.blue);
		b4.setBounds(790,50,80,30);
		b4.setBackground(Color.white);
		b4.addActionListener(this);
		p1.add(b4);



		b2 = new JButton("Search");
		b2.setFont(new Font("Georgia",Font.BOLD,13));
		b2.setForeground(Color.blue);
		b2.setBackground(Color.white);
		b2.setBounds(780,20,100,30);
		b2.addActionListener(this);
		p2.add(b2);







        this.add(p1);
        this.add(p2);
	}

		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b5)
			{
			home1 h = new home1();
				this.setVisible(false);
				//h.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
				home1 h = new home1();
				this.setVisible(false);
				//h.setVisible(true);
			}
			//else if(ae.getSource()==b6)
			//{
				//JHyperlinkPage hyper = new JHyperlinkPage(true);
				//this.setVisible(false);
				//h.setVisible(true);
			//}
		}


}