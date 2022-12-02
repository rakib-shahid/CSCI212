import java.util.ArrayList;

public class WordLine implements Comparable<WordLine> {
    // default values
    private ArrayList<Integer> lineList = new ArrayList<Integer>();
    private String word = "";

    /**
     * Constructor for WordLine
     * @param w Word
     * @param n Line number
     */
    public WordLine(String w, int n) {
        if (n >= 1) {
            this.word = w;
            lineList.add(n);
        }
        // Check if line number is valid
        else {
            throw new IllegalWordLineException("Illegal Line Number!");
        }
    }

    /**
     * get word from WordLine
     * @return Returns word
     */
    public String getWord() {
        return word;
    }


    // new method created to make adding line numbers into the ArrayList easier
    
    /**
     * add line number to arraylist
     * @param n line number to be added
     */
    public void addLine(int n){
        if (n >= 0){
            lineList.add(n);
        }
    }

    /**
     * get line number from WordLine
     * @return returns line number
     */
    public ArrayList<Integer> getLine() {
        // return lineNumber;
        return lineList;
    }

    // toString method for easier printing and conversion to string
    public String toString() {
        return this.getLine() + ": " + this.getWord();
    }

    // override compareTo method to sort using sort() method
    @Override
    public int compareTo(WordLine wLine) {
        return (this.getWord().compareTo(wLine.getWord()));
    }
}