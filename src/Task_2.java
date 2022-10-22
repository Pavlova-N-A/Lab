import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        double x;
        double y;
        System.out.println("Введите x:");
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        System.out.println("Введите y:");
        y = in.nextDouble();
        if (x*x + y*y <= 25 || x*x + y*y >= 100) {
            System.out.println("Точка принадлежит заштрихованной области");
        }
        else {
            System.out.println("Точка не принадлежит заштрихованной области");
        }
        }
}


