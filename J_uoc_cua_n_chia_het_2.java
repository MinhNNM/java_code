import java.util.Scanner;

public class J_uoc_cua_n_chia_het_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            if(n%2!=0)
                System.out.println(0);
            else
            {
                int dem=0;
                for(int i=1; i<Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        if(i%2==0)
                            dem++;
                        if((n/i)%2==0)
                            dem++;
                    }
                }
                if((int)Math.sqrt(n)*(int)Math.sqrt(n)==n && (int)Math.sqrt(n)%2==0)
                {
                    dem++;
                }
                System.out.println(dem);
            }
            t--;
        }
    }
}
