package oops;

public class MethodOverLoading {
    public static void main(String[] args) {
        Greet wish = new Greet();
        wish.greeting();
        wish.greeting("Aditya");
    }
}

//Method overloading
class Greet {
     void greeting(){
         System.out.println("Hello, Good morning.");
     }

     void greeting(String name){
         System.out.println("Hello, "+name+ " Good Morning");
     }
}