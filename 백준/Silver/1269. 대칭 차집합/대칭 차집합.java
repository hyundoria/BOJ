

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        int b = sc.nextInt();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            list1.add(sc.nextInt());
        }
        for (int i = 0; i < b; i++) {
            list2.add(sc.nextInt());
        }

        HashSet<Integer> set = new HashSet<>();

        set.addAll(list1);
        set.addAll(list2);

        int sum = 0;
        int cnt = 0;

        sum += set.size() - intersection(set, list1);
        sum += set.size() - intersection(set, list2);
       
        System.out.println(sum);
        
    }

    public static int intersection(HashSet<Integer> set, ArrayList<Integer> list) {

        int cnt = 0;
        
        for (int i = 0; i < list.size(); i++) {

            int k = list.get(i);

            if (set.contains(k)) {
                cnt++;
            }

        }
        
        return cnt;
        
    }
}




