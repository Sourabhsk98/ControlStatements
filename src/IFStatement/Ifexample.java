package IFStatement;

import java.util.Scanner;

public class Ifexample {
    public static void main(String[] args) {

        System.out.println("Enter the two numbers");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value for x: ");
        int x = scanner.nextInt();

        System.out.print("Enter the value for y: ");
        int y = scanner.nextInt();


        if(x+y > 20) {
            System.out.println("x + y is greater than 20");
        }
        scanner.close();
    }

}
