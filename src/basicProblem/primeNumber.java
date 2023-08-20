package basicProblem;
import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {

        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int i = 1;
        while(i<=num){
            if(num%i==0){
                count++;
                i++;
            }
            if (count == 2){
                System.out.println(num + "Prime");
            }
        }

    }
}
