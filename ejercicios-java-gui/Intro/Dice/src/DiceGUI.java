import java.awt.event.*;
import javax.swing.*;

public class DiceGUI extends JFrame{

    private DiceController cont;
    private JPanel myContentPanel;
    private JButton myCastButton;
    private JLabel myResult;

    public DiceGUI()
    {
        initComponents();
    }

    public void registerController(DiceController cont)
    {
        this.cont = cont;
    }

    public final void initComponents()
    {
        setTitle("ComputerDice");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create GUI
        myContentPanel = new JPanel();
        myCastButton = new JButton("Push");
        myResult = new JLabel("0");
        myContentPanel.add(myCastButton);
        myContentPanel.add(myResult);

        // Button event
        myCastButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cont.myCast();
            }
        });

		// Make it visible
		setContentPane(myContentPanel);
        setSize(180, 80);
        setVisible(true);
    }

    public void putResult(int points)
    {
        myResult.setText(String.valueOf(points));
    }
}
