import javax.swing.*;
import java.awt.*;

public class BorderLayoutApp extends JFrame {
    
    public BorderLayoutApp(){
        setTitle( "GridLayout" );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create buttons
        for (int i=0; i<buttonTable.length; i++) {
            buttonTable[i] = new JButton("Button "+(i+1));
        }

        // Create panel
        myPanel = new JPanel(new BorderLayout());
        myPanel.add(buttonTable[0], BorderLayout.NORTH);
        myPanel.add(buttonTable[1], BorderLayout.SOUTH);
        myPanel.add(buttonTable[2], BorderLayout.WEST);
        myPanel.add(buttonTable[3], BorderLayout.EAST);
        myPanel.add(buttonTable[4], BorderLayout.CENTER);

		// Make it visible
		setContentPane(myPanel);
        setSize(400, 100);
        setVisible(true);
    }

    public static void main(String[] args)
    {
	new BorderLayoutApp();
    }

    private JButton[] buttonTable = new JButton[12];
    private JPanel myPanel;

}
