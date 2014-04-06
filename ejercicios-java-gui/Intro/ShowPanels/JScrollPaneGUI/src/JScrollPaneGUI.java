
import java.awt.*;
import java.io.*;
import javax.swing.*;

public class JScrollPaneGUI extends JFrame
{

    public JScrollPaneGUI()
    {

        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setTitle( "JScrollPane-demo" );

        // Text area
        textArea = new JEditorPane();
        textArea.setEditable( false );
        textPanel = new JScrollPane( textArea );

        // Picture
        myPic = new ImageIcon( "acueductoSegovia.jpg" );
        picPanel = new JScrollPane( new JLabel( myPic ) );
        picPanel.setPreferredSize( new Dimension( 400, 400 ) );
        
        // Set up the panels
        inputPanel = new JPanel( new BorderLayout() );
        inputPanel.add( textPanel, BorderLayout.WEST );
        inputPanel.add( picPanel, BorderLayout.CENTER );
        setContentPane( inputPanel );

        // Load text contents
        try {
            textArea.setPage( new File( "contents.txt" ).toURI().toURL() );
        } catch (Throwable t) {
            t.printStackTrace();
        }

        // Make it visible
        setSize( 700, 500 );
        setVisible( true );
    }

    public static void main(String[] args)
    {
        new JScrollPaneGUI();
    }
    
    private JPanel inputPanel;
    private JScrollPane textPanel;
    private JScrollPane picPanel;
    private JEditorPane textArea;
    private ImageIcon myPic;
}
