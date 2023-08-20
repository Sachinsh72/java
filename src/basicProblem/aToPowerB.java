package basicProblem;

public class aToPowerB {
    public static void main(String[] args) {
        //2 the power 3
        int base = 2;
        int expo = 3;
        int result = 1;
        for (int i = 0; i<expo;i++){
            result = result*base;
        }
        System.out.println(result);
    }


}
