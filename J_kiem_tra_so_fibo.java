import java.util.Scanner;

public class J_kiem_tra_so_fibo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            long n, f=1, f1=0, f2=1;
            n=sc.nextLong();
            if(n==0 || n==1)
                System.out.println("YES");
            else{
                while(f<n)
                {
                    f=f1+f2;
                    f1=f2;
                    f2=f;
                }
                if(f==n)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            t--;
        }
    }
}
