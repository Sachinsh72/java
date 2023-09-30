package arrays;

public class updateMarks {
    public static void main(String[] args) {
        int marks[] = {98, 99, 100};
        int nonChangable = 5;
        update(marks,nonChangable);
        System.out.println(nonChangable);

        //print marks
        for (int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
    public static void update(int marks[], int nonChangable){
        nonChangable = 10;
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i]+1;
        }
    }
}
