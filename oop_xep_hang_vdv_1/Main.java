package oop_xep_hang_vdv_1;

import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        List<Van_dong_vien> res=new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            Van_dong_vien vdv=new Van_dong_vien(i, sc.nextLine(), sc.next(), sc.next(), sc.next());
            res.add(vdv);
        }
        int x=1;
        Collections.sort(res, Comparator.comparing(Van_dong_vien::getThanh_tich));
        res.get(0).setHang(x);
        for (int i = 1; i < t; i++) {
            if(res.get(i).getThanh_tich().equals(res.get(i-1).getThanh_tich())){
                res.get(i).setHang(x);
                x++;
            }
            else{
                x++;
                res.get(i).setHang(x);
            }
        }
        Collections.sort(res, Comparator.comparing(Van_dong_vien::getMa));
        for (Van_dong_vien i:res)
            i.show();
    }
}
