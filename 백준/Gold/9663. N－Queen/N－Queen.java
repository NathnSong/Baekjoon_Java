/*
N-Queen
퀸의 공격 방향 : 같은 행, 같은 열, 대각선으로 원하는 만큼 움직인다.
N이 주어지고, N*N 크기의 체스판에 N개의 퀸이 있다고 가정
각 퀸N개가 서로 공격할 수 없게 놓는다.

로직
- 각 행마다 퀸을 한 개씩 놓는다. 공격 방향에서 벗어난 열을 재귀로 탐색
- 퀸을 놓을 수 있는 곳을 찾으면 다음 행으로
- 마지막 행까지 퀸을 놓을 수 있게 되면 count += 1
*/
import java.util.Scanner;

class Main
{
    static int n;
    static int count = 0;
    
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        n = in.nextInt(); // N을 입력받는다.
        solve(new int[n], 0);
        System.out.println(count);
	}
	
	static void solve(int col[], int row) {
	    if (row == n) { //유효한 경우
	        count += 1;
	        return;
	    }
	    
	    for (int i = 0; i < n; i++) {
	        col[row] = i; // row에 위치한 열 번호를 i로 둔다.
	        if (isValid(col, row)) {
	            solve(col, row+1); //해당 row와 col이 유효한 경우, 다음 row로 이동
	        }
	    }
	}
    
	//이전 퀸과 충돌이 발생하는지 검사
	static boolean isValid(int col[], int row) {
	    for (int i = 0; i < row; i++) {
	        // 이전 퀸과 같은 열인지 또는 대각선에 위치하는지 검사
	        if (col[i] == col[row] || Math.abs(row - i) == Math.abs(col[row] - col[i])) {
	            return false;
	        }
	    }
	    return true; 
	}
}