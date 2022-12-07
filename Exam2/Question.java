public class Question {
   public static void main(String[] args) {
      Alpha myArray[] = new Alpha[4];
      for (Alpha a: myArray){
         System.out.println(a);
      }
      myArray[0] = new Beta(1);
      myArray[1] = new Beta(3);
      myArray[2] = new Gamma(5);
      myArray[3] = new Gamma(7);

   }
}