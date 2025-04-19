import java.util.Scanner;

public class Main {
    static int N, M;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        
        backtrack(1, 0, new int[M]);
    }

    public static void backtrack(int start, int depth, int[] result) {
        if (depth == M) {
            for (int num : result) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= N; i++) {
            result[depth] = i;
            backtrack(i + 1, depth + 1, result);
        }
    }
}
