import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] p = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};
        int cnt = 0;
        for (int i = 0; i < s.length(); ) {
            boolean matched = false;
            for (String t : p) {
                int len = t.length();
                if (i + len <= s.length() && s.startsWith(t, i)) {
                    cnt++;
                    i += len;
                    matched = true;
                    break;
                }
            }
            if (!matched) {
                cnt++;
                i++;
            }
        }
        System.out.print(cnt);
    }
}