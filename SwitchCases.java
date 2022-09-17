//switch cases

import java.util.Scanner;
public class SwitchCases {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter number 1 to 5 , case 6 is for department information");
        int employee = input.nextInt();



        switch(employee)
        {
            case 1:
                System.out.println("Devyani Arya");
                break;
            case 2:
                System.out.println("Manisha Kalota");
                break;
            case 3:
                System.out.println("Prafful Choudhary");
                break;
            case 4:
                System.out.println("Harsh Shrivastava");
                break;
            case 5:
                System.out.println("Akshita Bajpai");
                break;

            default:
                System.out.println("Enter employee id or department name for info");
        }
    }
}

