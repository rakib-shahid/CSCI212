public class WordLine implements Comparable<WordLine> {
    // default values
    private int lineNumber = 0;
    private String word = "";

    /**
     * Constructor for WordLine
     * @param w Word
     * @param n Line number
     */
    public WordLine(String w, int n) {
        if (n >= 1) {
            this.word = w;
            this.lineNumber = n;
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

    /**
     * get line number from WordLine
     * @return returns line number
     */
    public int getLine() {
        return lineNumber;
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