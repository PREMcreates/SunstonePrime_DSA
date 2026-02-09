import java.util.*;
public class OddEvenDigitSum { 
    public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int oddsum = 0;
        int evensum = 0;
        int position = 1;

        //logic to add sum and odd placed nums
        while(n!=0){
            int digit = n%10;
            if(position%2 == 0){
                evensum += digit;
            }
            else{
                oddsum += digit;
            }
            n = n/10;
            position++;
        }
        System.out.println(oddsum);
        System.out.println(evensum);

    }
}

