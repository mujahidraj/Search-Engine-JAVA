import java.lang.*;
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 
 
public class history extends JFrame implements ActionListener
{  

    JButton b1,b2;
     history()  
        {  
        JFrame f= new JFrame("advance");    
        JPanel panel=new JPanel(); 
		panel.setSize(new Dimension(1200,700));         
        panel.setBackground(Color.white);
		panel.setLayout(null);


        JLabel l1=new JLabel();
		l1.setText("Search History");
		l1.setFont(new Font("Arial (Body CS)",Font.PLAIN,40));
		l1.setForeground(Color.black);
		l1.setBounds(20,20,600,45);



        JButton b1=new JButton();
		b1.setText("Clear search history");
		b1.setFont(new Font("Times New Roman",Font.BOLD,30));
        b1.setBounds(800,540,300,40);
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
		
       /* public static void main(String args[])  
        {  
        new history();  
        } 		*/
    }
}
	