
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        String[] arr = new String[n];

        sc.nextLine();

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextLine();
            arr[i] = arr[i].replace(" ","");
        }


        for(int i=0; i<n; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j=0; j<arr[i].length(); j++) {

                for (int r=0; r<k; r++) {
                    sb.append(arr[i].charAt(j)).append(" ");
                }

            }

            String str = String.valueOf(sb).trim();

            for (int r=0; r<k; r++) {
                    System.out.println(str);
            }

        }




    }
}



