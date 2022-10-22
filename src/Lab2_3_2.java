import java.util.Scanner;

public class Lab2_3_2 {
    public static void main(String[] args) throws Exception{
        System.out.print("Введите число N:");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        if(N < 0) throw new Exception();

        int i = 0;
        int minMax = 0;
        int consoleInputNumber = 0;

        while(i < N){
            i++;
            System.out.print(String.format("Введите число %d:", i));
            consoleInputNumber = in.nextInt();

            if(Math.abs(consoleInputNumber) > Math.abs(minMax)) minMax = consoleInputNumber;
        }

        System.out.println("Экстремальное число: " + minMax + " index " + i);
    }
    }


