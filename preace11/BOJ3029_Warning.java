import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//정인이가 기다리는 시간
public class BOJ3029_Warning {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        String s2 = br.readLine();

        if (s1.equals(s2)) {
            System.out.println("24:00:00");
            System.exit(0);
        }

        String[] s1Arr = s1.split(":");
        String[] s2Arr = s2.split(":");

        int h = Integer.parseInt(s2Arr[0]) - Integer.parseInt(s1Arr[0]);
        int m = Integer.parseInt(s2Arr[1]) - Integer.parseInt(s1Arr[1]);
        int s = Integer.parseInt(s2Arr[2]) - Integer.parseInt(s1Arr[2]);

        if (h < 0) {
            h += 24;
        }
        if (m < 0) {
            m += 60;
            h--;
        }
        if (s < 0) {
            s += 60;
            m--;
        }
        System.out.printf("%02d:%02d:%02d",h,m,s);
    }
}
