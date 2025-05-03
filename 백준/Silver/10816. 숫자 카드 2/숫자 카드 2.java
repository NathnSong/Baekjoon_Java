/*
백준 -10816번
숫자 카드를 보고 상근이가 가진N개에서 
M개의 정수가 몇개나 있는지 구하는 프로그램
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<Integer, Integer> cardCount = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            cardCount.put(num, cardCount.getOrDefault(num, 0) + 1);
        }

        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            int query = sc.nextInt();
            sb.append(cardCount.getOrDefault(query, 0)).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}