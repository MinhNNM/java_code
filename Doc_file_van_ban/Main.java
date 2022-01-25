package Doc_file_van_ban;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("src\\Doc_file_van_ban\\DATA.txt");
        Scanner sc=new Scanner(file);
        while (sc.hasNext()){
            String s=sc.nextLine();
            System.out.println(s);
        }
    }
}
