import java.util.Scanner;

public class J_bnnn_ucnn {
    public static long gcd(long a, long b) {
        long tmp;
        while(b!=0)
        {
            tmp=a%b;
            a=b;
            b=tmp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=a*b;
            System.out.println(c/gcd(a, b) + " " + gcd(a, b));
            t--;
        }
    }
}
