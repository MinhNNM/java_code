import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J_hello_file {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("Hello.txt");
        Scanner sc=new Scanner(file);
        while (sc.hasNextLine()){
            String s=sc.next();
            System.out.println(s);
        }
    }
}
