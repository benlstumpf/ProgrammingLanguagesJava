

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.HashMap;
import java.util.Scanner;

class GuiElements extends JFrame implements ActionListener {

  private int windowSizeHorisontal = 650;
  private int windowSizeVertical = 600;


  private int distanceBetweenInputAndOutputVerticaly = 10;
  private int defaultTextSpaceHieght = 30;
  private int fileLocationButtonLength = 200;
  private int bufferDistanceFromLeftEdge = 10;
  private int fileLocationFieldLength = 400;
  private int fileChooseInputElementsDistanceFromTopEdge = 30;
  private int leftSideColumnCenter = (windowSizeHorisontal/4);
  private int rightSideColumnCenter = (windowSizeHorisontal/4) + (windowSizeHorisontal/2);
  private int rightSideColumnLeftStart = (windowSizeHorisontal/2) + 5; // 5 for half the gap of 10
  private int columnWidth = (windowSizeHorisontal/2) - 15; //15 is 10 for the edge buffer and half of the middle buffer

  private int centerOfWindow = windowSizeHorisontal/2;

  //TODO document what this equation means and where the math came from
  private int fileChooserFieldDistanceFromLeftEdge = 10 + bufferDistanceFromLeftEdge + fileLocationButtonLength;
  //TODO document what this equation means and where the math came from
  private int fileChooseOutputElementsDistanceFromTopEdge = distanceBetweenInputAndOutputVerticaly + fileChooseInputElementsDistanceFromTopEdge + defaultTextSpaceHieght;


  private int wordCountLabelLength = 130;
  //TODO document what this equation means and where the math came from
  private int totalWordCountReportLabelVerticalStart = 60 + defaultTextSpaceHieght + fileChooseOutputElementsDistanceFromTopEdge;
  private int totalWordCountReportLabelHorizontalStart = leftSideColumnCenter - (wordCountLabelLength/2); //left side center - half label size
  //TODO document what this equation means and where the math came from
  private int totalUniqueWordCountReportLabelHorizontalStart = rightSideColumnCenter - (wordCountLabelLength/2);


  private JButton inputFileChooserButton = new JButton("Pick Input File Location");
  //private JButton outputFileLocationChooserButton = new JButton("Pick Output File Location");
  private JLabel inputFileLocationField = new JLabel();
  //private JLabel outputFileLocationField = new JLabel();

  private JLabel totalWordCountlabel = new JLabel( "Total Word Count:");

  private JLabel uniqueWordCountLabel = new JLabel( "Unique Word Count:");

  private String inputFileLocation = "";
  private String outputFileLocation = "outputWordCount.txt";

  private JLabel[] topFiveWordLabels = new JLabel[5];
  private JLabel[] bottomFiveWordLabels = new JLabel[5];

  //TODO Place and implement update to label, this is for feed back to the user
  private JTextField statusLabel;

  //TODO place this button
  private JButton countWordsButton = new JButton("Count Words");

  public GuiElements() {
      this.setTitle("Word Counting Application");
      this.setBounds(200,300,windowSizeHorisontal,windowSizeVertical);
      this.getContentPane().setLayout(null);
      this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);

      this.inputFileChooserButton.setBounds(bufferDistanceFromLeftEdge,fileChooseInputElementsDistanceFromTopEdge,fileLocationButtonLength,defaultTextSpaceHieght);
      this.getContentPane().add(inputFileChooserButton);
      this.inputFileChooserButton.addActionListener(this);

      this.inputFileLocationField.setBounds(fileChooserFieldDistanceFromLeftEdge,fileChooseInputElementsDistanceFromTopEdge,fileLocationFieldLength,defaultTextSpaceHieght);
      this.getContentPane().add(inputFileLocationField);
/*
      this.outputFileLocationChooserButton.setBounds(bufferDistanceFromLeftEdge,fileChooseOutputElementsDistanceFromTopEdge,fileLocationButtonLength,defaultTextSpaceHieght);
      this.getContentPane().add(outputFileLocationChooserButton);
      this.outputFileLocationChooserButton.addActionListener(this);

      this.outputFileLocationField.setBounds(fileChooserFieldDistanceFromLeftEdge,fileChooseOutputElementsDistanceFromTopEdge,fileLocationFieldLength,defaultTextSpaceHieght);
      this.getContentPane().add(outputFileLocationField);
*/
      this.totalWordCountlabel.setBounds(totalWordCountReportLabelHorizontalStart,totalWordCountReportLabelVerticalStart,wordCountLabelLength,defaultTextSpaceHieght);
      this.getContentPane().add( totalWordCountlabel);

