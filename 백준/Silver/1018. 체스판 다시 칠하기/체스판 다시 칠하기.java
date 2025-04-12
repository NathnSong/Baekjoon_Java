/******************************************************************************
백준 1018번

MxN 정사각형으로 나누어져 있는 보드
검은색 or 흰색
보드를 잘라서 8X8 크기의 체스판으로 만든다.
검은색 흰색 번갈아서 칠한다

8x8을 한 칸씩 돌면서, 각 칸이 체스판 규칙에 맞는지 확인:
시작색 = 'W' or 'B'
(i + j) % 2 == 0이면 시작 색과 같아야 하고,
(i + j) % 2 == 1이면 시작 색과 달라야 함함

*******************************************************************************/
import java.util.Scanner;

class Main
{
    public static int repaint(int startx, int starty, char start_color, char[][] arr) {
        int count = 0;
        for (int i = startx; i <= startx + 7; i++) {
            for (int j = starty; j <= starty + 7; j++) {
                if ((i + j) % 2 == 0) {
	                if (arr[i][j] != start_color) count++;
	            }
	            else {
	                if (arr[i][j] == start_color) count++;
	            }
            }
        }
        return count;
    }
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int m = in.nextInt();
	    in.nextLine();
	    char[][] arr = new char[n][m];
	    for (int i = 0; i < n; i++) {
	        String str = in.nextLine();
	        for (int j = 0; j < m; j++) {
	            arr[i][j] = str.charAt(j);
	        }
	    }
	    int min_count = m*n;
	    for (int i = 0; i + 7 < n; i++) {
	        for (int j = 0; j + 7 < m; j++) {
	            int count1 = repaint(i, j, 'W', arr);
	            int count2 = repaint(i, j, 'B', arr); // 첫번째 색을 바꾸는 조건도 확인
	            min_count = Math.min(min_count, Math.min(count1, count2));
	        }
	    }
	    System.out.println(min_count);
	}
}