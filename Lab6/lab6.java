//import java.util.ArrayList;

import java.util.ArrayList;

import javax.swing.*;
//import TextFileInput;

public class lab6 {

	public static void main(String[] args) {
		
		// while (true) {
			int[] inputArray = readInput(args[0]);
			ArrayList<Integer> inputArrayList = readInputasArrayList(args[0]);
			// int[] inputArray2 = new int[inputArrayList.size()];
			// for (int i = 0; i < inputArrayList.size()-1; i++){
			// 	inputArray2[i] = inputArrayList.get(i);
			// }
			// String isOrIsNot, inputWord;

			// This line asks the user for input by popping out a single window
			// with text input
			// inputWord = JOptionPane.showInputDialog(null, "Enter a word in all lower case:");


			
			// 3. The program only words for one word at a time. Insert an if statement that
			// will cause
			// the program to terminate (call System.exit(0)) if the word entered is "STOP".
			// Surround
			// the code that does the input, search and output with an infinite while loop
			// (while(true){code}). Compile and run the program.
			// if (inputWord.equals("STOP")) {
			// 	System.exit(0);
			// }
			
			// if the inputWord is contained within wordArray return true
			// if (wordIsThere(inputWord, wordArray))
			// 	isOrIsNot = "is"; // set to is if the word is on the list
			// else
			// 	isOrIsNot = "is not"; // set to is not if the word is not on the list

			// Output to a JOptionPane window whether the word is on the list or not
			JOptionPane.showMessageDialog(null, 
			"\nArray version:\nThe sum is "+sum(inputArray,inputArray.length)
			+ "\nAnd the average is "+average(inputArray, inputArray.length)
			+ "\n\nArrayList version:\n"+
			"The sum is "+sum(inputArrayList)
			+ "\nAnd the average is "+average(inputArrayList)
			);

		
	} // main




	public static int sum(int[] myArray, int myArraySize){
		int sumInt = 0;
		for (int x : myArray){
			sumInt += x;
		}
		return sumInt;
	}
	public static int sum(ArrayList<Integer> myArray){
		int sumInt = 0;
		for (int x : myArray){
			sumInt += x;
		}
		return sumInt;
	}

	public static int average (int[] myArray, int myArraySize){
		// int averageInt = 0;
		return (sum(myArray,myArraySize)/myArraySize);
	}
	public static int average (ArrayList<Integer> myArray){
		// int averageInt = 0;
		return (sum(myArray)/myArray.size());
	}


	public static int[] readInput(String fileLocation){
		//ArrayList<String> inputStringArrayList = new ArrayList<String>();
		TextFileInput in = new TextFileInput(fileLocation);
		
		String currentInput = in.readLine();
		while (currentInput != null){
			currentInput = in.readLine();
		}
		int numberOfLines = in.getLineCount();
		in.close();

		in = new TextFileInput(fileLocation);
		int returnInteger[] = new int[numberOfLines];
		for (int i = 0;i < returnInteger.length; i++){
			returnInteger[i] = Integer.parseInt(in.readLine());
			
		}
		// for (int x : returnInteger){
		// 	System.out.println(x);
		// }
		return returnInteger;
	}

	public static ArrayList<Integer> readInputasArrayList(String fileLocation){
		ArrayList<Integer> inputIntArrayList = new ArrayList<Integer>();
		TextFileInput in = new TextFileInput(fileLocation);
		
		String currentInput = in.readLine();
		while (currentInput != null){
			inputIntArrayList.add(Integer.parseInt(currentInput));
			currentInput = in.readLine();
		}
		return inputIntArrayList;
	}


	// public static boolean wordIsThere(String findMe, Integer[] theList) {
	// 	boolean wordFound = false;
	// 	for (Integer x : theList) {
	// 		// if (x.equals(findMe)) {
	// 		// 	wordFound = true;
	// 		// }
	// 	}
	// 	return wordFound;
	// } // wordIsThere
} // class Lab4Program1