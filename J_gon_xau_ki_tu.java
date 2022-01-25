import java.util.Scanner;

public class J_gon_xau_ki_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int index = 0;
        while (index < s.length() - 1) {
            if (s.charAt(index) == s.charAt(index + 1)) {
                s = s.substring(0, index) + s.substring(index + 2);
                index = 0;
            } else
                index++;
        }
        if(s.length()==0)
            System.out.println("Empty String");
        else
            System.out.println(s);
    }
}
