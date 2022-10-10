import java.util.Scanner;

public class Lab3_1 {
    public static void main(String[] args) {
        double sum = 0;
        int N;
        int K;
        int L;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение N: ");
        N = in.nextInt();
        System.out.println("Введите значение K: ");
        K = in.nextInt();
        System.out.println("Введите значение L: ");
        L = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = ((int) (Math.random() * (30 + 1) - 15));//заполняем массив N рандомными числами в промежутке [-15, 15]
        }
        {
            System.out.print("Элементы массива: ");
            for (int i = 0; i <N; i++) {
                System.out.print(" " + arr[i] ); // Выводим на экран, полученный массив
            }
            for (int i = 0; i < K - 1; i++) {
                sum += arr[i];
            }
            for (int i = L; i < N; i++) {
                sum += arr[i];
            }
        } System.out.println(  "\nСреднее арифметическое: " + sum/(N-2));
    }
}