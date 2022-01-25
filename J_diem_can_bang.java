import java.util.Scanner;

public class J_diem_can_bang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt(), dem=0, sum=0, s1=0;
            int a[]=new int[100005];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
                sum+=a[i];
            }
            for (int i = 0; i < n; i++) {
                sum-=a[i];
                if(sum==s1){
                    dem=1;
                    System.out.println(i+1);
                    break;
                }
                s1+=a[i];
            }
            if(dem==0)
                System.out.println("-1");
            t--;
        }
    }
}
