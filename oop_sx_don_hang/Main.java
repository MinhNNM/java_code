package oop_sx_don_hang;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        List<Don_hang> res=new ArrayList<>();
        while (t-->0){
            sc.nextLine();
            Don_hang dh=new Don_hang(sc.nextLine(), sc.next(), sc.nextLong(), sc.nextInt());
            res.add(dh);
        }
        Collections.sort(res, Comparator.comparing(Don_hang::get_stt));
        for (Don_hang i:res)
            i.show();
    }
}
