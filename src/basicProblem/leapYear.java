package basicProblem;
import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year%100!=0 && year%4==0 || year%400==0){
            System.out.println("Leap year");
        }else {
            System.out.println("Not leap year");
        }
    }
}
