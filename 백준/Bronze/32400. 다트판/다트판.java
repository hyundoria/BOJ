
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        float[] arr = new float[20];

        float sum = 0;

        int cnt = -1;

        for (int i = 0; i < 20; i++) {
            arr[i] = sc.nextFloat();
            sum += arr[i];
            if (arr[i] == 20) {
                cnt = i;
            }
        }

        float b = sum / 20;

        sum = 0;

        if (cnt == 0) {
            sum += arr[0] + arr[1] + arr[19];
        }else if(cnt == 19) {
            sum += arr[0] + arr[18] + arr[19];
        }
        else {
            sum += arr[(cnt-1)] + arr[cnt] + arr[cnt+1];
        }

        float a = sum / 3;


        if(Math.max(a,b) == a) {
            System.out.println("Alice");
        }else if(Math.max(a,b) == b) {
            System.out.println("Bob");
        }
        else {
            System.out.println("Tie");
        }






    }




}




