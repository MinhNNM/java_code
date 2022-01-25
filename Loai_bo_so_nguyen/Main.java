package Loai_bo_so_nguyen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
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
        File file=new File("DATA.in");
        Scanner sc=new Scanner(file);
        ArrayList<String> res=new ArrayList<>();
        while (sc.hasNext()) {
            String s = sc.next();
            if (!isNumeric(s)) {
                res.add(s);
            }
        }
        Collections.sort(res);
        for(String i:res)
            System.out.print(i+" ");
    }
}
