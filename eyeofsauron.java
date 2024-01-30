//https://open.kattis.com/problems/eyeofsauron

import java.util.Scanner;

public class eyeofsauron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int len = line.length();
        boolean c = len % 2 == 0 && line.charAt(len / 2 - 1) == '(' && line.charAt(len / 2) == ')';
        System.out.println(c ? "correct" : "fix");
        sc.close();
    }
}
