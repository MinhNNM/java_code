import java.util.Scanner;

public class J_so_dep_1 {
    public static boolean check(String s){
        int dem=0, n=s.length();
        for (int i = 0; i < n/2; i++) {
            if (s.charAt(i) == s.charAt(n - i - 1))
                dem += 1;
        }
        if(dem==n/2)
            return true;
        return false;
    }
    public static boolean chan(String s){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)%2!=0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            if(check(s) && chan(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
