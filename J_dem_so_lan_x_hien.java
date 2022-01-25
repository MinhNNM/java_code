import java.util.Scanner;

public class J_dem_so_lan_x_hien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(), k=1;
        while(t>0)
        {
            int n=sc.nextInt();
            int [] a=new int[105];
            int [] dem=new int[100005];
            for (int i = 0; i <n ; i++) {
                a[i]=sc.nextInt();
                dem[a[i]]++;
            }
            System.out.println("Test " + k + ":");
            for (int i = 0; i < n; i++) {
                if(dem[a[i]]>0)
                    System.out.println(a[i] + " xuat hien " + dem[a[i]] + " lan");
                dem[a[i]]=0;
            }
            k++; t--;
        }
    }
}
