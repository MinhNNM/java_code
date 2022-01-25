import java.util.Scanner;

public class J_sx_chen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[105], k=1;
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Buoc 0: " + a[0]);
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
            System.out.print("Buoc " + (k-1) + ": ");
            for (int l = 0; l < k; l++) {
                System.out.print(a[l] + " ");
            }
            System.out.println();
        }
    }
}
