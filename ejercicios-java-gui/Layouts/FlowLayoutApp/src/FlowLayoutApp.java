
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class FlowLayoutApp extends JFrame {

    public FlowLayoutApp()
    {
        setTitle( "FlowLayout" );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        // Create buttons
        for (int i = 0; i < buttonTable.length; i++) {
            buttonTable[i] = new JButton( "Button " + ( i + 1 ) );
        }

        // Create panel
        myPanel = new JPanel( new FlowLayout() );
        for (int i = 0; i < buttonTable.length; i++) {
            myPanel.add( buttonTable[ i ] );
        }

        // Make it visible
        setContentPane( myPanel );
        setSize( 400, 100 );
        setVisible( true );
    }

    public static void main(String[] args)
    {
        new FlowLayoutApp();
    }
    
    private JButton[] buttonTable = new JButton[6];
    private JPanel myPanel;
}
