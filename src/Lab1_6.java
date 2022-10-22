public class Lab1_6 {
    public static void main(String[] args) {
        double S;
        double sum = 0;
        int i = 1000;
        do {
            S = (double) 1/i;
            sum += S;
                i--;
            }
            while (i > 0) ;
            System.out.println("Искомая сумма: " + sum);
        }
    }

