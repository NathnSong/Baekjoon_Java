import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        
        String[] words = new String[n];
        
        for (int i = 0; i < n; i++) {
            words[i] = in.nextLine(); //일단 word들 모두 입력받는다.
        }
        
        //정렬
        Arrays.sort(words, new Comparator<String>() {
            public int compare(String s1, String s2) {
                // 길이가 같은 경우에는 사전 순 정렬
                if (s1.length() == s2.length()) return s1.compareTo(s2); 
                return s1.length() - s2.length();
            }
        });
        
        // 같은 단어는 바로 전과 비교하여 제거
        System.out.println(words[0]);
        for (int i = 1; i < n; i++) {
            if (!words[i].equals(words[i - 1])) {
                System.out.println(words[i]);
            }
        }
                    
    }
}