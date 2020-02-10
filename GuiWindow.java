/*
 * Erik Steinmetz
 * GUI example with FileChooser
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * The window with a couple of buttons.
 * @author Erik Steinmetz
 */
public class GuiWindow extends JFrame implements ActionListener {
    
    private JButton convertButton = new JButton( "Convert");
    private JTextField fahrTemp = new JTextField( 20);
    private JLabel fahrLabel = new JLabel( "Fahrenheit:");
    private JLabel celLabel = new JLabel( "Celcius:");
    private JLabel answer = new JLabel ( "Unknown");
    
    private JButton fileButton = new JButton( "Which File?");
    
    /**
     * Creates a GuiWindow, positioning all the components.
     */
    public GuiWindow() {
        this.setTitle("Temp Application");
        this.setBounds( 200, 300, 250, 150);
        this.getContentPane().setLayout(null);
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        
        this.convertButton.setBounds(10, 80, 100, 30);
        this.getContentPane().add( convertButton);
        this.convertButton.addActionListener( this);
        
        this.fahrTemp.setBounds( 120, 20, 100, 30);
        this.getContentPane().add( fahrTemp);

        this.fahrLabel.setBounds(10, 20, 100, 30);
        this.getContentPane().add( fahrLabel);

        this.celLabel.setBounds(10, 60, 100, 30);
        this.getContentPane().add( celLabel);
        
        this.answer.setBounds(120, 60, 100, 30);
        this.getContentPane().add( answer);
        
        this.fileButton.setBounds(120, 80, 100, 30);
        this.getContentPane().add(fileButton);
        this.fileButton.addActionListener( this);
    }
    
    /**
     * Converts the existing temp to Celcius.
     */
    private void theConvertButtonHasBeenPushed() {
        String text = fahrTemp.getText();
        double f = 0.0;
        try {
            f = Double.parseDouble(text);
        }
        catch( Exception e) {
            
        }
        double c = convertF2C( f);
        String cString = "" + c;
        this.answer.setText(cString);
        
    }
    
    /**
     * Invokes a file chooser with a text filter.
     */
    private void theFileButtonHasBeenPushed() {
            System.out.println("hit the file button");
            JFileChooser chooser = new JFileChooser();
            chooser.setFileFilter( new FileNameExtensionFilter("TEXT FILES", "txt", "text"));
            System.out.println("I created the file chooser");
            int chooserSuccess = chooser.showOpenDialog( null);
            System.out.println("I opended the file chooser, it returned " + chooserSuccess);
            if( chooserSuccess == JFileChooser.APPROVE_OPTION) {
                File chosenFile = chooser.getSelectedFile();
                // Pass this file to your function
                System.out.println("You chose the file " + chosenFile.getAbsolutePath());
                System.out.println("You chose the file " + chosenFile.getName());
            }
            else {
                System.out.println("You hit cancel");
            }
        
    }
    
    /**
     * Converts degrees Fahrenheit to degrees Celcius.
     * @param f The temperature in Fahrenheit
     * @return The temperature in Celcius
     */
    private double convertF2C(double f) {
        double answer = (f - 32) * 5.0 / 9.0 ;
        return answer;
    }
    
    /**
     * Callback responding to pushes on either button.
     * @param e The action event, including the button command.
     */
    @Override
    public void actionPerformed( ActionEvent e) {
        System.out.println("The action event is " + e);
        if( e.getActionCommand().equals("Convert")) {
            this.theConvertButtonHasBeenPushed();
        }
        else if ( e.getActionCommand().equals("Which File?")) {
            this.theFileButtonHasBeenPushed();
        }
        
    }
        
}
