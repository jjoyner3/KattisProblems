//https://open.kattis.com/problems/almostperfect
import java.util.*;

public class almostperfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x = Integer.parseInt(sc.nextLine());
            int sum = 1;
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    sum += i;
                    if(x/i!=i){
                        sum += x / i;
                    }
                }
            }
            System.out.println(
                    x == sum ? x + " perfect" : Math.abs(x - sum) < 3 ? x + " almost perfect" : x + " not perfect");
        }
        sc.close();
    }
}