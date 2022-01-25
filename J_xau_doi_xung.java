import java.util.Scanner;

public class J_xau_doi_xung {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            String s=sc.next();
            int dem=0, n=s.length();
            for (int i = 0; i < n/2; i++) {
                if (s.charAt(i) == s.charAt(n - i - 1))
                    dem += 1;
            }
            if(n/2-dem==1 || (dem==n/2 && n%2==1))
                System.out.println("YES");
            else
                System.out.println("NO");
            t--;
        }
    }
}
