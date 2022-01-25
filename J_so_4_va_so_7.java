import java.util.Scanner;

public class J_so_4_va_so_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int dem4=0, dem7=0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='4')
                dem4++;
            else if(s.charAt(i)=='7')
                dem7++;
        }
        if(dem4+dem7==4 || dem4+dem7==7)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
