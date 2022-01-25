import java.util.Scanner;

public class J_cat_doi {
    public static boolean check(String s){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!='0' && s.charAt(i)!='1' && s.charAt(i)!='8' && s.charAt(i)!='9')
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            if(check(s)){
                s=s.replace("8", "0");
                s=s.replace("0", "0");
                s=s.replace("9", "0");
                s=s.replace("1", "1");
                long x=Long.parseLong(s);
                if(x==0)
                    System.out.println("INVALID");
                else
                    System.out.println(x);
            }
            else
                System.out.println("INVALID");
        }
    }
}

