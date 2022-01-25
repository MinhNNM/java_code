import java.util.Scanner;

public class J_sx_truc_tiep_lk_nguoc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a[]=new int[105], arr[][]=new int[105][105], k=0;
            int n=sc.nextInt();
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            for(int i=0; i<n-1; i++)
            {
                int dem=0;
                for (int j = i+1; j < n; j++) {
                    if(a[i]>a[j])
                    {
                        int tmp=a[i];
                        a[i]=a[j];
                        a[j]=tmp;
                        dem++;
                    }
                }
                if(dem>0)
                {
                    k++;
                    for (int j = 0; j < n; j++) {
                        arr[k][j] = a[j];
                    }
                }
            }
            for (int i = k; i > 0; i--) {
                System.out.print("Buoc " + i + ": ");
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
