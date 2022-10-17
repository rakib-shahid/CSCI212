/***************************************************************
 * 
 * @author Rakib Shahid
 *         A program that reads input from a file and shows how many vowels are present in it.
 *
 */

public class Project1 {
    /**
     * Main method, reads text and counts vowels, outputs with GUI
     * @param args String of arguments
     */
    public static void main(String[] args) {
        
        TextFileInput myFile = new TextFileInput("input.txt");

        // Array of integers to count number of each vowel, easier than 5 separate integer variables
        int[] vowelCounters = new int[5];

        // String to hold original text from file for GUI display later
        String originalText = "";

        // While file has a next line, continue to read
        String currentLine = myFile.readLine();
        while (currentLine != null) {
            originalText += currentLine + "\n";

            // Check for vowels in the line, increment respective counter in vowelCounters array
            for (int i = 0; i < currentLine.length(); i++) {
                if (currentLine.charAt(i) == 'a' || currentLine.charAt(i) == 'A') {
                    vowelCounters[0]++;
                } else if (currentLine.charAt(i) == 'e' || currentLine.charAt(i) == 'E') {
                    vowelCounters[1]++;
                } else if (currentLine.charAt(i) == 'i' || currentLine.charAt(i) == 'I') {
                    vowelCounters[2]++;
                } else if (currentLine.charAt(i) == 'o' || currentLine.charAt(i) == 'O') {
                    vowelCounters[3]++;
                } else if (currentLine.charAt(i) == 'u' || currentLine.charAt(i) == 'U') {
                    vowelCounters[4]++;
                }
            }

            // Read in the next line
            currentLine = myFile.readLine();
        }
        String[] stringArray = {"3","2"};
        System.out.println(stringArray.length);


        // Use VowelGUI to display the final output
        VowelGUI myGUI = new VowelGUI(originalText, vowelCounters);
    }
}