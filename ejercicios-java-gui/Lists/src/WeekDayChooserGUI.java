
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class WeekDayChooserGUI extends JFrame {
	public WeekDayChooserGUI()
	{
		// Create combobox
		Border myBorder= BorderFactory.createEtchedBorder();
		weekDayList = new JComboBox(myDays);
		weekDayList.setBorder(myBorder);

		// Create content panel
		myContents = new JPanel();
		myContents.add(weekDayList);

		// Make it visible
		setContentPane( myContents );
		pack();
		setVisible( true );
    }

    public static void main(String[] args)
    {
		new WeekDayChooserGUI();
    }

    private JComboBox weekDayList;
	private JButton mtButton;
	private JPanel myContents;
	private static final String[] myDays= {
			"Monday", "Tuesday", "Wednesday",
			"Thursday", "Friday", "Saturday", "Sunday"
	};
}
