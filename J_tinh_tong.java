import java.util.Scanner;

public class J_tinh_tong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            long n=sc.nextLong();
            long s=(long)(n*n+n)/2;
            System.out.println(s);
        }
    }
}