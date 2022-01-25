import java.util.Scanner;

public class J_dao_tu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while (t-->0){
            String s=sc.nextLine(), s1="";
            String st[]=s.split(" ");
            for (int i = 0; i < st.length; i++) {
                for (int j = st[i].length()-1; j >=0 ; j--) {
                    s1+=st[i].charAt(j);
                }
                s1+=" ";
            }
            System.out.println(s1);
        }
    }
}
