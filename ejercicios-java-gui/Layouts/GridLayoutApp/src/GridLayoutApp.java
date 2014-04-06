import javax.swing.*;
import java.awt.*;

public class GridLayoutApp extends JFrame {
    
    public GridLayoutApp(){
        setTitle( "GridLayout" );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create buttons
        for (int i=0; i<buttonTable.length; i++) {
            buttonTable[i] = new JButton("Button "+(i+1));
        }

        // Create panel
        myPanel = new JPanel(new GridLayout(4,3));
        for (int i=0; i<buttonTable.length; i++) {
            myPanel.add( buttonTable[i] );
        }

		// Make it visible
		setContentPane(myPanel);
        setSize(400, 100);
        setVisible(true);
    }

    public static void main(String[] args)
    {
		new GridLayoutApp();
	}

    private JButton[] buttonTable = new JButton[12];
    private JPanel myPanel;

}
