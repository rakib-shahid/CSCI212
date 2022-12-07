import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class day1 {
   public static void main(String[] args) {
      File input = new File("input.txt");
      try {
         int ch;
         FileInputStream fis = new FileInputStream(input);
         String fileAsString = "";
         while ((ch = fis.read()) != -1) {
            fileAsString += Character.toString(ch);
         }
         fis.close();

         String[] calorieStrings = fileAsString.split("\n\n");
         ArrayList<Integer> calArr = new ArrayList<Integer>();
         int[] topThree = new int[3];

         for (String s : calorieStrings) {
            String[] indivStrings = s.split("\n");
            int sum = 0;
            for (String num : indivStrings) {
               sum += Integer.parseInt(num);
            }
            calArr.add(sum);
         }

         int biggest = 0;

         for (Integer x : calArr) {
            if (x > biggest) {
               biggest = x;
            }
            if (x > topThree[0]){
               Arrays.sort(topThree);
               topThree[0] = x;
            }
         }
         
         Arrays.sort(topThree);
         System.out.println("biggest= "+biggest);
         System.out.println("Top three =");
         int threeSum = 0;
         for (int x : topThree){
            threeSum += x;
            System.out.println(x);
         }
         System.out.println("sum of top three = "+threeSum);
         

      } catch (Exception e) {
         e.printStackTrace();
      }

   }

}