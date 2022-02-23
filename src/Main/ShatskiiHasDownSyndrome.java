package Main;

public class ShatskiiHasDownSyndrome {
    public static void main(String[] args) {
        int h = 7;

        int count = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < ((2 * h) - 1) - i; j++) {
                if (j < i) {
                    System.out.print(" ");
                }
                else
                    if (i==j) System.out.print(0);
                    else if (j*2==i) System.out.print(0);
                    else
                        System.out.print(i <= (h / 2) ? count : h/(count-1));
            }
            count++;


            System.out.println();
        }


    }
}
