import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            Scanner sc = new Scanner(System.in);
            int ps = sc.nextInt();
            MultiplicationOperation multiplication = new SimpleMultiplication(ps);

            for (int i = 1; i <= 10; i++) {
                int result = multiplication.multiply(i);
                System.out.println(i + " * " + multiplication.getMultiplier() + " = " + result);
            }


        }

    }
}
