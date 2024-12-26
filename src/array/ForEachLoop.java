package array;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] names = {"John", "Doe", "Jane", "Doe"};

//        accessing array elements using for each loop
        for(int i =0; i<names.length; i++){
            System.out.println(names[i]);
        }

//        accessing array elements using for each loop
        for(String name: names){
            System.out.println(name);
        }
    }
}
