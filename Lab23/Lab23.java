/**
 * Lab23
 */
public class Lab23 {
    public static void main(String[] args){
        String[] testStrings = {"noon","Madam I'm Adam", "A man, a plan, a canal, Panama", "A Toyota", "dog"};
        for (String x: testStrings){
            System.out.println(x + ": " + isPalindrome(x));
        }
    }

    public static boolean isPalindrome(String s){
        // System.out.println(s);
        if (s == "" || s.length() == 1){
            return true;
        }
        if (s.contains(" ") || s.contains("'") || s.contains(",")){
            return isPalindrome(s.replaceAll("[^A-Za-z]", ""));
        }
        else if (Character.toUpperCase(s.charAt(0)) ==  Character.toUpperCase(s.charAt(s.length()-1))){
            return isPalindrome(s.substring(1,s.length()-1));
        }
        else {
            return false;
        }
    }
    
}