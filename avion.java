//https://open.kattis.com/problems/avion
import java.util.Scanner;

public class avion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String blimps = "";
        for(int i=0; i<5; i++){
            if(sc.nextLine().contains("FBI")){
                blimps += i+1+" ";
            }
        }
        System.out.println(blimps.length()>0?blimps.substring(0,blimps.length()-1):"HE GOT AWAY!");
        sc.close();
    }
}
