
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double[][] arr = new double[2][2];

        for (int i=0; i<2; i++) {
            arr[i][0] = sc.nextDouble();
            arr[i][1] = sc.nextDouble();
        }

        double sum = arr[0][0]/arr[1][0] + arr[0][1]/arr[1][1];
        double max = sum;
        int cnt = 0;



        for (int i=0; i<3; i++) {

            double tmp = 0;

            tmp = arr[0][0];
            arr[0][0] = arr[1][0];
            arr[1][0] = arr[1][1];
            arr[1][1] = arr[0][1];
            arr[0][1] = tmp;

            sum = arr[0][0]/arr[1][0] + arr[0][1]/arr[1][1];

            if (sum > max) {
                max = sum;
                cnt = i+1;
            }

        }


        System.out.println(cnt);



    }
}
