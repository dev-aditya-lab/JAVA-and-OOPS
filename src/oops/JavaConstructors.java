package oops;

public class JavaConstructors {
    public static void main(String[] args) {
            Sum additionByDefultConstructor = new Sum();
            Sum additionByUserConstructor = new Sum(2 ,3);
            additionByDefultConstructor.add();
            additionByUserConstructor.add();
    }
}


class Sum{
    int a, b;

    public Sum(){
        // this default constructor is called when we create an object of the class
        // and we don't pass any arguments to the constructor
    }

    // Parameterized constructor
    public Sum(int frist, int second){
            a=frist;
            b= second;
    }

    void add(){
        System.out.println(a+b);
    }
}
