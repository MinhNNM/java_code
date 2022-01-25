import java.util.Scanner;

public class J_sx_noi_bot_lk_nguoc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[105], arr[][]=new int[105][105], k=0;
            for (int i = 0; i < n; i++) {
                a[i]= sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                int dem=0;
                for (int j = 0; j < n-i-1; j++) {
                    if(a[j]>a[j+1])
                    {
                        int tmp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=tmp;
                        dem++;
                    }
                }
                if(dem>0)
                {
                    for (int j = 0; j < n; j++) {
                        arr[k][j]=a[j];
                    }
                    k++;
                }
            }
            for (int i = k-1; i >= 0; i--) {
                System.out.print("Buoc " + (i+1) + ": ");
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
