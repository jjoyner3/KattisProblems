//https://open.kattis.com/problems/different
import java.util.Scanner;

public class different{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            long a = sc.nextLong();
            long b = sc.nextLong();
            sc.nextLine();
            System.out.println(Math.abs(a-b));
        }
        sc.close();
    }
}