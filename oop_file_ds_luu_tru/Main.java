package oop_file_ds_luu_tru;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("src\\oop_file_ds_luu_tru\\KHACH.txt"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Danh_sach> res=new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            res.add(new Danh_sach(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(res, new Comparator<Danh_sach>() {
            @Override
            public int compare(Danh_sach o1, Danh_sach o2) {
                if(o1.getSo_ngay_o()<o2.getSo_ngay_o())
                    return 1;
                return -1;
            }
        });
        for (Danh_sach i:res){
            System.out.println(i.toString());
        }
    }
}
