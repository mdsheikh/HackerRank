import java.math.BigDecimal;
import java.util.*;
import java.util.Arrays;

class bigDecimal {

    public static void main(String[] args) {
        // Input
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // String[] s = new String[n + 2];

        // for (int i = 0; i < n; i++) {
        // s[i] = sc.next();
        // }
        // sc.close();
        String[] s = { "9", "-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000" };
        int n = 10;
        Comparator<String> comparator = new Comparator<String>() {

            @Override
            public int compare(String s1, String s2) {
                BigDecimal bd_one = new BigDecimal(s1);
                BigDecimal bd_two = new BigDecimal(s2);
                return bd_two.compareTo(bd_one);
            }
        };
        Arrays.sort(s, 0, n, comparator);

        for (int i = 0; i < n; i++) { // for output
            System.out.println(s[i]);
        }
    }
}