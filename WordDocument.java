import java.io.File;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.lang.*;

public class WordDocument extends JFrame {
    private JButton btnOpen;
    private JLabel jLabel1;
    private JTextField txtDocNumber;

    private static String DIR  ="C:\\project\\";   // folder where word documents are present.

    public WordDocument() {
       super("Open Word Document");
       initComponents();
    }
         //c.setSize(300,100);
    private void initComponents() {
        jLabel1 = new JLabel();
        txtDocNumber = new JTextField();
        btnOpen = new JButton();

        Container c = getContentPane();
        c.setLayout(new java.awt.FlowLayout());
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter Document Number  : ");
        c.add(jLabel1);

        txtDocNumber.setColumns(5);
        c.add(txtDocNumber);

        btnOpen.setText("Open Document");
        btnOpen.addActionListener(new ActionListener() {      // anonymous inner class 
            public void actionPerformed(ActionEvent evt) {
                  Desktop desktop = Desktop.getDesktop();  
              try {
                File f = new File( DIR + txtDocNumber.getText()  +  ".doc");
                 desktop.open(f);  // opens application (MSWord) associated with .doc file
              }
              catch(Exception ex) {
                // WordDocument.this is to refer to outer class's instance from inner class
                JOptionPane.showMessageDialog(WordDocument.this,ex.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
              }
            }
        });

        c.add(btnOpen);

    } // initCompnents();

    public static void main(String args[]) {
          WordDocument wd = new WordDocument();
          wd.setSize(1366,700);
          wd.setVisible(true);
    };
}