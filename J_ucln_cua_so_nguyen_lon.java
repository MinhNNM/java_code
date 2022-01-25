import java.math.BigInteger;
import java.util.Scanner;

public class J_ucln_cua_so_nguyen_lon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next(), b=sc.next();
            BigInteger big1=new BigInteger(a), big2=new BigInteger(b);
            BigInteger res=big1.gcd(big2);
            System.out.println(res);
        }
    }
}
