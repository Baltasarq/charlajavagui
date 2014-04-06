
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SelectionGUI extends JFrame {

    public SelectionGUI()
    {

        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setTitle( "Selection demo" );

        // Create radio buttons
        vp1 = new JRadioButton( "Coffee" );
        vp2 = new JRadioButton( "Tea" );
        vp3 = new JRadioButton( "Chocolate" );
        vp1.setSelected( true );
        vp1.setActionCommand( "Coffee" );
        vp2.setActionCommand( "Tea" );
        vp3.setActionCommand( "Chocolate" );

        selectionGroup = new ButtonGroup();
        selectionGroup.add( vp1 );
        selectionGroup.add( vp2 );
        selectionGroup.add( vp3 );

        // Create checkboxes
        box1 = new JCheckBox( "Biscuit" );
        box2 = new JCheckBox( "Bread" );

        // Create other controls
        resultField = new JTextField();
        resultField.setEditable( false );
        myButton = new JButton( "Select" );

        // Place components on panels
        inputPanel = new JPanel();
        selectionPanel = new JPanel();
        selectionPanel.setBorder( BorderFactory.createEtchedBorder() );
        selectionPanel.add( vp1 );
        selectionPanel.add( vp2 );
        selectionPanel.add( vp3 );
        inputPanel.add( selectionPanel );
        inputPanel.add( box1 );
        inputPanel.add( box2 );
        inputPanel.add( myButton );

        // Button event
        myButton.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                cont.select();
            }
        } );

        // Create main panel, with border layout
        contentPanel = new JPanel( new BorderLayout() );
        contentPanel.add( inputPanel, BorderLayout.CENTER );
        contentPanel.add( resultField, BorderLayout.SOUTH );

        // Make it visible
        setContentPane( contentPanel );
        pack();
        setVisible( true );
    }

    public void setResult(String choise)
    {
        resultField.setText( choise );
    }

    public String giveSelection()
    {
        return selectionGroup.getSelection().getActionCommand();
    }

    public boolean biscuitSelected()
    {
        return box1.isSelected();
    }

    public boolean breadSelected()
    {
        return box2.isSelected();
    }

    public void registerController(SelectionController cont)
    {
        this.cont = cont;
    }
    private SelectionController cont;
    private JButton myButton;
    private JTextField resultField;
    private ButtonGroup selectionGroup;
    private JRadioButton vp1, vp2, vp3;
    private JCheckBox box1, box2;
    private JPanel contentPanel, selectionPanel, inputPanel;
}
