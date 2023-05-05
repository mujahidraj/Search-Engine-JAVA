 import java.lang.*;
 import javax.swing.*;
 import javax.swing.table.DefaultTableModel;
 import java.awt.*;
 import java.awt.event.*;
 
 
 
  public class UserAdd extends JFrame implements ActionListener{
	  
	 JLabel title,Label1,Label2,Label3, Label4,h;
	 JTextField userinput1,userinput2,userinput3, userinput4;
	 JPasswordField passTF;
	 JButton addBtn, clearBtn,delete,back;
	 Font myFont;
	 JTable table;
	 JScrollPane scroll;
	 DefaultTableModel model;
	 JPanel panel;
	 
	 
	 String [] colums={"User Name","Work","Serial","Designation"};
	 String [] rows=new String[4];
	 
	 
	 
	 public UserAdd(){
		 super("Add User");
		 this.setSize(1300, 731);
		 h=new JLabel(new ImageIcon("backp.jpg"));
		 h.setBounds(00,00,1300, 731);
		 this.add(h);
		 
		 
		 this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 
		 panel=new JPanel();
		 panel.setLayout(null);
		 
		 title=new JLabel("Add User");
		 title.setBounds(195,80,250,20);
		 myFont=new Font("Arial",Font.BOLD,30);
		 title.setFont(myFont);
		 h.add(title);
		 
		 Label1=new JLabel("Username Name: ");
		 Label1.setBounds(130,150,130,30);
		 myFont=new Font("Arial",Font.PLAIN,14);
		 Label1.setFont(myFont);
		 h.add(Label1);
		 
		 
		 userinput1=new JTextField();
		 userinput1.setBounds(240,150,230,30);
		 h.add(userinput1);
		 
		 Label2=new JLabel("Work: ");
		 Label2.setBounds(130,185,130,30);
		 myFont=new Font("Arial",Font.PLAIN,14);
		 Label2.setFont(myFont);
		 h.add(Label2);
		 
		 userinput2=new JTextField();
		 userinput2.setBounds(240,185,230,30);
		 h.add(userinput2);
		 
		 Label3=new JLabel("Serial : ");
		 Label3.setBounds(130,220,130,30);
		 myFont=new Font("Arial",Font.PLAIN,14);
		 Label3.setFont(myFont);
		 h.add(Label3);
		 
		 
		 
		 userinput3=new JTextField();
		 userinput3.setBounds(240,220,230,30);
		 h.add(userinput3);
		 
		 Label4=new JLabel("Designation: ");
         Label4.setBounds(130,255,130,30);
		 myFont=new Font("Arial",Font.PLAIN,15);
		 Label4.setFont(myFont);
		 h.add(Label4);
		 
		 userinput4=new JTextField();
		 userinput4.setBounds(240,255,230,30);
		 h.add(userinput4);
		 
		 
		 
		 addBtn=new JButton("Add");
		 addBtn.setBounds(245,350,95,30);
		 h.add(addBtn);
		 
		 clearBtn=new JButton("Clear");
		 clearBtn.setBounds(360,350,100,30);
		 h.add(clearBtn);
		 
		 delete=new JButton("Delete");
		 delete.setBounds(245,395,100,30);
		 h.add(delete);
		 
		 back=new JButton("Back");
		 back.setBounds(360,395,100,30);
		 h.add(back);
		 
		 table=new JTable();
		 model=new DefaultTableModel();
		 model.setColumnIdentifiers(colums);
		 table.setModel(model);
		 table.setFont(myFont);
		 table.setSelectionBackground(Color.PINK);
		 table.setRowHeight(30);
		 scroll=new JScrollPane(table);
		 scroll.setBounds(500,100,740,265);
		 h.add(scroll);
		 
		
		 
		 addBtn.addActionListener(this);
		 clearBtn.addActionListener(this);
		 delete.addActionListener(this);
		 back.addActionListener(this);
		 
	 }
		public void actionPerformed(ActionEvent e)
		{
			
			if(e.getSource()==addBtn)
			{
			rows[0]=userinput1.getText();
            rows[1]=userinput2.getText();
			rows[2]=userinput3.getText();
			rows[3]=userinput4.getText();
			
			model.addRow(rows);
			
			
			}
			else if(e.getSource()==clearBtn)
			{
			userinput1.setText("");	
			userinput2.setText("");	
			userinput3.setText("");	
			userinput4.setText("");	
			
			}
			
			else if(e.getSource()==delete)
			{
				int numberOfRow=table.getSelectedRow();
				if(numberOfRow>=0)
				{
					model.removeRow(numberOfRow);
			    }
			else
			{
				JOptionPane.showMessageDialog(null,"No row has been selected");
				
			}				
			}
			
			back.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		
			{
		
			
			logedin mg=new logedin();
			mg.setVisible(true);
			
		}
		});
			
		
		}
			
		

		  
		 //this.add(panel);
	// }
	
public static void main(String[]args){
UserAdd ma=new UserAdd();
		ma.setVisible(true);
	}
	
  }