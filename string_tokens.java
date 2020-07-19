/**
 * string_tokens
 */
//import java.io.*;
//import java.util.*;

import java.io.*;
import java.util.*;

public class string_tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        //String  s = "He is a very very good boy, isn't he?";
        s = s.trim();
        if (s.length()>400000){
            return ;
        }else if (s.length()==0){
            System.out.println(0);
            return ;
        }else{   
        String[] words = s.split("[!,?.*_'@\\ ]+");
        
        System.out.println(words.length);
        for(String word : words){
            System.out.println(word);
        }
      }
       
        scan.close();
    }
}
