import java.util.*;
public class String_Compression{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder ans = new StringBuilder();

        int count = 1;
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            }
            else{
                ans.append(str.charAt(i-1));
                ans.append(count);
                count = 1;
            }
        }
        ans.append(str.charAt(str.length()-1));
        ans.append(count);
        System.out.println(ans);
    }
}