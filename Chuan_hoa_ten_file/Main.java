package Chuan_hoa_ten_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("src\\Chuan_hoa_ten_file\\DATA.txt");
        Scanner sc=new Scanner(file);
        while(true){
            String s=sc.nextLine();
            if(s.equalsIgnoreCase("END"))
                break;
            else{
                String s1="";
                s=s.trim().toLowerCase();
                s=s.replaceAll("\\s+", " ");
                String st[]=s.split(" ");
                for(int i=0; i<st.length; i++){
                    s1+=String.valueOf(st[i].charAt(0)).toUpperCase() + st[i].substring(1);
                    if(i<st.length-1)
                        s1+=" ";
                }
                System.out.println(s1);
            }
        }
    }
}
