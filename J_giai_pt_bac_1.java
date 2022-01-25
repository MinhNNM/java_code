import java.util.Scanner;

public class J_giai_pt_bac_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        if(a==0 && b!=0)
            System.out.println("VN");
        else if(a==0 && b==0)
            System.out.println("VSN");
        else
            System.out.printf("%.2f", -b/a);
    }
}
