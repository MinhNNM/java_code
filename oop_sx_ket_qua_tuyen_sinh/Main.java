package oop_sx_ket_qua_tuyen_sinh;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        List<Hoc_sinh> res=new ArrayList<>();
        while (t-->0){
            sc.nextLine();
            Hoc_sinh hs=new Hoc_sinh(String.valueOf(sc.nextLine()), sc.nextLine(), Double.parseDouble(sc.nextLine()), sc.nextDouble(), sc.nextDouble());
            res.add(hs);
        }
        Collections.sort(res, Comparator.comparing(Hoc_sinh::getMa_hs));
        Collections.sort(res, new Comparator<Hoc_sinh>() {
            @Override
            public int compare(Hoc_sinh o1, Hoc_sinh o2) {
                if(o1.getDiem_xt()<=o2.getDiem_xt())
                    return 1;
                else
                    return -1;
            }
        });
        for (Hoc_sinh i:res)
            i.show();
    }
}
