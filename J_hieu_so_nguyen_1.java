import java.math.BigInteger;
import java.util.Scanner;

public class J_hieu_so_nguyen_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s1 = sc.next(), s2 = sc.next();
            BigInteger a = new BigInteger(s1), b = new BigInteger(s2);
            BigInteger res = a.subtract(b);
            String s = String.valueOf(res.abs());
            while (s.length() < Math.max(s1.length(), s2.length()))
                s = "0" + s;
            System.out.println(s);
        }
    }
}