

import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] arr = new String[20][3];

        for (int i=0; i<20; i++) {

            arr[i][0] = sc.next();
            arr[i][1] = sc.next();
            arr[i][2] = sc.next();

        }

        double total = 0;
        double sum = 0;


        for (int i=0; i<20; i++) {

            if (Objects.equals(arr[i][2], "A+")) {
                sum += Double.parseDouble(arr[i][1]) * 4.5;
                total += Double.parseDouble(arr[i][1]);
            }

            else if (Objects.equals(arr[i][2], "A0")) {
                sum += Double.parseDouble(arr[i][1]) * 4.0;
                total += Double.parseDouble(arr[i][1]);
            }

            else if (Objects.equals(arr[i][2], "B+")) {
                sum += Double.parseDouble(arr[i][1]) * 3.5;
                total += Double.parseDouble(arr[i][1]);
            }

            else if (Objects.equals(arr[i][2], "B0")) {
                sum += Double.parseDouble(arr[i][1]) * 3.0;
                total += Double.parseDouble(arr[i][1]);
            }

            else if (Objects.equals(arr[i][2], "C+")) {
                sum += Double.parseDouble(arr[i][1]) * 2.5;
                total += Double.parseDouble(arr[i][1]);
            }

            else if (Objects.equals(arr[i][2], "C0")) {
                sum += Double.parseDouble(arr[i][1]) * 2.0;
                total += Double.parseDouble(arr[i][1]);
            }

            else if (Objects.equals(arr[i][2], "D+")) {
                sum += Double.parseDouble(arr[i][1]) * 1.5;
                total += Double.parseDouble(arr[i][1]);
            }

            else if (Objects.equals(arr[i][2], "D0")) {
                sum += Double.parseDouble(arr[i][1]) * 1.0;
                total += Double.parseDouble(arr[i][1]);
            }

            else if (Objects.equals(arr[i][2], "F")) {
                sum += Double.parseDouble(arr[i][1]) * 0.0;
                total += Double.parseDouble(arr[i][1]);
            }

        }


        System.out.println(Math.round((sum / total)*1000000)/1000000.0);



    }
}



