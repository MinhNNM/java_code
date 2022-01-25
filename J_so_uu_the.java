import java.util.Scanner;

public class J_so_uu_the {
    public static boolean check(String s){
        for(int i=0; i<s.length(); i++){
            if(s.charAt(0)=='0' || s.charAt(i)>'9')
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int chan=0, le=0;
            for(int i=0; i<s.length(); i++){
                if((int)s.charAt(i)%2==0)
                    chan+=1;
                else
                    le+=1;
            }
            if(check(s)){
                if(s.length()%2==0 && chan>le)
                    System.out.println("YES");
                else if(s.length()%2==1 && le>chan)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            else if(!check(s))
                System.out.println("INVALID");
        }
    }
}
