package Tach_doi_tinh_tong;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("src\\Tach_doi_tinh_tong\\DATA.txt");
        Scanner sc=new Scanner(file);
        String s=sc.next();
        while(s.length()>1){
            BigInteger a, b;
            a=new BigInteger(s.substring(0, s.length()/2));
            b=new BigInteger(s.substring(s.length()/2, s.length()));
            BigInteger x=a.add(b);
            s=String.valueOf(x);
            System.out.println(x);
        }
    }
}
