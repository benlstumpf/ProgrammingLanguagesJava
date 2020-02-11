

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

  private int windowSizeHorisontal = 650;
  private int windowSizeVertical = 600;

  private int distanceBetweenInputAndOutputVerticaly = 10;
  private int dataEntryRowHeight = 30;
  private int fileLocationButtonLength = 200;
  private int fileChooserButtonDistanceFromLeftEdge = 10;
  private int fileLocationFieldLength = 400;
  private int fileChooseInputElementsDistanceFromTopEdge = 30;

  private int fileChooserFieldDistanceFromLeftEdge = 10 + fileChooserButtonDistanceFromLeftEdge + fileLocationButtonLength;
  private int fileChooseOutputElementsDistanceFromTopEdge = distanceBetweenInputAndOutputVerticaly + fileChooseInputElementsDistanceFromTopEdge + dataEntryRowHeight;

  private int totalWordCountReportLabelVerticalStart =

  private JButton inputFileChooserButton = new JButton("Pick Input File Location");
  private JButton outputFileLocationChooserButton = new JButton("Pick Output File Location");
  private JTextField inputFileLocationField = new JTextField(40);
  private JTextField outputFileLocationField = new JTextField(40);

  private JLabel fahrLabel = new JLabel( "Total Word Count:");
  private JLabel fahrLabel = new JLabel( "Unique Word Count:");

  public GuiElements() {
      this.setTitle("Word Counting Application");
      this.setBounds(200,300,windowSizeHorisontal,windowSizeVertical);
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

      this.fahrLabel.setBounds(10,20,100,30);
      this.getContentPane().add( fahrLabel);

      this.celLabel.setBounds(10,60,100,30);
      this.getContentPane().add( celLabel);
  }
}
