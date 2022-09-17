import java.util.Scanner;

public class EnhancedSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number 1 to 5 , case 6 is for department information");
        int employee = input.nextInt();


        switch (employee) {
            case 1 -> System.out.println("Devyani Arya");
            case 2 -> System.out.println("Manisha Kalota");
            case 3 -> System.out.println("Prafful Choudhary");
            case 4 -> System.out.println("Harsh Shrivastava");
            case 5 -> System.out.println("Akshita Bajpai");
            default -> System.out.println("Enter employee id or department name for info");
        }
    }
}


