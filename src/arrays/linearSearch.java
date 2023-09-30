package arrays;
public class linearSearch {
    public static void main(String[] args) {
        int numbers[] = {1,3,5,7,9,12,14,16};
        int key = 9;

        int index = linerSearch(numbers, key);
        if(index == -1){
            System.out.println("Not found");
        }else {
            System.out.println("key is at index: " + index);
        }
    }

    public  static int linerSearch(int numbers[], int key){
        for (int i = 0; i<numbers.length; i++ ){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
}
