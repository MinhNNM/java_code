package oop_file_ds_sv_van_ban;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("src\\oop_file_ds_sv_van_ban\\SV.txt");
        Scanner sc=new Scanner(file);
        int t=sc.nextInt();
        for(int i=1; i<=t; i++){
            sc.nextLine();
            Sinh_vien sv=new Sinh_vien(i, sc.nextLine(), sc.next(), sc.next(), sc.nextFloat());
            System.out.println(sv.toString());
        }
    }
}
