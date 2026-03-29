import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){

            StringBuilder sb = new StringBuilder();
            
            int n = sc.nextInt();

            if (n == -1) {
                break;
            }
            
            boolean[] arr = new boolean[n];

            int k = 0;
                
            for(int i=1; i<n; i++) {
                if (n % i == 0){
                    
                    arr[i] = true;
                    k += i;
                }
            }
            
            if(k == n) {
               sb.append(n + " = ");

                for(int i=1; i<n; i++) {
                    
                if (arr[i] == true){
                    sb.append(i + " + ");
                }
            }
            
            System.out.println(sb.delete(sb.length()-3, sb.length()));
                    
            }
            else{
                System.out.println(n + " is NOT perfect.");
            }
            

            
            
            
        }



        


            
            
        }  
    }