import java.awt.*;  
import javax.swing.*; 
import java.awt.event.*;
 
 
public class help extends JFrame implements ActionListener
{  
        JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
		JRadioButton r1, r2;
		JButton b1;
		ImageIcon icon7;
     help()  
        {  
        JFrame f= new JFrame("advance");    
        JPanel panel=new JPanel(); 
		panel.setSize(new Dimension(1200,800));         
        panel.setBackground(Color.white);
		panel.setLayout(null);
		
		icon7 =new ImageIcon("Help.jpg");
		l17=new JLabel(icon7);
		l17.setBounds(0,0,1200,800);
		

		l1 = new JLabel("welcome");
		l1.setFont(new Font("Georgia",Font.BOLD,30));
		l1.setForeground(Color.BLACK);
		l1.setBounds(40,50,250,30);
		
		l2 = new JLabel("Welcome to khojhelp- Here's some tips to improve your search");
		l2.setFont(new Font("Arial",Font.BOLD,15));
		l2.setForeground(Color.RED);
		l2.setBounds(42,100,550,30);
		
		l3 = new JLabel("Tip 1: Start  with  the  basics");
		l3.setFont(new Font("Arial",Font.BOLD,16));
		l3.setForeground(Color.BLACK);
		l3.setBounds(42,125,550,30);
		
		l4 = new JLabel("No matter what you're looking for, start with a simple search.");
		l4.setFont(new Font("Arial",Font.BOLD,12));
		l4.setForeground(Color.BLACK);
		l4.setBounds(48,145,550,30);
		
		l5 = new JLabel("If you're looking for a place or product in a specific location, add the location. For example, AIUB. ");
		l5.setFont(new Font("Arial",Font.BOLD,12));
		l5.setForeground(Color.BLACK);
		l5.setBounds(48,160,550,30);
		
		l6 = new JLabel("Tip 2: Search using your voice");
		l6.setFont(new Font("Arial",Font.BOLD,16));
		l6.setForeground(Color.BLACK);
		l6.setBounds(42,180,550,30);
		
		l7 = new JLabel("Tired of typing? To search with your voice, select the Microphone");
		l7.setFont(new Font("Arial",Font.BOLD,12));
		l7.setForeground(Color.BLACK);
		l7.setBounds(48,195,550,30);
		
		l8 = new JLabel("Tip 3: Choose words carefully");
		l8.setFont(new Font("Arial",Font.BOLD,16));
		l8.setForeground(Color.BLACK);
		l8.setBounds(42,215,550,30);
		
		l9 = new JLabel("When you're deciding what words to put in the search box, try to choose words that are likely to appear on the site .");
		l9.setFont(new Font("Arial",Font.BOLD,12));
		l9.setForeground(Color.BLACK);
		l9.setBounds(48,230,650,30);
		
		l10 = new JLabel("For example, instead of saying my head hurts, say headache, because thats the word a medical site would use.");
		l10.setFont(new Font("Arial",Font.BOLD,12));
		l10.setForeground(Color.BLACK);
		l10.setBounds(48,245,650,30);
		
		l11 = new JLabel("Tip 4: Dont worry about the little things");
		l11.setFont(new Font("Arial",Font.BOLD,16));
		l11.setForeground(Color.BLACK);
		l11.setBounds(42,265,550,30);
		
		l12 = new JLabel("Spelling:spell checker automatically uses the most common spelling of a given word, whether or not you spell it correctly. ");
		l12.setFont(new Font("Arial",Font.BOLD,12));
		l12.setForeground(Color.BLACK);
		l12.setBounds(48,280,650,30);
		
		l13 = new JLabel("Capitalization: A search for New York Times is the same as a search for new york times. ");
		l13.setFont(new Font("Arial",Font.BOLD,12));
		l13.setForeground(Color.BLACK);
		l13.setBounds(48,295,650,30);
		
		l14 = new JLabel("Expert search tips");
        l14.setFont(new Font("Arial",Font.BOLD,16));
		l14.setForeground(Color.BLACK);
		l14.setBounds(42,330,550,30);
		
		l15 = new JLabel("When you evaluate information from the web, experts recommend that you search for evidence of important claims,");
		l15.setFont(new Font("Arial",Font.BOLD,12));
		l15.setForeground(Color.BLACK);
		l15.setBounds(48,350,850,30);
		
		l16 = new JLabel(" and find other perspectives on the same topic");
		l16.setFont(new Font("Arial",Font.BOLD,12));
		l16.setForeground(Color.BLACK);
		l16.setBounds(48,365,850,30);
		
		
		
		
		r1 = new JRadioButton("true");
        r1.setBounds(250, 500, 80, 30);
        panel. add(r1);
		r2 = new JRadioButton("False");
        r2.setBounds(350, 500, 80, 30);
		
		b1 = new JButton();
		b1.setText("Back");
		b1.setHorizontalTextPosition(JButton.LEFT);
		//b7.setVerticalTextPosition(JButton.TOP);
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.blue);
		b1.setBackground(Color.white);
		b1.setBounds(48,630,150,25);
		b1.addActionListener(this);
		
		
        panel. add(r2);
		panel. add(l1);
        panel. add(b1);
		panel. add(l2);
		panel. add(l3);
		panel. add(l4);
		panel. add(l5);
		panel. add(l6);
        panel. add(l7);
		panel. add(l8);
		panel. add(l9);
		panel. add(l10);
		panel. add(l11);
		panel. add(l12);
		panel. add(l13);
		panel. add(l14);
		panel. add(l15);
		panel. add(l16);
		panel. add(l17);
		
		
		
		
		
		
		
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
			    home1 hh = new home1();
				this.setVisible(false);
				// hh.setVisible(true);
			}
		
		
		
       /* public static void main(String args[])  
        {  
        new help();  
        }*/ 
		
    }
}