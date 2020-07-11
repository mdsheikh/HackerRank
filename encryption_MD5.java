/**
 * encryption_MD5
 *
 */

import java.math.BigInteger; 
import java.security.MessageDigest; 
import java.security.NoSuchAlgorithmException; 

public class encryption_MD5 {

    public static String getEncryptionMD5(String input){
        try{

        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] msgDigest = md.digest(input.getBytes());
        BigInteger no = new BigInteger(1, msgDigest); 
        String result = no.toString(16); 
            while (result.length() < 32) { 
                result= "0" + result;
            } 
            return result; 

        } catch (NoSuchAlgorithmException e) { 
            throw new RuntimeException(e); 
        } 

    }

    public static void main(String[] args) {
        String input = "HelloWorld";
        System.out.println("The generated hashcode is: " + getEncryptionMD5(input));

        
    }
}