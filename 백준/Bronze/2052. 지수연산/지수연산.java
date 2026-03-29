

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        BigInteger bi = new BigInteger("2");
        BigInteger big = bi.pow(Integer.parseInt(str));

        BigDecimal bdd = new BigDecimal(big);
        BigDecimal bd = BigDecimal.ONE;

        String stt = String.valueOf(bd.divide(bdd, MathContext.UNLIMITED));

        if (stt.charAt(0) != '0') {

            int idxdot = 0;
            int idx = 0;

            for (int i=0; i<stt.length(); i++) {


                if (stt.charAt(i) == '.') {
                    idxdot = i;
                }
                if (stt.charAt(i) == '-') {
                    idx = i;
                }

            }

            StringBuilder sb = new StringBuilder("0.");

            sb.append("0".repeat(Math.max(0, Integer.parseInt(stt.substring(idx + 1))-1)));

            sb.append(stt.substring(0,idxdot));
            sb.append(stt.substring(idxdot+1,idx-1));

            System.out.println(sb);
        }
        else {
            System.out.println(stt);
        }



    }
}



