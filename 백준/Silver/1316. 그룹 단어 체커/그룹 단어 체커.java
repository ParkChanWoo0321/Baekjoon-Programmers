import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            boolean[] seen = new boolean[26];
            char prev = 0;
            boolean ok = true;
            for (int j = 0; j < s.length(); j++) {
                char cur = s.charAt(j);
                if (cur != prev) {
                    if (seen[cur - 'a']) {
                        ok = false;
                        break;
                    }
                    seen[cur - 'a'] = true;
                }
                prev = cur;
            }
            if (ok) count++;
        }
        System.out.print(count);
    }
}