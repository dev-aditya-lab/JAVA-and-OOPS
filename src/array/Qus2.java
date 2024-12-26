package array;

public class Qus2 {
    public static void main(String[] args) {
//        find smallst no in the array
        int noArr[] = {2,1,8,6,2,2,5};
        int min = Integer.MAX_VALUE;
        for (int no: noArr){
            if(no<min){
                min = no;
            }
        }
                System.out.println(min);

    }
}
