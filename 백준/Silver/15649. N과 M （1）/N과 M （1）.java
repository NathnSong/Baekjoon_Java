/*
백준 15649번
N과 M(1)

백트래킹(Backtracking)
- 길을 가다가 이 길이 아니면 왔던 길로 되돌아가 다른 경로로 진행
- 재귀로 구현하고, 조건에서 벗어나면 종료
- DFS(깊이 우선 탐색) 방법으로 풀이
*/
import java.util.Scanner;
class Main
{
    public static int[] arr;
    public static boolean[] visit;
    public static StringBuilder answer;//String은 시간초과.. -> StringBuilder 사용
    
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int m = in.nextInt();
	    arr = new int[m];
	    visit = new boolean[n];
	    answer = new StringBuilder();
	    dfs(n, m, 0);
        System.out.println(answer);	    
	}
	
	public static void dfs(int n, int m, int depth) {
	    if (depth == m) { // 끝까지 이동
	        for (int a : arr) {
	            answer.append(a).append(' ');
	        }
	        answer.append('\n');
	        return;
	    }
	    
	    for (int i = 0; i < n; i++) {
	        if(!visit[i]) { // 방문 체크 : 숫자를 중복하지 않기 위해
	            visit[i] = true;
	            arr[depth] = i+1;
	            dfs(n, m, depth+1); // 끝까지 가면, 리턴 후 그 이전으로 back
	            visit[i] = false;
	        }
	    }
	}
}
