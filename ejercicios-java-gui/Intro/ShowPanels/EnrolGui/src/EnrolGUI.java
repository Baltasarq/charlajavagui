
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class EnrolGUI extends JFrame {

    private JPanel mainPanel;
    private JPanel personalPanel;
    private JPanel explainPanel;
    private JPanel fieldPanel;
    private JPanel extraPanel;
    private JPanel buttonPanel;
    private JTextField christianNameField;
    private JTextField familyNameField;
    private JTextField mailAddressField;
    private JCheckBox choice1;
    private JCheckBox choice2;
    private JButton button1, button2;
    private TitledBorder personalBorder;

    public EnrolGUI()
    {
        setTitle( "Enrolling" );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		// Create main panel
        mainPanel = new JPanel();
        personalPanel = new JPanel( new FlowLayout() );
        explainPanel = new JPanel( new GridLayout( 3, 2 ) );
        fieldPanel = new JPanel( new GridLayout( 3, 2 ) );
        extraPanel = new JPanel( new GridLayout( 2, 1 ) );
        buttonPanel = new JPanel( new GridLayout( 2, 1 ) );

		// Create active components
        christianNameField = new JTextField( 12 );
        familyNameField = new JTextField( 12 );
        mailAddressField = new JTextField( 20 );
        fieldPanel.add( christianNameField );
        fieldPanel.add( familyNameField );
        fieldPanel.add( mailAddressField );
        explainPanel.add( new JLabel( "Christian name" ) );
        explainPanel.add( new JLabel( "Family name" ) );
        explainPanel.add( new JLabel( "Mail address" ) );
        choice1 = new JCheckBox( "I want confirmations to my mail" );
        choice2 = new JCheckBox( "I order a weekly newsletter" );
        button1 = new JButton( "Send" );
        button2 = new JButton( "Cancel" );


		// Place them on panels
		extraPanel.add( choice1 );
        extraPanel.add( choice2 );

        buttonPanel.add( button1 );
        buttonPanel.add( button2 );

        personalPanel.add( explainPanel );
        personalPanel.add( fieldPanel );
        personalBorder = BorderFactory.createTitledBorder(
                                    personalBorder, "Personal data" );
        personalPanel.setBorder( personalBorder );        

        mainPanel.add( personalPanel );
        mainPanel.add( extraPanel );
        mainPanel.add( buttonPanel );

		// Make it visible
        setContentPane( mainPanel );
        pack();
        setVisible( true );

    }

    public static void main(String[] args)
    {
        new EnrolGUI();
    }
}
