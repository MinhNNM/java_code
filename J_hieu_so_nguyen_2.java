import java.math.BigInteger;
import java.util.Scanner;

public class J_hieu_so_nguyen_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        BigInteger big1=new BigInteger(a);
        BigInteger big2=new BigInteger(b);
        BigInteger big3=big1.subtract(big2);
        System.out.println(big3);
    }
}
