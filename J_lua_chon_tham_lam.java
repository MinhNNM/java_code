import java.util.Scanner;

public class J_lua_chon_tham_lam {
    public static int a[]=new int[105], b[]=new int[105];
    public static void min(int n, int s){
        if(s==0){
            if(n==1)
                System.out.print("0");
            else
                System.out.print("-1");
        }
        else if(s>9*(n-1)){
            a[1]=s-9*(n-1);
            for (int i = 2; i <= n; i++) {
                a[i]=9;
            }
            for (int i = 1; i <= n; i++) {
                System.out.print(a[i]);
            }
        }
        else if(s<=9*(n-1)){
            a[1]=1;
            s-=1;
            int i=n;
            while(s>=9){
                a[i]=9; s-=9; i--;
            }
            a[i]=s;
            for (int k = 1; k <= n; k++) {
                System.out.print(a[k]);
            }
        }
    }
    public static void max(int n, int s){
        if(s==0){
            if(n==1)
                System.out.print("0");
            else
                System.out.print("-1");
        }
        else if(s<9)
        {
            b[1]=s;
            for (int i = 1; i <= n; i++) {
                System.out.print(a[i]);
            }
        }
        else if(s>=9){
            b[1]=9;
            s-=9;
            int i=2;
            while(s>=9){
                b[i]=9;s-=9;i++;
            }
            b[i]=s;
            for (int j = 1; j <= n; j++) {
                System.out.print(b[j]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), s=sc.nextInt();
        int a[]=new int[105];
        if(s>9*n)
            System.out.print("-1 -1");
        else{
            for (int i = 1; i <= n; i++) {
                a[i]=0; b[i]=0;
            }
            min(n, s);
            System.out.print(" ");
            max(n, s);
        }
    }
}
