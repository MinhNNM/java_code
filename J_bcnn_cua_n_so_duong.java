import java.util.Scanner;

public class J_bcnn_cua_n_so_duong {
    public static long gcd(long a, long b){
        long res=a*b;
        while(b!=0){
            long tmp=a%b;
            a=b;
            b=tmp;
        }
        return res/a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long k=1;
            for (long i = 1; i <= n; i++) {
                k=gcd(k,i);
            }
            System.out.println(k);
        }
    }
}
