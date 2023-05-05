import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class logedin extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5,l6;
		//JTextField t1,t2;
		JButton b1,b2,b3,b4,b5,b6; 
		JPanel p1;
		ImageIcon icon1;
		
	public logedin()
	{
		super(" Logged In Page ");
		this.setSize(1450,900);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*icon1 =new ImageIcon("35493994-36e2c50e-04d9-11e8-8b38-890caea01850.jpg");
		l6=new JLabel(icon1);
		l6.setBounds(0,0,1500,900);
		p1.add(l6);
		this.add(p1);*/
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1450,900));
		p1.setBackground(Color.black);
		p1.setLayout(null);
		
		l1 = new JLabel("               Welcome To The Admin Panel Of KHOJ");
		l1.setFont(new Font("Algerian",Font.BOLD,50));
		l1.setForeground(Color.BLUE);
		l1.setBounds(10,10,1500,70);
		p1.add(l1);
		
	l2 = new JLabel("                                                       - PEOPLE'S DESIRE SEACRH");
		l2.setFont(new Font("Algerian",Font.PLAIN,30));
		l2.setForeground(Color.green);
		l2.setBounds(100,100,1000,40);
		p1.add(l2);
		
		l3 = new JLabel("Admin Work :");
		l3.setFont(new Font("Arial Black",Font.PLAIN,20));
		l3.setForeground(Color.red);
		l3.setBounds(10,150,150,20);
		p1.add(l3);
		
		//t1 = new JTextField();
		//t1.setBounds(220,100,100,25);
		//p1.add(t1);

		//t2 = new JTextField();
		//t2.setBounds(220,150,100,25);
		//p1.add(t2);
		
		b1 = new JButton("Total Search");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.white);
		b1.setBackground(Color.orange);
		b1.setBounds(200,220,200,30);
		b1.addActionListener(this);
		p1.add(b1);
	    
		/*l4 = new JLabel("jdashduj");
		l4.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l4.setForeground(Color.white);
		l4.setBounds(180,300,150,20);
		p1.add(l4);*/
		
		b2 = new JButton("add User *");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.white);
		b2.setBackground(Color.orange);
		b2.setBounds(600,220,200,30);
		b2.addActionListener(this);
		p1.add(b2);
		
		b4 = new JButton("Total Admin");
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b4.setForeground(Color.white);
		b4.setBackground(Color.orange);
		b4.setBounds(1000,220,200,30);
		b4.addActionListener(this);
		p1.add(b4);
		
		b5 = new JButton("ACTIVITY LOG");
		b5.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b5.setForeground(Color.white);
		b5.setBackground(Color.orange);
		b5.setBounds(800,320,200,30);
		b5.addActionListener(this);
		p1.add(b5);
		
		b6 = new JButton("REPORT");
		b6.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b6.setForeground(Color.white);
		b6.setBackground(Color.orange);
		b6.setBounds(400,320,200,30);
		b6.addActionListener(this);
		p1.add(b6);
		
		b3 = new JButton("BACK");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.setForeground(Color.white);
		b3.setBackground(Color.orange);
		b3.setBounds(10,650,80,30);
		b3.addActionListener(this);
		p1.add(b3);
		
		
        this.add(p1);		
        this.add(p1);
	}


		public void actionPerformed(ActionEvent ae)
		{
		   if(ae.getSource()==b2)
			{
			UserAdd u=new UserAdd();
			this.setVisible(false);
			u.setVisible(true);
			}
			
			else if(ae.getSource()==b3)
			{
				home1 h = new home1();
				this.setVisible(false);
				// h.setVisible(true);
			}
			/*else if(ae.getSource()==b2)
			{
				System.exit(0);
			}*/
		}


}