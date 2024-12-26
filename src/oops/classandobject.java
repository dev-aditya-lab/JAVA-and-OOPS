package oops;

public class classandobject {
    public static void main(String[] args) {
        dog myDog = new dog();
        myDog.name = "Tommy";
        myDog.bark();

        dog herDog = new dog();
        herDog.name = "Jojo";
        herDog.walk();
    }
}


class dog{
    String name;
    int age;
    String colour;

    void walk (){
        System.out.println(name + " is Walking..");
    }

    void bark (){
        System.out.println(name + " is barking..");
    }
}
