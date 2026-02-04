import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 1;

        for(int i=2; i<=n; i++){
            if(n%i == 0){
                p++;
            }
        }
        if(p==2){
            System.out.println("Prime!");
        }
        else{
            System.out.println("Not Prime!");
        }
    }
}
