//https://open.kattis.com/problems/aaah
import java.util.*;
public class aaah{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(a.length()<b.length() ? "no" : "go");
        sc.close();
    }
}