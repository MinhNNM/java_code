import java.util.Scanner;

public class J_tohop_2 {
    private int n, k, i, a[], dem=0;
    public void init(){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt(); k=sc.nextInt();
        a=new int[n+1];
        for (int j = 1; j <= k; j++) {
            a[j]=j;
        }
    }
    public void result(){
        for (int j = 1; j <= k; j++) {
            System.out.print(a[j]);
        }
        System.out.print(" ");
    }
    public void sinh_tohop(){
        i=k;
        while(i>0){
            dem++;
            result();
            i=k;
            while(i>0 && a[i]==n-k+i)
                i--;
            if(i>0)
            {
                a[i]++;
                for (int j = i+1; j <= k; j++) {
                    a[j]=a[j-1]+1;
                }
            }
        }
        System.out.println();
        System.out.println("Tong cong co " + dem + " to hop");
    }

    public static void main(String[] args) {
        J_tohop_2 tohop=new J_tohop_2();
        tohop.init();
        tohop.sinh_tohop();
    }
}
