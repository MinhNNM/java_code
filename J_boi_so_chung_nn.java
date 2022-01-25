import java.math.BigInteger;
import java.util.Scanner;

public class J_boi_so_chung_nn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s1=sc.next(), s2=sc.next();
            BigInteger a=new BigInteger(s1);
            BigInteger b=new BigInteger(s2);
            BigInteger tich=a.multiply(b);
            BigInteger res=tich.divide(a.gcd(b));
            System.out.println(res);
        }
    }
}
