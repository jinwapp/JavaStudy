import java.io.*;
import java.util.LinkedList;
import java.util.Queue;


public class BOJ2161_Card1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        //문제 : 1 ~ N 장의 카드 -> 제일 위에 있는 카드 버린다. -> 제일 위에 있는 카드를 아래로 옮긴다. -> 반복 -> 마지막 카드를 출력한다.

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        while (!q.isEmpty()) {
            //큐의 첫 요소를 빼서 결과에 넣기
            sb.append(q.poll()).append(" ");
            if (q.isEmpty()) break;
            q.add(q.poll());
        }
        System.out.println(sb.toString());
    }
}
