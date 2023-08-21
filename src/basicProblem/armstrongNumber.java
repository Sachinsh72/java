package basicProblem;

public class armstrongNumber {
    public static void main(String[] args) {
        int n = 123;
        int temp = n;
        int sum = 0;

        while (n>0){
            int rem = n%10;
            sum = sum + (rem*rem*rem);
            n = n/10;
        }

        if(temp == sum){
            System.out.println(temp+" is Armstrong number");
        }else {
            System.out.println(temp+ " is not a Armstrong number");
        }
    }

}
