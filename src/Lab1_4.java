import java.util.Scanner;

public class Lab1_4 {
    public static void main(String[] args) {
        double n;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение n: ");
        n = in.nextDouble();

        for (double i = (1+n)/2; i <= 0.001; i++) {
            System.out.println(Math.sin(i*i) * Math.cos(i*n));
        }
    }
}
