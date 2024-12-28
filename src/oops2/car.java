package oops2;

//now car class is a child class of vehical class and it can access all the properties of vehical class
public class car extends vehical{
    public static void main(String[] args) {
       car myCarOBJ = new car();
       myCarOBJ.WheelsCount = 4;
       myCarOBJ.start();
    }
}
