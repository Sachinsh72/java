package basicProblem;

public class oddEven {
    public static void main(String[] args) {
        int num = 3;

        System.out.println("By ternary operator");
        System.out.println(num % 2 == 0 ? "Even" : "Odd");

        System.out.println("By if else");
        if(num % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }
}
