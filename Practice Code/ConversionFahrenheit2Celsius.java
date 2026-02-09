
import java.util.*;

public class ConversionFahrenheit2Celsius {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MinF = sc.nextInt();
        int MaxF = sc.nextInt();
        int step = sc.nextInt();

        for (int i = MinF; i <= MaxF; i += step) {
            int celsius = (5*(i - 32)/9); 
            System.out.println(i +"\t"+celsius);
        }
    }
}
