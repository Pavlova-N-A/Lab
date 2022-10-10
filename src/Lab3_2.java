
import java.util.Random;
import java.util.Scanner;

import static sun.swing.MenuItemLayoutHelper.max;

public class Lab3_2 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("Введите N: ");
        int N = input.nextInt();
        System.out.print("Введите максимальное значение в массиве: ");
        int maxBound = input.nextInt();
        int[] array = new int[N];
        System.out.println("Сгенерированный массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(maxBound);
            System.out.print(array[i] + " ");
        }
        int max = max(array);

        for (int i = 2; i < array.length - 1; i++) {
            if(array[i - 1] > array[i] && array[i] < array[i + 1]){
                System.out.println("\nМаксимальный локальный минимум array[" + i + "] = " + max);
                break;
            }
        }
    }
}