import java.util.Scanner;

public class J_sx_chon_lk_nguoc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[105], arr[][]=new int[105][105], k=0;
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            int min=i;
            for (int j = i+1; j < n; j++) {
                if(a[j]<a[min])
                    min=j;
            }
            int tmp=a[i];
            a[i]=a[min];
            a[min]=tmp;
            for (int j = 0; j < n; j++) {
                arr[k][j]=a[j];
            }
            k++;
        }
        for (int i = k-1; i >=0 ; i--) {
            System.out.print("Buoc " + (i+1) + ": ");
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
