import java.util.Scanner;

public class J_xau_nhi_phan {
    public static long f[]=new long[95], k;
    public static int n;
    public static void xau(){
        while(n>2){
            if(k<=f[n-2])
                n-=2;
            else{
                k-=f[n-2];
                n-=1;
            }
        }
        if(n==1)
            System.out.println(0);
        else
            System.out.println(1);
    }
    public static void main(String[] args) {
        f[1]=f[2]=1;
        for (int i = 3; i <= 93 ; i++) {
            f[i]=f[i-2]+f[i-1];
        }
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            n=sc.nextInt();
            k=sc.nextLong();
            xau();
        }
    }
}
