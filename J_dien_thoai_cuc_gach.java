import java.util.Scanner;

public class J_dien_thoai_cuc_gach {
    public static boolean check(String s){
        int n=s.length(), dem=0;
        for (int i = 0; i < n/2; i++) {
            if(s.charAt(i)==s.charAt(n-i-1))
                dem++;
        }
        if(dem==n/2)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            s=s.replaceAll("A|B|C|a|b|c","2");
            s=s.replaceAll("D|E|F|d|e|f","3");
            s=s.replaceAll("G|H|I|g|h|i","4");
            s=s.replaceAll("J|K|L|j|k|l","5");
            s=s.replaceAll("M|N|O|m|n|o","6");
            s=s.replaceAll("P|Q|R|S|p|q|r|s","7");
            s=s.replaceAll("T|U|V|t|u|v","8");
            s=s.replaceAll("W|X|Y|Z|w|x|y|z","9");
            if(check(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
