import java.util.Scanner;

public class J_tim_so_du {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x;
            String s=sc.next();
            if(s.length()==1)
                x=Integer.parseInt(s.substring(s.length()-1));
            else
                x=Integer.parseInt(s.substring(s.length()-2));
            if(x%4!=0)
                System.out.println(0);
            else
                System.out.println(4);
        }
    }
}
