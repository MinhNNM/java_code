package oop_khai_bao_lop_thisinh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        thi_sinh thisinh=new thi_sinh();
        thisinh.nhap(sc);
        thisinh.show();
    }
}
