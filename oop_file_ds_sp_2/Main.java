package oop_file_ds_sp_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("src\\oop_file_ds_sp_2\\SANPHAM.txt"));
        int t=sc.nextInt();
        ArrayList<Danh_sach> res=new ArrayList<>();
        while (t-->0){
            sc.nextLine();
            res.add(new Danh_sach(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(res, Comparator.comparing(Danh_sach::getMa));
        Collections.sort(res, new Comparator<Danh_sach>() {
            @Override
            public int compare(Danh_sach o1, Danh_sach o2) {
                if(o1.getGia_ban()<=o2.getGia_ban())
                    return 1;
                return -1;
            }
        });
        for (Danh_sach i:res){
            System.out.println(i.toString());
        }
    }
}
