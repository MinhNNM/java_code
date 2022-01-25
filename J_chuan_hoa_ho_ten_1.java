import java.util.Scanner;

public class J_chuan_hoa_ho_ten_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            String st="";
            s=s.replaceAll("\\s+", " ").trim();
            s=s.toLowerCase();
            String tmp[]=s.split(" ");
            for(int i=0; i<tmp.length; i++){
                st+=String.valueOf(tmp[i].charAt(0)).toUpperCase() + tmp[i].substring(1);
                if(i<tmp.length-1)
                    st+=" ";
            }
            System.out.println(st);
        }
    }
}
