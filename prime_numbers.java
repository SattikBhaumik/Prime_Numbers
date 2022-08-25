import java.util.*;
public class prime_numbers 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number aka the limit of the prime series");
        long lim = sc.nextInt();
        long a[] = new long(lim);
        for(long i = 2; i <= lim; i++)
        {
            if(prime(i))
            {
                a = i;
                
            }
        }

    }

    boolean prime(long n)
    {
        long i, f=0;
        for(i=2; i <= n; i++)
        {
            if(n % i == 0)
            {
                f+=1;
            }
        }
        if(f==2)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    
}