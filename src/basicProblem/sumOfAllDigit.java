package basicProblem;
import java.util.Scanner;
public class sumOfAllDigit {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while (num>0){
            int rem = num%10;
            sum = sum + rem;
            num = num/10;
        }
        System.out.println(sum);
    }
}
