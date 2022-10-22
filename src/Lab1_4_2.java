import java.util.Scanner;
import java.text.MessageFormat;
public class Lab1_4_2 {
    public static void main(String[] args) {
        System.out.println("Введите цену одного грамма: ");
        Scanner in = new Scanner(System.in);
        int cost = in.nextInt();
        in.close();
        System.out.println("Вес, г        Стоимость, руб.");
        for (int i = 1; i <= 1000; i++) {
            System.out.println(MessageFormat.format("{0}        {1}.", i, i * cost ));
        }
    }
}
