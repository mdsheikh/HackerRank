/**
 * reverseString
 */
public class reverseString {
    public static void reverse_string(String input){
        for(int i = 0; i< input.length()/2; i++){
            if(input.charAt(i) != input.charAt(input.length() - i -1)){
                System.out.print("No");
                System.exit(0);
            }

        }
        System.out.println("Yes");
    }

    public static void main(String[] args) {
        String input =  "madam";
        reverse_string(input);
        
    }
}