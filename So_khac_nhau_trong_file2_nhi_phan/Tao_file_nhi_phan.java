package So_khac_nhau_trong_file2_nhi_phan;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Tao_file_nhi_phan {
    public static void main(String[] args) throws Exception{
        FileOutputStream os=new FileOutputStream("DATA.IN");
        DataOutputStream dos=new DataOutputStream(os);
        dos.writeInt(4); dos.write(2); dos.writeInt(5); dos.write(10); dos.writeInt(15); dos.writeInt(3);
        dos.writeInt(1); dos.writeInt(5); dos.write(2); dos.writeInt(7); dos.writeInt(4); dos.writeInt(20);
        dos.writeInt(10); dos.writeInt(3);
    }
}
