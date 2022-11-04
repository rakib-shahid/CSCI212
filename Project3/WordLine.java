public class WordLine{
    // default values
    private int lineNumber = -1;
    private String word = "";
    // constructor
    public WordLine(String w, int n){
        this.word = w;
        this.lineNumber = n;
    }
    public String getWord(){
        return word;
    }
    public int getLine(){
        return lineNumber;
    }
}