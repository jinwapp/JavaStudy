import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1009_DistributedProcessing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //테스트케이스
        int N = Integer.parseInt(br.readLine());
        String[] testcase = new String[N];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < N; i++) {
            testcase[i] = br.readLine();
            StringTokenizer st = new StringTokenizer(testcase[i]);
            result.append(calculate(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()))+"\n");
        }
        System.out.println(result);
    }

    public static int calculate(int A, int B) {
        int result = 1;
        for (int i = 0; i < B; i++) {
            result = (result * A) % 10;
            if(result == 0) result = 10;
        }
        return result;
    }
}
