import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int temp;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение А: ");
        a = in.nextInt();
        System.out.println("Введите значение В: ");
        b = in.nextInt();
        System.out.println("Введите значение С: ");
        c = in.nextInt();
       temp = a;
       a = b;
       b = c;
       c = temp;
        System.out.println("Новое значение А: " + a);
        System.out.println("Новое значение В: " + b);
        System.out.println("Новое значение С: " + c);
    }
}
