import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        System.out.println("hey, this is aditya");
        System.out.println("Enter your age: ");
        Scanner Sc = new Scanner(System.in);
        int age = Sc.nextInt();
        System.out.println("Your age is: " + age);
        Sc.close();
    }
}