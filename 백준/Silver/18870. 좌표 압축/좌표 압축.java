
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Integer[] arr = new Integer[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        HashSet<Integer> set = new HashSet<>(Arrays.asList(arr));

        Integer[] arr1 = set.toArray(new Integer[0]);
        Arrays.sort(arr1);

        HashMap<Integer, Integer> map = new HashMap<>(set.size());

        for (int i = 0; i < arr1.length; i++) {

            map.put(arr1[i], i);

        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(map.get(arr[i])).append(" ");
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();



    }
}




