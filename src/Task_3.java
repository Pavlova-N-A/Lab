import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        int N ;
        int M ;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите достоинство карты цифрой: ");
        N = in.nextInt();
        System.out.println("Введите масть карты цифрой: ");
        M = in.nextInt();
        switch (N){
            case 11:
                System.out.print("Валет");
                break;
            case 12:
                System.out.print("Дама");
                break;
            case 13:
                System.out.print("Король");
                break;
            case 14:
                System.out.print("Туз");
                break;
            case 6:
                System.out.print("Шесть");
                break;
            case 7:
                System.out.print("Семь");
                break;
            case 8:
                System.out.print("Восемь");
                break;
            case 9:
                System.out.print("Девять");
                break;
            case 10:
                System.out.print("Десять");
                break;
            default:
                System.out.print(" Карты такого достоинства не существует");
        }
        switch (M){
            case 1:
                System.out.print(" Пики");
                break;
            case 2:
                System.out.print(" Трефы");
                break;
            case 3:
                System.out.print(" Бубны");
                break;
            case 4:
                System.out.print(" Червы");
                break;
            default:
                System.out.print(" Неизвестная масть");
        }
    }
}
