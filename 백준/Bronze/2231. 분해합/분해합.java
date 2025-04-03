import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String numberString = br.readLine();
     
        int numberLength = numberString.length();
      
        int number = Integer.parseInt(numberString);
    
        int result = 0;
       
        for(int i = (number - (numberLength * 9)); i < number; i++) {
            int sum = 0; 
            int j = i;
            while (j != 0) {
                sum += j % 10;
                j /= 10;
            }
            
            if(sum + i == number) {
                result = i;
                break;
            } 
        }

        System.out.println(result);
    }
}