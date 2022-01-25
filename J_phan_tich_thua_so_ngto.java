import java.util.Scanner;

public class J_phan_tich_thua_so_ngto{
    public static boolean ngto(int n)
    {
        if(n<2)
            return false;
        for(int i=2; i<=Math.sqrt(n); i++)
            if(n%i==0)
                return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1; i<=t; i++)
        {
            int n=sc.nextInt();
            System.out.print("Test " + i + ": ");
            for(int j=2; j<=Math.sqrt(n); j++)
            {
                int dem=0;
                while(n%j==0)
                {
                    n/=j;
                    dem++;
                }
                if(dem>0)
                {
                    System.out.print(j);
                    if(dem>0)
                        System.out.print("("+dem+")");
                    if(n>dem)
                        System.out.print(" ");
                }
            }
            if(ngto(n))
                System.out.print(n+"(1)");
            System.out.println();
        }
    }
}