package array;

public class Arrays {
    public static void main(String[] args) {
        int age[]; // declaring an array
        age = new int[5]; // allocating memory to array
//        or
        int age1[] = new int[5]; // declaring and allocating memory to array
        age[0] = 12; // initializing array element
        age[1] = 4;

//        or
        int age2[] = {12, 4, 5, 2, 5}; // declaring and initializing array


        System.out.println(age2[0]); // accessing array element
    }

}
