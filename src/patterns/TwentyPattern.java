package patterns;

public class TwentyPattern {
    public static void main(String[] args) {
        int n = 5;
        int spaces = 2*n-2;
        for (int i=1; i<=2*n-1; i++){
            //star
            int star = i;
            if(i>n) star = 2*n-i;
            for (int j=1; j<=star; j++){
                System.out.print("*");
            }
            //space
            for (int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            //star
            for (int j=1; j<=star; j++){
                System.out.print("*");
            }

            if (i<n) spaces -=2;
            else spaces +=2;
            System.out.println();
        }
    }
}
