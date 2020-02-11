

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

class GuiElements extends JFrame {

  private JButton inputFileChooserButton = new JButton("Pick Input File");
  private JButton outputFileLocationChooserButton = new JButton("Pick Output File Location");
  private JTextField inputFileLocationField = new JTextField(40);
  private JTextField outputFileLocationField = new JTextField(40);

  public GuiElements() {
      this.setTitle("Word Counting Application");
      this.setBounds(200,300,600,600);
      this.getContentPane().setLayout(null);
      this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);

      this.inputFileChooserButton.setBounds(10,80,130,30);
      this.getContentPane().add(inputFileChooserButton);



      this.outputFileLocationChooserButton.setBounds(10,120,130,30);
      this.getContentPane().add(outputFileLocationChooserButton);


  }
}
