

import  java.util.*;


class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int count =0;
        int not = 0;


        int n = sc.nextInt();

        for (int A=0; A<n; A++) {

            int k = sc.nextInt();

            if (k==1) {
                not++;
                continue;
            }
            if (k==2) {
                count++;
            }



            for (int i = 2; i<k; i++) {

                    if (k%i == 0) {
                        break;
                    }

                    if (i == k-1){
                    count++;
                    }
            }
            }


        System.out.println(count);
    }
}

