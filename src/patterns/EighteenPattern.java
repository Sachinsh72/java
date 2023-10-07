package patterns;

public class EighteenPattern {
    public static void main(String[] args) {
        int n=5;
        for (int i=0; i<n; i++){
            for (char ch = 'E'; ch>='E'- i; ch--){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
