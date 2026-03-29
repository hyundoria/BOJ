import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a1 = 100000;
        int a2 = -100000;
        int b1 = 100000;
        int b2 = -100000;
            
        for(int i=0; i<n; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a1 >= a) {
                a1 = a;
            }
            if (a2 <= a) {
                a2 = a;
            }
            if(b1 >= b) {
                b1 = b;
            }
            if (b2 <= b) {
                b2 = b;
            }
            
            
        }

        
       
          System.out.print((a2-a1) * (b2-b1));
    

            
            
        }  
    }