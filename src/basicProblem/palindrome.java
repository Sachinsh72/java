package basicProblem;
public class palindrome {
    public static void main(String[] args) {
        int rem;
        int sum = 0;
        int temp;
        int n = 123;
        temp = n;
        while (n>0){
            rem = n%10;
            sum = (sum*10)+rem;
            n = n/10;
        }
        if(temp==sum){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }
}

