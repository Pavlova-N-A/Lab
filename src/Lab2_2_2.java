import java.util.Scanner;

public class Lab2_2_2 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("N: ");
        n = in.nextInt();
        int f1 = 1;
        int f2 = 2;
        int f = 0;
        while (f < n){
            f = f1 + f2;
            f2 = f1;
            f1 = f;
        }
        if (f==n){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
