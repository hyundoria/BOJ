import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static BigInteger hanoiMoves(int n) {
        return BigInteger.valueOf(2).pow(n).subtract(BigInteger.ONE); // 2^n - 1
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 원반의 개수를 입력
        int n = sc.nextInt();
        System.out.println(hanoiMoves(n));
        //최초 함수를 실행
        if(n < 21) {
            MoveDisk(n, '1', '2', '3');
        }

    }


    // N은 원반의 개수, X는 처음 원반이 있는 기둥, Y는 중간 이동에 사용될 기둥, Z는 목표 기둥
    static void MoveDisk(int N, char pole_X, char pole_Y, char pole_Z) {


        //N이 1일때 목표 기둥으로 원반 이동
        if(N == 1) {
            System.out.println(pole_X + " " + pole_Z);
            return;
        }

        //n-1개의 X에 있는 디스크를 Y로 이동, 이때 Z가 중간 이동에 사용될 기둥.
        MoveDisk(N - 1, pole_X, pole_Z, pole_Y);
        //n번째 디스크를 X에서 Z로 이동
        System.out.println(pole_X + " " + pole_Z);
        //n-1개의 Y에 있는 디스크를 Z로 이동, 이떄 X가 중간 이동에 사용될 기둥.
        MoveDisk(N - 1, pole_Y, pole_X, pole_Z);


    }


}
