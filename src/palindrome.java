// Write a Java program to check if a given number is a palindrome

//! doute----------------------------------------------------------------------------------


import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, reverse = 0, temp;
        System.out.println("Enter a number: ");
        num = scan.nextInt();
        temp = num;
        while (temp != 0) {
            reverse = reverse * 10;
            reverse = reverse + temp % 10;
            temp = temp / 10;
        }
        if (num == reverse) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }
    }
}
