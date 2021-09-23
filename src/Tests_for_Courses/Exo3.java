package Tests_for_Courses;

import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        drawR(n);

    }

    private static void drawR(int n) {
        for (int nb_line = 1; nb_line<(n+2)*2;nb_line++){
            // line 1 :

            if(nb_line==1 || nb_line == (n+2)){
                for (int nb_R = 1; nb_R<=n+2;nb_R++){
                    System.out.print("R");
                }
                System.out.println();
            }
            if(nb_line>1 && nb_line<n+2){
                System.out.print("R");
                for (int nb_R = 2; nb_R<n+2;nb_R++){
                    System.out.print(" ");
                }
                System.out.print("R");
                System.out.println();
            }
            if(nb_line>n+2){
                System.out.print("R");
                for (int pos_R = 2; pos_R<=nb_line-(n+2);pos_R++){
                    System.out.print(" ");
                }
                System.out.print("R");
                System.out.println();
            }

        }

        return;
    }
}
