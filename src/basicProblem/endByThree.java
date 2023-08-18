package basicProblem;

public class endByThree {
    public static void main(String[] args) {
        int num = 23430;

        System.out.println("For the last number end with 3");
        System.out.println(num % 10 == 3 ? num+" Ends with 3" : num+" Not ends with 3");

        System.out.println("For second last number end with 3");
        String result = (num%100)/10 == 3 ? num+" second last number end with 3": num+" second last number end with 3";
        System.out.println(result);
    }
}
