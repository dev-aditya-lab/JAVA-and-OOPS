// Write a Java program to print the multiplication table of a number.

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a Number: ");
        int no =  sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(no+"*"+i+" = "+ no*i);
        }
    }
}
