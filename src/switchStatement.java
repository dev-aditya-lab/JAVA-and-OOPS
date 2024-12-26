public class switchStatement {
    public static void main(String[] args) {
        int age = 20;
        switch (age) {
            case 10:
                System.out.println("You are 10 years old");
                break;
            case 20:
                System.out.println("You are 20 years old");
                break;
            case 30:
                System.out.println("You are 30 years old");
                break;
            default:
                System.out.println("You are not 10, 20 or 30 years old");
        }
    }
}
