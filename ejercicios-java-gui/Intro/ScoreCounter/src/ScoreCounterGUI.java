
import java.awt.event.*;
import javax.swing.*;

public class ScoreCounterGUI extends JFrame
{

    private ScoreCounterController count;
    private JLabel myLabel;
    private JButton addButton;
    private JButton zeroButton;

    public ScoreCounterGUI()
    {
        initComponents();
    }

    private void initComponents()
    {
        setTitle( "Score Counter" );
        setDefaultCloseOperation( EXIT_ON_CLOSE );

        // Create main panel
        JPanel myContentPane = new JPanel();
        myLabel = new JLabel();
        addButton = new JButton( "Add" );
        zeroButton = new JButton( "Make zero" );
        myContentPane.add( myLabel );
        myContentPane.add( addButton );
        myContentPane.add( zeroButton );

		// Events for buttons
        addButton.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                count.bumbUp();
            }
        } );
        
        zeroButton.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                count.zero();
            }
        } );

		// Make it visible
		setContentPane( myContentPane );
        pack();
        setVisible( true );
    }

    public void updateScore(int score)
    {
        myLabel.setText( String.valueOf( score ) );
        pack();
    }

    public void registerController(ScoreCounterController count)
    {
        this.count = count;
    }
}
