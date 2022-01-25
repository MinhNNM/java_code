import java.util.Scanner;

public class J_sx_chen_lk_nguoc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[105], k=1, arr[][]=new int[105][105], t=0;
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int x=a[0];
        int tmp, j;
        for (int i = 1; i < n; i++) {
            tmp=a[i];
            j=i-1;
            while(j>=0 && a[j]>tmp)
            {
                a[j+1]=a[j];
                j--;
            }
            k++;
            a[j+1]=tmp;
            for (int l = 0; l < k; l++) {
                arr[t][l]=a[l];
            }
            t++;
        }
        for (int i = t-1; i >= 0; i--) {
            System.out.print("Buoc " + (i+1) + ": ");
            for (int l = 0; l < k; l++) {
                System.out.print(arr[i][l] + " ");
            }
            k--;
            System.out.println();
        }
        System.out.println("Buoc 0: " + x);
    }
}
