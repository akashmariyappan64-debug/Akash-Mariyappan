package org.example;

import java.util.Scanner;


//Java code to print the reverse of given number
public class Main {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the number :");

        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        int reverse = 0;
        while (num > 0) {
            int lastdigit = num % 10;
            reverse = reverse * 10 + lastdigit;
            num = num / 10;
        }

        System.out.println("Reverse of the given number: " + reverse);
    }
}

// Find smallest number among three
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 8;
        int c = 6;

        if (a < b && a < c) {
            System.out.println("Smallest number is " + a);
        } else if (b < a && b < c) {
            System.out.println("Smallest number is " + b);
        } else {
            System.out.println("Smallest number is " + c);
        }
    }
}

// Discount calculator
package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input purchase amount
        System.out.print("Enter the purchase amount: ");
        double purchaseAmount = scanner.nextDouble();

        double discount = 0.0;

        // Apply discount rules
        if (purchaseAmount < 500) {
            discount = 0.0;
        } else if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
            discount = 0.10 * purchaseAmount; // 10% discount
        } else if (purchaseAmount > 1000) {
            discount = 0.20 * purchaseAmount; // 20% discount
        }

        // Calculate final payable amount
        double finalAmount = purchaseAmount - discount;

        // Output results
        System.out.println("Purchase Amount: " + purchaseAmount);
        System.out.println("Discount Applied: " + discount);
        System.out.println("Final Payable Amount: " + finalAmount);

    }
}

//Number Pattern
public class Main {
    public static void main(String[] args) {
        int n = 5; // size of the pattern

        for (int i = 0; i < n; i++) {          // row loop
            for (int j = 0; j < n; j++) {      // column loop
                if (j < i) {
                    // print decreasing numbers until diagonal
                    System.out.print(n - j);
                } else {
                    // after diagonal, repeat (n - i)
                    System.out.print(n - i);
                }
            }
            System.out.println(); // move to next row
        }
    }
}
