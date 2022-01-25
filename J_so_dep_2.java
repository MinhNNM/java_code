import java.util.Scanner;

public class J_so_dep_2 {
    public static boolean check_tong(String s){
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            sum+=s.charAt(i)-48;
        }
        if(sum%10==0)
            return true;
        return false;
    }
    public static boolean check(String s){
        int n=s.length()-1;
        if(s.charAt(0)=='8' && s.charAt(n)=='8')
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int n=s.length();
            if(check_tong(s) && check(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
