import java.util.Scanner;

public class J_chia_het_cho11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String n=sc.next();
            long s1=0, s2=0;
            for (int i = 0; i < n.length(); i++) {
                if(i%2==0)
                    s1+=n.charAt(i)-'0';
                else
                    s2+=n.charAt(i)-'0';
            }
            if(Math.abs(s1-s2)%11==0)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
