

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
  public GuiElements() {
      this.setTitle("Word Counting Application");
      this.setBounds( 200, 300, 400, 300);
      this.getContentPane().setLayout(null);
      this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
  }
}
