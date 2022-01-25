import java.util.Scanner;

public class J_tong_so_nguyen_lon_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            String s1=sc.next(), s2=sc.next(), tp, s="";
            int tmp, x=0;
            if(s1.length()<s2.length())
            {
                tp=s1;
                s1=s2;
                s2=tp;
            }
            while(s2.length()<s1.length())
                s2="0"+s2;
            for (int i = s1.length()-1; i >=0 ; i--) {
                tmp=s1.charAt(i)+s2.charAt(i)-96+x;
                if(tmp>9)
                {
                    tmp-=10;
                    x=1;
                }
                else
                    x=0;
                s=(char)(tmp+48)+s;
            }
            if(x!=0)
                s="1"+s;
            System.out.println(s);
            t--;
        }
    }
}
