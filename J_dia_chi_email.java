import java.util.Scanner;

public class J_dia_chi_email {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String a[]=new String[t+2];
        sc.nextLine();
        for(int k=1; k<=t; k++){
            int dem=0;
            String s=sc.nextLine(), st="";
            int vt=0;
            s=s.trim().replaceAll("\\s+", " ");
            s=s.toLowerCase();
            for (int i = s.length()-1; i >=0 ; i--) {
                if(s.charAt(i)==' ')
                {
                    vt=i;
                    break;
                }
                else
                    vt=0;
            }
            for (int i = vt+1; i < s.length(); i++) {
                st+=s.charAt(i);
            }
            st+=s.charAt(0);
            for (int i = 0; i < vt; i++) {
                if(s.charAt(i)==' ')
                    st+=s.charAt(i+1);
            }
            a[k]=st;
            for (int j = 1; j < k; j++) {
                if(a[k].equals(a[j]))
                    dem++;
            }
            if(dem>=1)
                st+=String.valueOf(dem+1);
            st+="@ptit.edu.vn";
            System.out.println(st);
        }
    }
}
