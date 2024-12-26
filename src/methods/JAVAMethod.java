package methods;

public class JAVAMethod {
    public static void main(String[] args) {
        int a =average(10, 20);
        System.out.println("Average:::: " + a);
    }

    static int average(int a, int b){
        int avg = (a + b) / 2;
        System.out.println("Average: " + avg);
        return avg;
    }
}
