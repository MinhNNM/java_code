import java.util.Scanner;

public class J_tong_giai_thua {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long sum=0, res=1;
        for (int i = 1; i <= n; i++) {
            res*=i;
            sum+=res;
        }
        System.out.println(sum);
    }
}
