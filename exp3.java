import java.util.*;

public class exp3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int N = sc.nextInt();

       
        char[] records = new char[N];
        for (int i = 0; i < N; i++) {
            records[i] = sc.next().charAt(0);
        }

        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); 

        int prefixSum = 0;
        int maxLength = 0;

        for (int i = 0; i < N; i++) {
            if (records[i] == 'P') {
                prefixSum += 1;
            } else {
                prefixSum -= 1;
            }

            if (map.containsKey(prefixSum)) {
                maxLength = Math.max(maxLength, i - map.get(prefixSum));
            } else {
                map.put(prefixSum, i);
            }
        }

        
        System.out.println(maxLength);

        sc.close();
    }
}
