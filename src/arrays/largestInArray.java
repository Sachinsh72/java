package arrays;
import  java.util.*;
public class largestInArray {
    public static int getLargest(int number[]){
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i<number.length; i++){
            if(largest < number[i]){
                largest = number[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int number[] = {1,2,4,6,3,5};
        System.out.println("largest value is: " + getLargest(number));
    }
}
