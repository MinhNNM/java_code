import java.util.Scanner;

public class J_so_khong_lien_ke {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            int sum=Integer.parseInt(String.valueOf(s.charAt(0))), check=0;
            for(int i=1; i<s.length(); i++) {
                if(Math.abs(String.valueOf(s.charAt(i)).compareTo(String.valueOf(s.charAt(i-1))))!=2)
                    check=1;
                sum += Integer.parseInt(String.valueOf(s.charAt(i)));
            }
            if(sum%10==0 && check==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
