import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.io.IOException;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
//import java.lang.*;

public class youtube extends JFrame {
  
     // youtube(){};
   

   youtube() {    
      JFrame frame = new JFrame("youtube");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      createUI(frame);
      frame.setSize(1580, 900);      
      frame.setLocationRelativeTo(null);  
      frame.setVisible(true);
   }

   void createUI(final JFrame frame){  
      JPanel panel = new JPanel();
      LayoutManager layout = new FlowLayout();  
      panel.setLayout(layout);       

      JEditorPane jEditorPane = new JEditorPane();
      jEditorPane.setEditable(false);   
      try {   
         jEditorPane.setPage("http://www.youtube.com");
      } catch (IOException e) { 
         jEditorPane.setContentType("text/html");
         jEditorPane.setText("<html>Page not found.</html>");
      }

      JScrollPane jScrollPane = new JScrollPane(jEditorPane);
      jScrollPane.setPreferredSize(new Dimension(1366,700));      

      panel.add(jScrollPane);
      frame.getContentPane().add(panel, BorderLayout.CENTER);    
   }

public static void main (String [] args){

  youtube y2=new youtube();
  
  
  }
	
} 