      this.uniqueWordCountLabel.setBounds(totalUniqueWordCountReportLabelHorizontalStart,totalWordCountReportLabelVerticalStart,wordCountLabelLength,defaultTextSpaceHieght);
      this.getContentPane().add( uniqueWordCountLabel);

      this.countWordsButton.setBounds(centerOfWindow, windowSizeVertical - 60, 100, 30);
      this.getContentPane().add( countWordsButton);
      this.countWordsButton.addActionListener( this);

      for(int i = topFiveWordLabels.length-1; i >= 0; i--){
        /*
        height of window
        buffer
        ()
         */
        int rowVerticalPlacement = windowSizeVertical - 80 - (defaultTextSpaceHieght * ((topFiveWordLabels.length-1) - i)+(distanceBetweenInputAndOutputVerticaly*(topFiveWordLabels.length-1) - i));

        topFiveWordLabels[i] = new JLabel();

        this.topFiveWordLabels[i].setBounds(bufferDistanceFromLeftEdge,rowVerticalPlacement,columnWidth,defaultTextSpaceHieght);
        this.getContentPane().add(topFiveWordLabels[i]);

        bottomFiveWordLabels[i] = new JLabel();

        this.bottomFiveWordLabels[i].setBounds(rightSideColumnLeftStart,rowVerticalPlacement,columnWidth,defaultTextSpaceHieght);
        this.getContentPane().add(bottomFiveWordLabels[i]);

      }

  }
  private String fileButtonHasBeenPushed() {
      JFileChooser fileChooser = new JFileChooser();
      fileChooser.setFileFilter( new FileNameExtensionFilter("TEXT FILES", "txt", "text"));
      int chooserSuccess = fileChooser.showOpenDialog(null);
      if( chooserSuccess == JFileChooser.APPROVE_OPTION) {
          File chosenFile = fileChooser.getSelectedFile();
          return chosenFile.getAbsolutePath();
      }
      else {
          return "";
      }

  }

  private void countButtonHasBeenPushed(){
    Scanner scanner = FileHandler.getScanner(inputFileLocation);

		//Make HashMap to store words
		HashMap hashmap = new HashMap();
		hashmap = WordCounting.countWords(scanner, hashmap);

		//Convert hashmap from map to array
		EntryObject[] completeList = Reporting.mapToList(hashmap);

		Reporting.sortArray(completeList);


		EntryObject[] topFive = Reporting.getTopFive(completeList);
    displayFiveWords(topFive, topFiveWordLabels);
		EntryObject[] bottomFive = Reporting.getBottomFive(completeList);
    displayFiveWords(bottomFive, bottomFiveWordLabels);

		Reporting.arrayToFile(completeList, FileHandler.getBufferWriter(outputFileLocation));
  }

  private void displayFiveWords (EntryObject[] sourceWordList, JLabel[] displayWordList){
    for (int i = 0; i < sourceWordList.length; i++){
      displayWordList[i].setText(sourceWordList[i].getKey().toString() + sourceWordList[i].getValue());
    }
  }

  @Override
  public void actionPerformed( ActionEvent e) {
      if( e.getActionCommand().equals("Pick Input File Location")) {
        inputFileLocation = this.fileButtonHasBeenPushed();
        inputFileLocationField.setText(inputFileLocation);
      }
      /*
      else if ( e.getActionCommand().equals("Pick Output File Location")) {
        outputFileLocation = this.fileButtonHasBeenPushed();
        outputFileLocationField.setText(outputFileLocation);

      }
      */
      else if ( e.getActionCommand().equals("Count Words")) {
        System.out.println("The action event is " + e);
          this.countButtonHasBeenPushed();
      }

  }
}
