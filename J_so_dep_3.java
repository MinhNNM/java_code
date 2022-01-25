import java.util.Scanner;

public class J_so_dep_3 {
    public static boolean ngto(int n)
    {
        if(n<2)
            return false;
        for(int i=2; i<=Math.sqrt(n); i++)
            if(n%i==0)
                return false;
        return true;
    }
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
        int dem=0;
        for (int i = 0; i < s.length(); i++) {
            if(ngto(s.charAt(i)-48))
                dem+=1;
        }
        if(dem==s.length())
            return true;
        return false;
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

