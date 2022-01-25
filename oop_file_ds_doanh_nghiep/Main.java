package oop_file_ds_doanh_nghiep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("src\\oop_file_ds_doanh_nghiep\\DN.txt");
        Scanner sc=new Scanner(file);
        ArrayList<Doanh_nghiep> res=new ArrayList<>();
        int t=sc.nextInt();
        while (t-->0){
            sc.nextLine();
            Doanh_nghiep dn=new Doanh_nghiep(sc.nextLine(), sc.nextLine(), sc.nextInt());
            res.add(dn);
        }
        Collections.sort(res, Comparator.comparing(Doanh_nghiep::getMa_dn));
        for (Doanh_nghiep i:res){
            System.out.println(i.toString());
        }
    }
}
