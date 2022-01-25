import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class J_hop_hai_day_so {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt();
        List<Integer> a=new ArrayList<>(), b=new ArrayList<>(), hop=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x=sc.nextInt();
            a.add(x);
            if(!hop.contains(x))
                hop.add(x);
        }
        for (int i = 0; i < m; i++) {
            int y=sc.nextInt();
            b.add(y);
            if(!hop.contains(y)){
                hop.add(y);
            }
        }
        Collections.sort(hop);
        for (int i = 0; i < hop.size(); i++) {
            System.out.print(hop.get(i)+" ");
        }
    }
}
