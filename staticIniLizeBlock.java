
import java.util.*;
public class staticIniLizeBlock {
    static boolean flag = true;
    static int B;
    static int H;

    static{

    Scanner scan = new Scanner(System.in);
    
     B = scan.nextInt();
     H = scan.nextInt();
    try{
        if(B < 0 || H < 0){
            flag = false;
            throw new Exception("Breadth and height must be positive")
        }
    }catch(Exception e){
        System.out.println(e);
    }
    }

    
    public static void main(String[] args) {
        if(flag ==  true){
            int area = B*H;
            System.out.println(area);
        }


        

    }
    
}