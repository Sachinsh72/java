package patterns;

public class NineteenPattern {
    public static void main(String[] args) {
        int n=5;
        int iniS = 0;
        //for first layer
        for (int i=0; i<n; i++){
            //star
            for (int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            //space
            for (int j=0; j<iniS; j++){
                System.out.print(" ");
            }
            //star
            for (int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            iniS += 2;
            System.out.println();
        }

        //for second layer
        iniS = 8;
        for (int i=1; i<=n; i++){
            //star
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            //space
            for (int j=0; j<iniS; j++){
                System.out.print(" ");
            }
            //star
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            iniS -=2;
            System.out.println();
        }
    }
}
