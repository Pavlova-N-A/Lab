public class Lab1_5 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 26;
        while (num <= 88){
            sum = sum + num;
           num += 2;
        }
        System.out.println("Сумма всех чётных чисел от 26 до 88: " + sum);
    }
}
