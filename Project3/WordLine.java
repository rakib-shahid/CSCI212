public class WordLine implements Comparable<WordLine>{
    // default values
    private int lineNumber = -1;
    private String word = "";
    // constructor
    public WordLine(String w, int n){
        this.word = w;
        this.lineNumber = n;
    }
    // get word from WordLine
    public String getWord(){
        return word;
    }
    // get line # from WordLine
    public int getLine(){
        return lineNumber;
    }
    public String toString(){
        return this.getLine() + ": " + this.getWord();
    }

    @Override
    public int compareTo(WordLine wLine){
        return (this.getWord().compareTo(wLine.getWord()));
    } 
}