import java.math.BigInteger;
import java.util.Scanner;

public class J_chia_het {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            String s1 = sc.next(), s2 = sc.next();
            BigInteger n = new BigInteger(s1);
            BigInteger m = new BigInteger(s2);
            if (n.mod(m)== BigInteger.valueOf(0) ||  m.mod(n)==BigInteger.valueOf(0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
