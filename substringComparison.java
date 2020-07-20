public class substringComparison {

    public static String getSmallestAndLargest(String s , int k){
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        for(int i = 0; i< s.length() - k; i++){
            String curr = s.substring(i, i+k);
            if(curr.compareTo(smallest) < 0){
                smallest = curr;
            }
            if(curr.compareTo(largest)> 0){
                largest = curr;
            }
        }
        return smallest + "\n" + largest;
        
 
    }

    public static void main(String[] args) {
        String s = "welcometojava";
        int k = 3;

        System.out.println(getSmallestAndLargest(s, k));

    }      
  
}