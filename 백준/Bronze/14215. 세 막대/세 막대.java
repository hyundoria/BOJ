import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
        int[] arr = new int[3];
            
        for (int i = 0; i<3;  i++) {

            arr[i] = sc.nextInt();
            
        }        

        Arrays.sort(arr);

        if(arr[0] + arr[1] > arr[2]) {

            System.out.print(arr[0] + arr[1] + arr[2]);
            
        }
        else {

            System.out.print(((arr[0] + arr[1]) * 2)-1);
            
        }
        
        
    }
}