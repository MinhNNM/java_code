import java.util.Scanner;

public class J_thu_gon_day_so {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n+2];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        while(true){
            int k=0;
            for (int i = 0; i < n-1; i++) {
                if(a[i]!=0){
                    for (int j = i+1; j < n; j++) {
                        if(a[j]!=0){
                            if((a[i]+a[j])%2==0){
                                k=1;
                                a[i]=0; a[j]=0;
                            }
                            break;
                        }
                    }
                }
            }
            if(k==0)
                break;
        }
        int dem=0;
        for (int i = 0; i < n; i++) {
            if(a[i]>0)
                dem++;
        }
        System.out.println(dem);
    }
}
