import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class J_tap_tu_rieng_cua_2_xau {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            List<String> res=new ArrayList<>();
            String st[]=s1.split(" ");
            for(String i:st){
                if(!s2.contains(i) && !res.contains(i))
                    res.add(i);
            }
            Collections.sort(res);
            for (int i = 0; i < res.size(); i++) {
                System.out.print(res.get(i)+" ");
            }
            System.out.println();
        }
    }
}
