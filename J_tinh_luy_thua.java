import java.util.Scanner;

public class J_tinh_luy_thua {
    public static long luy_thua(long a, long b){
        int mod=1000000007;
        if(b==0)
            return 1;
        else if(b==1)
            return a%mod;
        long x=luy_thua(a, b/2);
        if(b%2==0)
            return x*x%mod;
        return a*(x*x%mod)%mod;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            long a=sc.nextLong(), b=sc.nextLong();
            if(a==b && b==0)
                break;
            else{
                System.out.println(luy_thua(a, b));
            }
        }
    }
}
