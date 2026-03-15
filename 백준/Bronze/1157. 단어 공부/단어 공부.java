import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') c = (char)(c - 'a' + 'A');
            cnt[c - 'A']++;
        }
        int max = -1;
        int idx = -1;
        boolean dup = false;
        for (int i = 0; i < 26; i++) {
            if (cnt[i] > max) {
                max = cnt[i];
                idx = i;
                dup = false;
            } else if (cnt[i] == max) {
                dup = true;
            }
        }
        System.out.print(dup ? "?" : String.valueOf((char)('A' + idx)));
    }
}