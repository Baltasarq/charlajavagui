import javax.swing.*;
import java.awt.event.*;

public class MouseButton extends JFrame {

    private JPanel myContentPanel;
    private JLabel intro;

    public MouseButton() {
        initComponents();
    }

	public void initComponents() {
        setTitle("Mouse button");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create panel
        myContentPanel = new JPanel();
        intro = new JLabel("Push mouse button.");
        myContentPanel.add(intro);

        // Manage mouse click event
        myContentPanel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                intro.setText("Button pushed.");
            }
        });

        // Make it visible
        setContentPane(myContentPanel);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseButton();
    }
}
