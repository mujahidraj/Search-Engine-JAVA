import java.awt.FlowLayout;
import java.awt.HeadlessException;
 
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
 

public class JHyperlinkPage extends JFrame {
	
    private JHyperlink linkWebsite = new JHyperlink("Visit our website");
	                    
    private JHyperlink linkEmail = new JHyperlink("Email Us");
	private JHyperlink linkFacebook = new JHyperlink("Facebook");
	private JHyperlink linkTwitter = new JHyperlink("Twitter");
	private JHyperlink linkStockoverflow = new JHyperlink("Stock Over Flow");
	private JHyperlink linkWikipedia = new JHyperlink("Wikipedia");
	private JHyperlink linkYoutube = new JHyperlink("Youtube");
	private JHyperlink linkGmail = new JHyperlink("Gmail");
	private JHyperlink linkDaraz = new JHyperlink("Daraz");
	private JHyperlink linkNewFoods = new JHyperlink("New Foods");
	
     
    public JHyperlinkPage() throws HeadlessException {
        setTitle("Swing Hyperlink Demo");
         
        setLayout(new FlowLayout(FlowLayout.CENTER, 300,100));
         
        linkWebsite.setURL("http://www.khoj.net");
        linkWebsite.setToolTipText("Visit http://www.khoj.net");
         
        linkEmail.setURL("mailto:info@khoj.com");
        linkEmail.setToolTipText("Send an email to info@khoj.com");
         
		  linkTwitter.setURL("http://www.twitter.com");
        linkTwitter.setToolTipText("Visit http://www.twitter.com");
		
		linkStockoverflow.setURL("https://stackoverflow.com");
        linkStockoverflow.setToolTipText("Visit https://stackoverflow.com");
		
		linkWikipedia.setURL("http://www.wikipedia.com");
        linkWebsite.setToolTipText("Visit http://www.wikipedia.com");
		
		linkYoutube.setURL("http://www.youtube.com");
        linkYoutube.setToolTipText("Visit http://www.youtube.com");
		
		linkGmail.setURL("http://www.gmail.com");
        linkGmail.setToolTipText("Visit http://www.gmail.com");
		
		linkDaraz.setURL("http://www.daraz.com");
        linkDaraz.setToolTipText("Visit http://www.daraz.com");
		
		linkNewFoods.setURL("http://www.newfoods.com");
        linkNewFoods.setToolTipText("Visit http://www.newfoods.com");
		 
        getContentPane().add(linkWebsite);
        getContentPane().add(linkEmail);
        getContentPane().add(linkFacebook);
        getContentPane().add(linkTwitter);
        getContentPane().add(linkStockoverflow);
        getContentPane().add(linkWebsite);
        getContentPane().add(linkYoutube);
        getContentPane().add(linkGmail);
        getContentPane().add(linkDaraz);
        getContentPane().add(linkNewFoods);
         
        setSize(1500, 700);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
             
            @Override
            public void run() {
                new JHyperlinkPage().setVisible(true);
            }
        });
    }
}