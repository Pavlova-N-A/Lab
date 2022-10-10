import java.util.Scanner;

public class Lab2_3{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите N\n");
        int N = input.nextInt();
        boolean max=false, min = false;
        int minn,maxx;
        int iteration=1,minteration=0,maxteration=0;
        System.out.println("Введите число");
        int preprevnum = input.nextInt();
        System.out.println("Введите число");
        int prevnum = input.nextInt();
        int num = 0;
        if (prevnum > preprevnum)
        {
            minn = preprevnum;
            min = true;
            minteration = 1;
        }
        if (prevnum<preprevnum)
        {
            maxx = preprevnum;
            max = true;
            maxteration=1;
        }
        for (int i=2; i<N; i++)
        {
            iteration++;
            System.out.println("Введите число");
            num = input.nextInt();
            if (prevnum < num && prevnum <= preprevnum && min == false)
            {
                min=true;
                minn = prevnum;
                minteration = iteration;
            }
            if(prevnum >= num && prevnum > preprevnum  && max==false)
            {
                max=true;
                maxx=prevnum;
                maxteration=iteration;
            }
            preprevnum = prevnum;
            prevnum = num;
        }
        if (minteration==0)
        {
            minteration = N;
        }
        if (maxteration == 0)
        {
            maxteration = N;
        }
        System.out.println("Первый максимум находится на позиции под номером "+maxteration);
        System.out.println("Первый минимум находится на позиции под номером "+minteration);
    }
}
