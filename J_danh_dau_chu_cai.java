import java.util.Scanner;

public class J_danh_dau_chu_cai {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next(), st="";
        int a[]=new int[30];
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if(a[s.charAt(i)-'a']>=1) {
                st+=s.charAt(i);
                a[s.charAt(i)-'a']=0;
            }
        }
        System.out.println(st.length());
    }
}
