
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        int[][] arr = new int[n][m];

        for (int i=0; i<n; i++) {

            String str = sc.next();

            for (int j=0; j<m; j++) {

                arr[i][j] = Integer.parseInt(str.substring(j,j+1));

            }

        }

        int size = 1;

        loop1 : for (int i=0; i<n; i++) {
            loop2 : for (int j=0; j<m; j++) {
                loop3 : for(int r=0; r<=Math.max(n,m)-i; r++) {

                    if (i+r >= n || j+r >= m) {
                        continue loop2;
                    }
                    
                    if (arr[i][j] == arr[i][j+r] && arr[i][j] == arr[i+r][j] && arr[i][j] == arr[i+r][j+r]) {

                        if (r+1 >= size) {
                            size = r+1;
                        }
                    }

                }
            }
        }


        System.out.println(size*size);

    }
}