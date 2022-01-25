package Tinh_tong;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static boolean isNumeric(String str){
        try {
            Integer.parseInt(str);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("src\\Tinh_tong\\DATA.txt");
        Scanner sc=new Scanner(file);
        long sum=0;
        while (sc.hasNext()){
            String s=sc.next();
            if(isNumeric(s)){
                sum+=Integer.parseInt(s);
            }
        }
        System.out.println(sum);
    }
}
