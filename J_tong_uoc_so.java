import java.util.Scanner;

public class J_tong_uoc_so{
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
        long s=0;
        while(t>0)
        {
            long n=sc.nextLong();
            for (int i = 2; i <= Math.sqrt(n); i++) {
                while(n%i==0)
                {
                    n/=i;
                    s+=i;
                }
            }
            if(ngto(n))
                s+=n;
            t--;
        }
        System.out.println(s);
    }
}
