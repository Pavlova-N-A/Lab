import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        int y_1 = 0; // φ нач
        int y_2 = 60; // φр
        int y_3 = 270; // φт
        int y_4 = 360;// φ кон
        double y_start = Math.toRadians(y_1);
        double y_p = Math.toRadians(y_2);
        double y_t = Math.toRadians(y_3);
        double y_end = Math.toRadians(y_4);
        double q;
        double y = 1.5;
        double x = 1.1;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение φ в радианах: ");
        q = Math.tan(y + x) + Math.sqrt(y);
        double y_0 = in.nextDouble();
        if (y_start <= y_0 && y_0 <= y_p) { //φ нач <=φ <=φр
            System.out.println("Значение углового ускорения при заданном φ: " + Math.cos(q));
        }
        else if (y_p <= y_0 && y_0 <= y_t) {//φр<=φ <=φт
            System.out.println("Значение углового ускорения при заданном φ: " + (y + q));
        }
        else if (y_t <= y_0 && y_0 <= y_end){//φт <=φ <=φ кон
            System.out.println("Значение углового ускорения при заданном φ: " + q * y_0);
        }
    }
}
