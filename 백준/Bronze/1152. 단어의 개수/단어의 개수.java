import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s == null || s.length() == 0) {
            System.out.println(0);
            return;
        }
        int spaces = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') spaces++;
        }
        int d = spaces + 1;
        if (s.charAt(0) == ' ') d--;
        if (s.charAt(s.length() - 1) == ' ') d--;
        System.out.println(d);
    }
}