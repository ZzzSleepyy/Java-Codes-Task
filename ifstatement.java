public class ifstatements {
    public static void main(String args[]) {
        int x = 0;
        if (x == 10) {
            System.out.println("Hi " + x);
        }
        else {
            System.out.println("The value does not match.");
        
        }
    }    
}

//UPGRADE VERSION

import java.util.Scanner;


public class ifstatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String userName = scanner.nextLine();

        System.out.print("Enter age: ");
        int age;

        try {
            age = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            age = -1;
        }

        scanner.close();

        if (age > 17) {
            System.out.println("Name: " + userName);
            System.out.println("Age: " + age);
        } else if (age == -1) {
            System.out.println("String is not allowed.");
        } else {
            System.out.println("18 below is not allowed.");
        }
    }
}
