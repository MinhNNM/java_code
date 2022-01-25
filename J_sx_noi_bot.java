import java.util.Scanner;

public class J_sx_noi_bot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[105], k=0;
        int n=sc.nextInt();
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
                k++;
                System.out.print("Buoc " + k + ": ");
                for (int j = 0; j < n; j++) {
                    System.out.print(a[j] + " ");
                }
                System.out.println();
            }
        }
    }
}
