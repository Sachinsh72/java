package basicProblem;
import java.util.Scanner;
public class reverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        while(num>0){
            int rem = num % 10;
            rev = 10*rev + rem;
            num = num/10;
        }
        System.out.println(rev);
    }
}
