import java.util.Scanner;

public class J_tinh_fibonacci {
    public static long fibo(int n) {
        long f1=0, f2=1, f=1;
        if(n==1)
            return 1;
        for (int i = 2; i <=n ; i++) {
            f=f1+f2;
            f1=f2;
            f2=f;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            System.out.println(fibo(n));
            t--;
        }
    }
}
