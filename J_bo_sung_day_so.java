import java.util.Scanner;

public class J_bo_sung_day_so {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[105];
        int n=sc.nextInt(), i=0;
        while (i<n){
            a[i]=sc.nextInt();
            i++;
        }
        int dem=0, dem1=0;
        for (int j = 0; j < a[0]-1; j++) {
            System.out.println(j+1);
            dem=1;
        }
        for (int j = 0; j < n-1; j++) {
            if (a[j + 1] - a[j] > 1) {
                for (int k = 0; k < a[j + 1] - a[j] - 1; k++) {
                    System.out.println(a[j] + k+1);
                }
                dem1 = 1;
            }
        }
        if (dem==0 && dem1==0)
            System.out.println("Excellent!");
    }
}
