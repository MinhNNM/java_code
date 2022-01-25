import java.util.Scanner;

public class J_xau_day_du {
    public static boolean check(String s, int k){
        if(s.length()<26)
            return false;
        int a[]=new int[26];
        for (int i = 0; i < s.length(); i++) {
            int x=s.charAt(i);
            a[x-97]=1;
        }
        int dem=0;
        for (int i = 0; i < 26; i++) {
            if(a[i]==0)
                dem++;
        }
        if(dem<=k)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            int k=sc.nextInt();
            if(check(s, k))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
