package oop_file_ds_mon_hoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("src\\oop_file_ds_mon_hoc\\MONHOC.txt");
        Scanner sc=new Scanner(file);
        ArrayList<Mon_hoc> res=new ArrayList<>();
        int t=sc.nextInt();
        while(t-->0){
            sc.nextLine();
            Mon_hoc mh=new Mon_hoc(sc.nextLine(), sc.nextLine(), sc.nextInt());
            res.add(mh);
        }
        Collections.sort(res, Comparator.comparing(Mon_hoc::getName));
        for (Mon_hoc i:res){
            System.out.println(i.toString());
        }
    }
}
