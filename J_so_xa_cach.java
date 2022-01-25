import java.util.Scanner;

public class J_so_xa_cach {
    public static int a[]=new int[25], i, n;
    public static boolean check(){
        for (int i = 1; i < n; i++) {
            if(Math.abs(a[i]-a[i+1])==1)
                return false;
        }
        return true;
    }
    public static void out(){
        for (int i = 1; i <= n; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }
    public static void sinh_hv(){
        i=n-1;
        while(i>0){
            if(check())
                out();
            i=n-1;
            while (i>0 && a[i]>a[i+1])
                i--;
            if(i>0){
                int k=n;
                while (a[k]<a[i])
                    k--;
                int tmp=a[k];
                a[k]=a[i];
                a[i]=tmp;
                k=n;
                for (int j = i+1; j < k; j++, k--) {
                    tmp=a[j];
                    a[j]=a[k];
                    a[k]=tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            n = sc.nextInt();
            for (int i = 0; i <= n; i++) {
                a[i] = i;
            }
            sinh_hv();
        }
    }
}
