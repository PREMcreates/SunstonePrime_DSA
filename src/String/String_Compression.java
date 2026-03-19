import java.util.*;
public class String_Compression{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder ans = new StringBuilder();

        
        for(int i=1; i<str.length(); i++){
            int count = 0;
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            }
            ans.append(str.charAt(i));
        }
        System.out.println(ans);
    }
}