import java.util.Scanner;

public class J_sx_chon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[105], k=0;
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
            k++;
            int tmp=a[i];
            a[i]=a[min];
            a[min]=tmp;
            System.out.print("Buoc " + k + ": ");
            for (int j = 0; j < n; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}
