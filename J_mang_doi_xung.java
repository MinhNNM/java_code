import java.util.Scanner;

public class J_mang_doi_xung {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=1; k<=t; k++)
        {
            int n=sc.nextInt();
            int [] a=new int[105];
            for(int i=1; i<=n; i++)
                a[i]=sc.nextInt();
            int dem=0;
            for(int i=1; i<=n/2; i++)
            {
                if(a[i]==a[n-i+1])
                    dem++;
            }
            if(dem==n/2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
