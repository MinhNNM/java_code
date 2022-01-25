import java.util.Scanner;

public class J_xu_ly_van_ban {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            s=s.replaceAll("\\s+", " ").trim().toLowerCase();
            String st[]=s.split("[.\\?\\!]");
            for (int i=0; i<st.length; i++) {
                st[i] = String.valueOf(st[i]).trim();
                st[i] = String.valueOf(st[i].charAt(0)).toUpperCase() + st[i].substring(1);
            }
            for (String i:st)
                System.out.println(i);
        }
    }
}
