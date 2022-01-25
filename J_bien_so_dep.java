import java.util.Scanner;

public class J_bien_so_dep {
    public static boolean check(String s){
        int dem1=0, dem2=0, dem3=0, dem4=0, dem5=0;
        for (int i = 0; i < s.length()-1; i++) {
            if(String.valueOf(s.charAt(i+1)).compareTo(String.valueOf(s.charAt(i)))>0)
                dem1+=1;
            if (s.charAt(i)==s.charAt(i+1))
                dem2+=1;
        }
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)=='6' || s.charAt(i)=='8')
                dem3++;
        }
        for (int i = 0; i < 2; i++) {
            if (s.charAt(i)==s.charAt(i+1))
                dem4++;
        }
        if (dem1==4 || dem2==4 || dem3==5 || (dem4==2 && s.charAt(3)==s.charAt(4)))
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s= sc.next(), st="";
            for (int i=5; i<s.length(); i++){
                if (s.charAt(i)>='0' && s.charAt(i)<='9')
                    st+=s.charAt(i);
            }
            if (check(st))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
