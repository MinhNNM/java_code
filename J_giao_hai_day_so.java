import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class J_giao_hai_day_so {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt();
        List<Integer> a=new ArrayList<>(), b=new ArrayList<>(), giao=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x=sc.nextInt();
            a.add(x);
        }
        for (int i = 0; i < m; i++) {
            int y=sc.nextInt();
            b.add(y);
        }
        for (int i = 0; i < m; i++) {
            if(a.contains(b.get(i)) && !giao.contains(b.get(i)))
                giao.add(b.get(i));
        }
        Collections.sort(giao);
        for (int i = 0; i < giao.size(); i++) {
            System.out.print(giao.get(i)+" ");
        }
    }
}
