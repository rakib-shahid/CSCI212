public class WordLine implements Comparable<WordLine> {
    // default values
    private int lineNumber = 0;
    private String word = "";

    // constructor
    public WordLine(String w, int n) {
        if (n >= 1) {
            this.word = w;
            this.lineNumber = n;
        }
        else {
            throw new IllegalWordLineException("Illegal Number!");
        }
    }

    // get word from WordLine
    public String getWord() {
        return word;
    }

    // get line # from WordLine
    public int getLine() {
        return lineNumber;
    }

    // toString method for easier printing and conversion to string
    public String toString() {
        return this.getLine() + ": " + this.getWord();
    }

    // override compareTo method to sort easier
    @Override
    public int compareTo(WordLine wLine) {
        return (this.getWord().compareTo(wLine.getWord()));
    }
}