import java.math.BigInteger;
import java.util.Scanner;

public class J_tong_so_nguyen_lon_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        BigInteger big1 = new BigInteger(a);
        BigInteger big2 = new BigInteger(b);
        System.out.println(big2.add(big1));
    }
}
