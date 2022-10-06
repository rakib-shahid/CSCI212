//import java.util.ArrayList;

import javax.swing.*;
//import TextFileInput;

public class lab5 {

	public static void main(String[] args) {
		
		while (true) {
			String[] wordArray = readInput(args[0]);
			String isOrIsNot, inputWord;

			// This line asks the user for input by popping out a single window
			// with text input
			inputWord = JOptionPane.showInputDialog(null, "Enter a word in all lower case:");


			
			// 3. The program only words for one word at a time. Insert an if statement that
			// will cause
			// the program to terminate (call System.exit(0)) if the word entered is "STOP".
			// Surround
			// the code that does the input, search and output with an infinite while loop
			// (while(true){code}). Compile and run the program.
			if (inputWord.equals("STOP")) {
				System.exit(0);
			}
			
			// if the inputWord is contained within wordArray return true
			if (wordIsThere(inputWord, wordArray))
				isOrIsNot = "is"; // set to is if the word is on the list
			else
				isOrIsNot = "is not"; // set to is not if the word is not on the list

			// Output to a JOptionPane window whether the word is on the list or not
			JOptionPane.showMessageDialog(null, "The word " + inputWord + " " + isOrIsNot + " on the list.");

		}
	} // main


	//	textfileinput stinks and i dont want to use arraylist so i have to open the file twice
	//	once to get the number of lines (because textfileinput stinks and doesnt have a method for that without reading)
	//	and again to get the actual strings
	public static String[] readInput(String fileLocation){
		//ArrayList<String> inputStringArrayList = new ArrayList<String>();
		TextFileInput in = new TextFileInput(fileLocation);
		
		String currentInput = in.readLine();
		while (currentInput != null){
			currentInput = in.readLine();
		}
		int numberOfLines = in.getLineCount();
		in.close();

		in = new TextFileInput(fileLocation);
		String returnString[] = new String[numberOfLines];
		for (int i = 0;i < returnString.length; i++){
			returnString[i] = currentInput = in.readLine();
			
		}
		return returnString;
	}


	public static boolean wordIsThere(String findMe, String[] theList) {
		boolean wordFound = false;
		for (String x : theList) {
			if (x.equals(findMe)) {
				wordFound = true;
			}
		}
		return wordFound;
	} // wordIsThere
} // class Lab4Program1