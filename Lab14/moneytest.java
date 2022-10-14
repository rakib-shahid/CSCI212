public class moneytest {

    public static void main(String[] args) {
        System.out.println("m1 = new Money(1,95)");
        Money m1 = new Money(1,95);
        System.out.println("m2 = new Money(6,243)\n");
        Money m2 = new Money(6, 243);
        System.out.println("m1.getCents() = "+m1.getCents());
        System.out.println("m2.getDollars() = "+m2.getDollars());
        System.out.println("m2 = "+m2);
        m2.add(m2);
        System.out.println("\nm2.add(m2) = "+m2.toString());
        System.out.println("m1.compareTo(m2) = "+m1.compareTo(m2));
        System.out.println("\nm11 = new Money(1,5)");
        System.out.println("m21 = new Money(1,5)");
        Money m11 = new Money(1,5);
        Money m21 = new Money(1, 5);
        System.out.println("m11.equals(m21) = "+m11.equals(m21));
    }
}