package So_khac_nhau_trong_file2_nhi_phan;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream is=new FileInputStream("DATA.IN");
        DataInputStream dis=new DataInputStream(is);
        int a[]=new int[1005];
        for(int i=0; i<100000; i++){
            a[dis.readInt()]++;
        }
        for(int i=0; i<1000; i++){
            if(a[i]>0)
                System.out.println(i+" "+a[i]);
        }
    }
}
