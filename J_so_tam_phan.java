import java.util.Scanner;

public class J_so_tam_phan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            int check=0;
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i)>'2')
                    check=1;
            }
            if(check==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
