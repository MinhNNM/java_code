package oop_khai_bao_lop_hcn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Rectange hcn=new Rectange(sc.nextDouble(), sc.nextDouble(), sc.next());
        if(hcn.getHeight()<=0 || hcn.getWidth()<=0)
            System.out.println("INVALID");
        else
            hcn.show();
    }
}
