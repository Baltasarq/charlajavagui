import javax.swing.*;
import java.awt.event.*;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import com.sun.java.swing.plaf.motif.MotifLookAndFeel;
import javax.swing.plaf.metal.MetalLookAndFeel;
import com.sun.java.swing.plaf.gtk.GTKLookAndFeel;

public class MenuApp extends JFrame {
    
    public MenuApp() {
        this.initComponents();
    }

	public void initComponents() {
        this.setTitle( "MenuApp" );
        this.setDefaultCloseOperation( EXIT_ON_CLOSE );

        // Create menus
        JMenuBar mMain = new JMenuBar();

		// Create file menu
        JMenu mFiles = new JMenu( "File" );
        JMenuItem opQuit = new JMenuItem( "Quit" );
        mFiles.add( opQuit );
        mMain.add( mFiles );

        // Create view menu
        JMenu mView = new JMenu( "View" );
        JMenuItem opWindowsView = new JMenuItem( "Windows look" );
        JMenuItem opGtkView = new JMenuItem( "Gtk+ look" );
        JMenuItem opMetalView = new JMenuItem( "Metal look" );
        JMenuItem opMotifView = new JMenuItem( "Motif look" );
        mView.add( opMetalView );
        mView.add( opGtkView );
        mView.add( opWindowsView );
        mView.add( opMotifView );
        mMain.add( mView );

        // Selected options
        opQuit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible( false );
            }
        });
        opWindowsView.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setLookAndFeel( "com.sun.java.swing.plaf.windows.WindowsLookAndFeel" );
            }
        });
        opMetalView.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setLookAndFeel( "javax.swing.plaf.metal.MetalLookAndFeel" );
            }
        });
        opGtkView.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setLookAndFeel( "com.sun.java.swing.plaf.gtk.GTKLookAndFeel" );
            }
        });
        opMotifView.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setLookAndFeel( "com.sun.java.swing.plaf.motif.MotifLookAndFeel" );
            }
        });

        // Make it visible
        this.setJMenuBar( mMain );
        this.setSize( 300, 300 );
        this.setVisible(true);
    }

    public void setLookAndFeel(String lookName)
    {
		try {
			UIManager.setLookAndFeel( lookName );
			SwingUtilities.updateComponentTreeUI( this );
		}
		catch (Exception e) {
			System.err.println(
				"Look and Feel - setting miss, for: " + lookName
				+ '\n' + e.getMessage()
			);
		}

	}

    public static void main(String[] args) {
        new MenuApp();
    }
}
