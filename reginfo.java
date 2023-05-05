 import java.lang.*;
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 import java.io.FileWriter;
 import java.io.*;
 
  public class reginfo extends JFrame{
	 JLabel title,Label1,Label2,Label3, emailLabel, mobileLabel, passLabel,h;
	 JTextField userinput1,userinput2,userinput3, emailTF, mobileTF;
	 JPasswordField passTF;
	 JButton regBtn, logBtn;
	 Font myFont;
	 JPanel panel;
	 
	 public reginfo(){
		 super("Registration");
		 this.setSize(800, 450);
		 h=new JLabel(new ImageIcon("back.jpg"));
		 h.setBounds(00,00,800,450);
		 this.add(h);
		 
		 
		 this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 
		 panel=new JPanel();
		 panel.setLayout(null);
		 
		 title=new JLabel("Enter Your Information ");
		 title.setBounds(195,50,250,20);
		 myFont=new Font("Arial",Font.BOLD,22);
		 title.setFont(myFont);
		 h.add(title);
		 
		 Label1=new JLabel("First Name: ");
		 Label1.setBounds(130,95,110,30);
		 myFont=new Font("Arial",Font.PLAIN,14);
		 Label1.setFont(myFont);
		 h.add(Label1);
		 
		 
		 userinput1=new JTextField();
		 userinput1.setBounds(240,95,230,30);
		 panel.add(userinput1);
		 
		 Label2=new JLabel("Last Name: ");
		 Label2.setBounds(130,130,110,30);
		 myFont=new Font("Arial",Font.PLAIN,14);
		 Label2.setFont(myFont);
		 h.add(Label2);
		 
		 userinput2=new JTextField();
		 userinput2.setBounds(240,130,230,30);
		 panel.add(userinput2);
		 
		 Label3=new JLabel("Username: ");
		 Label3.setBounds(130,165,110,30);
		 myFont=new Font("Arial",Font.PLAIN,14);
		 Label3.setFont(myFont);
		 h.add(Label3);
		 
		 
		 
		 userinput3=new JTextField();
		 userinput3.setBounds(240,165,230,30);
		 h.add(userinput3);
		 
		 emailLabel=new JLabel("Email: ");
         emailLabel.setBounds(130,200,110,30);
		 myFont=new Font("Arial",Font.PLAIN,15);
		 emailLabel.setFont(myFont);
		 h.add(emailLabel);
		 
		 emailTF=new JTextField();
		 emailTF.setBounds(240,200,230,30);
		 h.add(emailTF);
		 
		 mobileLabel=new JLabel("Mobile No: ");
         mobileLabel.setBounds(130,235,110,30);
		 myFont=new Font("Arial",Font.PLAIN,15);
		 mobileLabel.setFont(myFont);
		 h.add( mobileLabel);
		 
		 mobileTF=new JTextField();
		 mobileTF.setBounds(240,235,230,30);
		 h.add( mobileTF);
		 
		 
		 passLabel=new JLabel("Password: ");
		 passLabel.setBounds(130,270,110,30);
		 myFont=new Font("Arial",Font.PLAIN,15);
		 passLabel.setFont(myFont);
		 h.add(passLabel);
		 
		 passTF=new JPasswordField();
		 passTF.setBounds(240,270,230,30);
		 panel.add(passTF);
		 
		 regBtn=new JButton("Register");
		 regBtn.setBounds(240,315,85,30);
		 h.add(regBtn);
		 
		 logBtn=new JButton("Already registered");
		 logBtn.setBounds(330,315,140,30);
		 h.add(logBtn);
		 
		 logBtn.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
				logininfo lg=new logininfo();
				lg.setVisible(true);
				}
		});
		
		regBtn.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent ae)
			{
				try{
				FileWriter writer =new FileWriter("Login.txt");
				BufferedWriter mybuffer=new BufferedWriter(writer);
				PrintWriter pr=new PrintWriter(mybuffer);
			    
			    pr.println(userinput1.getText());
			    pr.println(userinput2.getText());
			    pr.println(userinput3.getText());
				pr.println(emailTF.getText());
				pr.println(mobileTF.getText());
			    pr.println(passTF.getText());
			
			mybuffer.close();
			writer.close();
			logininfo lg=new logininfo();
				lg.setVisible(true);
			
		}
				catch(Exception e){System.out.println(e);}
				
				
				}	
		});
		
		
		
		
		
		 
		 this.add(panel);
	 }
	 
	 public static void main(String[]args){
reginfo home=new reginfo();
		home.setVisible(true);
	}
  }