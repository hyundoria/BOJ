
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[8];

        for (int i=0; i<8; i++) {
            arr1[i] = sc.nextInt();
        }

        int asc = 0;
        int des = 0;

        for (int i=0; i<7; i++) {

            if (arr1[i]+1 == arr1[i+1])  {
               asc++;
            }
            else if (arr1[i] == arr1[i+1]+1) {
                des++;
            }
        }

        if (asc == 7) {
            System.out.println("ascending");
        }
        else if (des == 7) {
            System.out.println("descending");
        }
        else {
            System.out.println("mixed");
        }



    }
}