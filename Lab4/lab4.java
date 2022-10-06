import javax.swing.*;

public class lab4 {

	public static void main(String[] args) {

		while (true) {
			String[] wordArray = { "hello", "goodbye", "cat", "dog", "red", "green", "sun", "moon" };
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

	public static boolean wordIsThere(String findMe, String[] theList) {
		boolean wordFound = false;
		if (findMe.equals(null)){
            for (String x : theList) {
                if (x.equals(findMe)) {
                    wordFound = true;
                }
            }
        }
		return wordFound;
	} // wordIsThere
} // class Lab4Program1