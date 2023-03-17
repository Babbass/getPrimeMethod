import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Prime  {
    public static void main(String arg[])
    {
        System.out.println("Enter a number ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int maxNumber=500;
        isPrime(n);
generatePrime500();
    }
    static void isPrime(int num)
    {
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if(count==2)
            System.out.println("True ");
        else
            System.out.println("False ");
    }
    public static void generatePrime500(){
        for(int i=2; i<=500; i++) {
            boolean isPrime = true;
            for(int j=2; j<i; j++) {
                if(i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.print(i + " ");
    }

    }

    }
}

