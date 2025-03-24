import java.awt.FlowLayout; 
import javax.swing.JFrame;
import javax.swing.JLabel; 
import javax.swing.SwingConstants; 
import javax.swing.Icon; 
import javax.swing.ImageIcon;

public class LabelFrame extends JFrame 
{ 
    private JLabel label1; 
    private JLabel label2;
    private JLabel label3;

    public LabelFrame() 
    { 
        super( "Testing  JLabel"); 
        setLayout(new FlowLayout());
        label1 = new JLabel("");
        label1.setToolTipText("this is label1");
        add(label1);
    
        Icon bug = new ImageIcon(getClass().getResource( "images.png" ));
        label2 = new JLabel("", bug, SwingConstants.LEFT); 
        label2.setToolTipText("This is label2"); 
        add(label2);
        label3 = new JLabel();
        label3.setText("INSTITUTO FEDERAL DE MATO GROSSO"); 
        // label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER); 
        label3.setVerticalTextPosition(SwingConstants.BOTTOM); 
        label3.setToolTipText("This is label3"); 
        add(label3);
    }
}