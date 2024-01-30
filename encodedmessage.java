//https://open.kattis.com/problems/encodedmessage
import java.util.Scanner;

public class encodedmessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String line = sc.nextLine();
            int len = (int)Math.sqrt(line.length());
            String[][] map = new String[len][len];
            int i = 0;
            for(int r=0; r<len; r++){
                for(int c=0; c<len; c++){
                    map[r][c] = line.substring(i,i+1);
                    i++;
                }
            }
            for(int c=len-1; c>=0; c--){
                for(int r=0; r<len; r++){
                    System.out.print(map[r][c]);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
