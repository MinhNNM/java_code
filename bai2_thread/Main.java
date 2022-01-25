package bai2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Main{
    public static boolean check(String s){
        int dem=0, n=s.length();
        for (int i = 0; i < n/2; i++) {
            if (s.charAt(i) == s.charAt(n - i - 1))
                dem += 1;
        }
        if(dem==n/2)
            return true;
        return false;
    }
    public static boolean chan(String s){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)%2!=0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("src/bai2/in.txt");
        Scanner sc=new Scanner(file);
        String out="";
        while(sc.hasNext()){
            String s=sc.next();
            if(check(s) && chan(s)) {
                System.out.println("dep");
                out+="dep";
            }
            else {
                System.out.println("khong dep");
                out+="khong dep";
            }
            out+="\n";
        }
        try {
            FileWriter writer=new FileWriter("src/bai2/out.txt");
            writer.write(out);
            writer.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
