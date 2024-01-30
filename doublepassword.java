//https://open.kattis.com/problems/doublepassword
import java.util.Scanner;

public class doublepassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String one = sc.nextLine();
        String two = sc.nextLine();
        int diffs = 0;
        for(int i=0; i<4; i++){
            if(one.charAt(i)!=two.charAt(i)){
                diffs++;
            }
        }
        System.out.println((int)Math.pow(2,diffs));
        sc.close();
    }
}
