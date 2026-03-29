import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] brr = Arrays.copyOf(arr, arr.length);
        
        Arrays.sort(brr);
        
        loop1 : for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {

                if(arr[i] == brr[j]) {
                    System.out.print(j + " ");
                    brr[j] = 0;
                    continue loop1;
                }          
            }
        }
        


        
    }
}