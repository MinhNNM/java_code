import java.util.Scanner;

public class J_sx_truc_tiep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] a=new int[105];
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int k=1;
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
                System.out.printf("Buoc %d: ", k++);
                for (int j = 0; j < n; j++) {
                    System.out.print(a[j]+" ");
                }
            }
            System.out.println();
        }
    }
}
