import java.util.Scanner;

public class J_uoc_so_ngto_max {
    public static boolean ngto(long n){
        if(n<2)
            return false;
        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            long n=sc.nextLong();
            int x=0;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                while(n%i==0)
                {
                    n/=i;
                    x=i;
                }
            }
            if(ngto(n))
                System.out.println(n);
            else
                System.out.println(x);
            t--;
        }
    }
}
