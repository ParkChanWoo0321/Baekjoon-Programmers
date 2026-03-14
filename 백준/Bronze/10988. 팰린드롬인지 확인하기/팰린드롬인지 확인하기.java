import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();
        int l = 0, r = s.length() - 1;
        boolean ok = true;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                ok = false;
                break;
            }
            l++;
            r--;
        }
        System.out.print(ok ? 1 : 0);
    }
}