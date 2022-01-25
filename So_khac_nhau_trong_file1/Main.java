package So_khac_nhau_trong_file1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("src\\So_kha_nhau_trong_file1\\DATA.txt");
        Scanner sc=new Scanner(file);
        int a[]=new int[100005];
        while(sc.hasNext()){
            a[sc.nextInt()]++;
        }
        for(int i=0; i<1000; i++){
            if(a[i]>0)
                System.out.println(i+" "+a[i]);
        }
    }
}
