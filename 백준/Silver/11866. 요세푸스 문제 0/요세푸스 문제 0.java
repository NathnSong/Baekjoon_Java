import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	static int N;
	static int K;
	static Deque<Integer> q = new LinkedList<>();
	static int count = 0;
	
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());	
		
		sb.append("<");
		
		for(int i = 1 ; i <=N ;i++) {
			q.add(i);
		}
		
		while(q.size()>1) {
			if(count == K-1) {
				sb.append(q.pop() + ", ");
				count = 0;
			} else {
				q.add(q.pop());
				count++;
			}
			
		}
		
		sb.append(q.pop()+">");
		
		System.out.println(sb);

		}
	
}