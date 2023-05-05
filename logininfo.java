 import java.lang.*;
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 import java.awt.image.*;
 
 public class logininfo extends JFrame implements ActionListener {
	 JLabel userLabel, emailLabel, passLabel,newLabel,hintLabel,imageLabel;
	 JTextField userTF, emailTF;
	 JPasswordField passPF;
	 JButton loginBtn,forgetBtn,clearBtn,regBtn,exitBtn,hintBtn,backBtn;
	 JPanel panel;
	 Color myColor;
	 Font myFont;
	 ImageIcon icon8;
	 
	 public logininfo()
	 {
		 super("Login");
		 this.setSize(1450,900);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 myColor=new Color(210, 230, 135);
		 myFont=new Font("Cambria", Font.PLAIN, 32);
		 
		 /*icon8 =new ImageIcon("welcom.jpg");
		imageLabel=new JLabel(icon8);
		imageLabel.setBounds(0,0,1450,961);
		panel. add(imageLabel);*/
		 
		 
		 panel=new JPanel();
		 panel.setLayout(null);
		 panel.setBackground(Color.white);
		 
		 userLabel=new JLabel("Username : ");
		 userLabel.setBounds(50,100,120,40);
		 userLabel.setBackground(Color.PINK);
		 //userLabel.setOpaque(true);
		 //userLabel.setForeground(Color.BLUE);
		 panel.add(userLabel);
		 
		 userTF=new JTextField();
		 userTF.setBounds(170,100,200,35);
		// userTF.setBackground(Color.PINK);
		 panel.add(userTF);
		 
		passLabel=new JLabel("Password : ");
		 passLabel.setBounds(50,140,120,40);
		 panel.add(passLabel);
		 
		 passPF=new JPasswordField();
		 passPF.setBounds(170,140,200,35);
	     //passPF.setEchoChar("*");
		 panel.add(passPF);
		 
		 newLabel=new JLabel("New Admin Here? ");
		 newLabel.setBounds(1100,100,120,35);
		 panel.add(newLabel);
		 
		 regBtn=new JButton(" Sign Up ");
		 regBtn.setBounds(1100,140,100,35);
		 panel.add(regBtn);
		 
		 hintLabel=new JLabel("Want login Hint? ");
		 hintLabel.setBounds(700,100,120,35);
		 panel.add(hintLabel);
		 
		 hintBtn=new JButton(" Get Hint ");
		 hintBtn.setBounds(700,140,100,35);
		 hintBtn.addActionListener(this);
		 panel.add(hintBtn);
		 
		 
		 loginBtn=new JButton(" login ");
		 loginBtn.setBounds(180,190,80,35);
		 loginBtn.addActionListener(this);
		 panel.add(loginBtn);
		 
		 
		 exitBtn=new JButton("Back");
		 exitBtn.setBounds(1190,790,80,35);
		 exitBtn.addActionListener(this);
		 panel.add(exitBtn);
		 
		  backBtn=new JButton("Back");
		 backBtn.setBounds(10,790,80,35);
		 backBtn.addActionListener(this);
		 panel.add(backBtn);
		 
		 clearBtn=new JButton("Clear");
		 clearBtn.setBounds(270,190,80,35);
		 panel.add(clearBtn);
		 
		 forgetBtn=new JButton("Forget Password??");
		 forgetBtn.setBounds(180,240,170,35);
		 panel.add(forgetBtn);
		 
		 clearBtn.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{
			
			userTF.setText("");
			passPF.setText("");
			
		}
			
		});
		

		
		loginBtn.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent ae)
		{
			String username=userTF.getText();
			String password=passPF.getText();
			
			if(username.equals("nazmul")||username.equals("Mujahid") && password.equals("1234")|| password.equals("5678"))
			
			{
				
		    JOptionPane.showMessageDialog(null,"Are you sure to login?");
			logedin log=new logedin();
			//this.setVisible(false);
			log.setVisible(true);
	        }
			else
			{
					JOptionPane.showMessageDialog(null, "Invalid Username or password!");
	        }
			
				
			
			
			
		}
			
		});
		
		regBtn.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{
			
			reginfo  reg=new reginfo ();
			reg.setVisible(true);
			
		}
			
		});
		
		 
		 this.add(panel);
		 	}
			public void actionPerformed(ActionEvent ae)
		{
		   
			
			if(ae.getSource()==backBtn);
			{
				home1 h1 = new home1();
				this.setVisible(false);
			}
			if(ae.getSource()==hintBtn);
			{
			JOptionPane.showMessageDialog(null, "Username : nazmul"+'\n'+"Password : 1234");
			}
			
			 
			
			
		
		}
		
		
			//public static void main(String[]args){
		
		
			
		//logininfo log=new logininfo();
		//log.setVisible(true);
		
		
	//}
	
			
}	
		 
		 
		 
		 
		 
		 
	 
	 