public class lab3 {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        float fahrenheit,centigrade;
        System.out.println("4.\n");
        fahrenheit = (float)98.6;
        centigrade = (fahrenheit-32)*(5/9);
        System.out.println("Fahrenheit = " + fahrenheit);
        System.out.println("Centigrade = " + centigrade);
        System.out.println("\n5. For loop");
        for (float i = 0; i < 40.5; i+=0.5 ){
            fahrenheit = i;
            centigrade = (float)((fahrenheit-32)*(5.0/9.0));
            System.out.println("Fahrenheit = " + fahrenheit);
            System.out.println("Centigrade = " + centigrade);
        }
        System.out.println("\n6. While loop");
        fahrenheit = 0;
        while (fahrenheit < 40.5) {
            centigrade = (float)((fahrenheit-32)*(5.0/9.0));
            System.out.println("Fahrenheit = " + fahrenheit);
            System.out.println("Centigrade = " + centigrade);
            fahrenheit += 0.5;
        }
    }
}