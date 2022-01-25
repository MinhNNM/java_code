package oop_file_ds_sv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("src\\oop_file_ds_sv\\DATA.txt");
        Scanner sc=new Scanner(file);
        ArrayList<Sinh_vien> res=new ArrayList<>();
        int t=sc.nextInt();
        while(t-->0){
            sc.nextLine();
            Sinh_vien sv=new Sinh_vien(sc.nextLine(), sc.nextLine(), sc.next(), sc.next());
            res.add(sv);
        }
        Collections.sort(res, Comparator.comparing(Sinh_vien::getMa));
        for (Sinh_vien i:res){
            System.out.println(i.toString());
        }
    }
}
