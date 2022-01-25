import java.util.Scanner;

public class J_so_ngto {
    public static boolean ngto(int n)
    {
        if(n<2)
            return false;
        for(int i=2; i<=Math.sqrt(n); i++)
            if(n%i==0)
                return false;
            return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1; i<=t; i++)
        {
            int n=sc.nextInt();
            if(ngto(n))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
