//Дано вещественное число X (|X| < 1) и целое число N (> 0). Найти
import java.util.Scanner;

public class Lab2_1 {
    public static void main(String[] args) {
        int N;
        double X;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение N: ");
        N = in.nextInt();
        System.out.println("Введите значение Х: ");
        X = in.nextDouble();

        float temp1 = 1, temp2 = 1, rez = 1, pow = 1;
        int i;
        for (i = 1; i < N; ++i) {
            temp1 *= 2 * i - 3;
            temp2 *= 2 * i;
            pow *= (-1) * X;
            rez += temp1 * pow / temp2;
        }
        System.out.println("Значение выражения: " + rez);
    }
}
