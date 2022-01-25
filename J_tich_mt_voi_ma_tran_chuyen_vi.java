import java.util.Scanner;

public class J_tich_mt_voi_ma_tran_chuyen_vi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=1; l<=t; l++){
            int n=sc.nextInt(), m=sc.nextInt();
            int a[][]=new int[n+5][m+5];
            int b[][]=new int[n+5][m+5];
            int c[][]=new int[n+5][m+5];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j]=sc.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    b[j][i]=a[i][j];
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < m; k++) {
                        c[i][j]+=a[i][k]*b[k][j];
                    }
                }
            }
            System.out.println("Test " + l + ":");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
