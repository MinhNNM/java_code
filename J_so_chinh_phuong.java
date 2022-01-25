import java.util.Scanner;

public class J_so_chinh_phuong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x=sc.nextInt();
            int y=(int)(Math.sqrt(x));
            if (y*y==x)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
