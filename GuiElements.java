

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

  private int distanceBetweenInputAndOutputVerticaly = 10;
  private int dataEntryRowHeight = 30;
  private int fileLocationButtonLength = 140;
  private int fileChooserButtonDistanceFromLeftEdge = 10;
  private int fileLocationFieldLength = 400;
  private int fileChooserFieldDistanceFromLeftEdge = 10 + fileChooserButtonDistanceFromLeftEdge + fileLocationButtonLength;
  private int fileChooseInputElementsDistanceFromTopEdge = 80;
  private int fileChooseOutputElementsDistanceFromTopEdge = distanceBetweenInputAndOutputVerticaly + fileChooseInputElementsDistanceFromTopEdge + dataEntryRowHeight;

  private JButton inputFileChooserButton = new JButton("Pick Input File");
  private JButton outputFileLocationChooserButton = new JButton("Pick Output File Location");
  private JTextField inputFileLocationField = new JTextField(40);
  private JTextField outputFileLocationField = new JTextField(40);

  public GuiElements() {
      this.setTitle("Word Counting Application");
      this.setBounds(200,300,600,600);
      this.getContentPane().setLayout(null);
      this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);

      this.inputFileChooserButton.setBounds(fileChooserButtonDistanceFromLeftEdge,fileChooseInputElementsDistanceFromTopEdge,fileLocationButtonLength,dataEntryRowHeight);
      this.getContentPane().add(inputFileChooserButton);

      this.inputFileLocationField.setBounds(fileChooserFieldDistanceFromLeftEdge,fileChooseInputElementsDistanceFromTopEdge,fileLocationFieldLength,dataEntryRowHeight);
      this.getContentPane().add(inputFileLocationField);

      this.outputFileLocationChooserButton.setBounds(fileChooserButtonDistanceFromLeftEdge,fileChooseOutputElementsDistanceFromTopEdge,fileLocationButtonLength,dataEntryRowHeight);
      this.getContentPane().add(outputFileLocationChooserButton);

      this.outputFileLocationField.setBounds(fileChooserFieldDistanceFromLeftEdge,fileChooseOutputElementsDistanceFromTopEdge,fileLocationFieldLength,dataEntryRowHeight);
      this.getContentPane().add(outputFileLocationField);
  }
}
