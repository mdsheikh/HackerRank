import java.util.*;
import java.math.BigInteger;

public class biginteger {
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
        BigInteger bi_one = new BigInteger(scan.next());
        BigInteger bi_two = new BigInteger(scan.next());
        BigInteger sum;
        BigInteger product;
        sum = bi_one.add(bi_two);
        product = bi_one.multiply(bi_two);
        System.out.println("Sum is: " + sum);
        System.out.println("Product is: " + product);
        
        
    }
    
}