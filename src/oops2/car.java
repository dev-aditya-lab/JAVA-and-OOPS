package oops2;

//now car class is a child class of vehicle class, it can access all the properties of vehicle class
public class car extends vehical{

    @Override
    void start() {
//        super.start();
        System.out.println("Car is starting");
    }

    int WheelsCount;





}


class Main{
    public static void main(String[] args) {
        car c = new car();
        c.start();
    }
}
