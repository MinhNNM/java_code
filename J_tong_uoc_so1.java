import java.util.Scanner;

public class J_tong_uoc_so1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long Tong_uoc[]=new long[2000001];
        for (int i = 2; i <= 2000000; i++) {
            if(Tong_uoc[i]!=0)
                continue;
            for (int j = i; j <= 2000000; j+=i) {
                int tmp=j;
                while(tmp%i==0){
                    Tong_uoc[j]+=i;
                    tmp/=i;
                }
            }
        }
        long sum=0;
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            sum+=Tong_uoc[n];
        }
        System.out.println(sum);
    }
}
