import java.io.*;
import java.util.*;
import java.math.*;

public class HackerRank_2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            long n = sc.nextLong();
            System.out.println(n+" can be fitted in:");
            
            try{
                if(n>=Byte.MIN_VALUE && n<=Byte.MAX_VALUE){
                System.out.println("* byte");
            }
            if(n>=Short.MIN_VALUE && n<=Short.MAX_VALUE){
                System.out.println("* short");
            }
            if(n>=Integer.MIN_VALUE && n<=Integer.MAX_VALUE){
                System.out.println("* int");
            }
            if(n>=Long.MIN_VALUE && n<=Long.MAX_VALUE){
                System.out.println("* long");
            }
            }
            
            catch(Exception e){
                System.out.println(sc.next()+ "n can't be fitted anywhere.");
            }
            
        }
    }
}
