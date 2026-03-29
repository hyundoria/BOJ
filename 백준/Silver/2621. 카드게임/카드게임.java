
import java.util.Arrays;
import java.util.Scanner;

class check {

    String[] color;
    int[] number;
    int[] num = new int[10];
    int[] clr = new int[4];
    int score = 0;
    boolean num_ck = true;
    boolean col_ck = false;

    check (String[] color, int[] number){
        this.color = color;
        this.number = number;

        for (int i = 0; i < 5; i++) {

            num[number[i]]++;

        }

        for (int i = 0; i < 5; i++) {

            switch (this.color[i]) {

                case "R": clr[0]++;
                    break;
                case "B": clr[1]++;
                    break;
                case "Y": clr[2]++;
                    break;
                case "G": clr[3]++;
                    break;
            }

        }

        Arrays.sort(number);

        for (int i = 0; i < 4; i++) {

            if (number[i+1] - number[i] != 1) {
                num_ck = false;
                break;
            }

        }

        for (int j : clr) {
            if (j == 5) {
                col_ck = true;
                break;
            }
        }



    }


    int ck1() {

        int[] num = number;
        Arrays.sort(num);

        if (col_ck && num_ck) {
            score = 900 + num[4];
        }
        else {
            score = 0;
        }

        return score;

    }
    int ck2() {

        score = 0;

        int idx = 0;

        for (int i = 1; i < num.length; i++) {

            if (num[i] == 4) {
                idx = i;
            }

        }

        if (idx != 0) {
            score = 800 + idx;
        }

        return score;


    }
    int ck3() {

        score = 0;

        int idx1 = 0;
        int idx2 = 0;

        for (int i = 1; i < num.length; i++) {

            if (num[i] == 3) {
                idx1 = i;
            }
            if (num[i] == 2) {
                idx2 = i;
            }

        }

        if (idx1 != 0 && idx2 != 0) {

            score = (idx1*10) + idx2 + 700;

        }

        return score;


    }
    int ck4() {

        score = 0;

        int[] num = number;
        Arrays.sort(num);

        if (col_ck) {
            score = num[4] + 600;
        }

        return score;


    }
    int ck5() {

        score = 0;

        if (num_ck) {

            int[] num = number;
            Arrays.sort(num);
            score = num[4] + 500;

        }
        return score;
    }
    int ck6() {

        score = 0;
        int idx = 0;

        for (int i = 1; i < num.length; i++) {

            if (num[i] == 3) {
                idx = i;
                break;
            }

        }

        if (idx != 0) {
            score = idx + 400;
        }

        return score;

    }
    int ck7() {

        score = 0;

        int idx1 = 0;
        int idx2 = 0;

        for (int i = 1; i < num.length; i++) {

            if (num[i] == 2) {
                if (idx1 == 0){
                    idx1 = i;
                }
                else {
                    idx2 = i;
                }
            }
        }

        if (idx1 != 0 && idx2 != 0) {
            score = (idx2*10) + idx1 + 300;
        }

        return score;


    }
    int ck8() {

        score = 0;

        int idx = 0;

        for (int i = 1; i < num.length; i++) {

            if (num[i] == 2) {
                idx = i;
            }
        }

        if (idx != 0) {
            score = idx + 200;
        }
        return score;


    }
    int ck9() {

        int[] num = number;
        Arrays.sort(num);
        score = 100 + num[4];
        return score;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] colar = new String[5];
        int[] number = new int[5];
        int[] score = new int[9];


        for (int i = 0; i < 5; i++) {

            colar[i] = sc.next();
            number[i] = sc.nextInt();

        }

        check ck = new check(colar, number);

        score[0] = ck.ck1();
        score[1] = ck.ck2();
        score[2] = ck.ck3();
        score[3] = ck.ck4();
        score[4] = ck.ck5();
        score[5] = ck.ck6();
        score[6] = ck.ck7();
        score[7] = ck.ck8();
        score[8] = ck.ck9();

        Arrays.sort(score);

        System.out.println(score[8]);


    }
}