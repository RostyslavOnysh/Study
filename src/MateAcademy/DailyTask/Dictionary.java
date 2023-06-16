package MateAcademy.DailyTask;


public class Dictionary {
    public static void main(String[] args) {
        String[] words = {"java", "python", "php", "ruby"};
        Dictionary dictionary = new Dictionary(words);

        String term = "heaven";
        String closestWord = dictionary.findMostSimilar(term);
        System.out.println("Closest word to \"" + term + "\": " + closestWord);
    }

    private final String[] words;

    public Dictionary(String[] words) {
        this.words = words;
    }

    public String findMostSimilar(String term) {
        int minDistance = Integer.MAX_VALUE;
        String closestWrld = "";
        for (String word : words) {
            int distence = levenshteinDistance(word, term);
            if (distence < minDistance) {
                minDistance = distence;
                closestWrld = word;
            }
        }
        return closestWrld;
    }

    public static int levenshteinDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int j = 1; j <= n; j++) {
            dp[0][j] = j;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1],
                            Math.min(dp[i - 1][j], dp[i][j - 1]));
                }
            }
        }
        return dp[m][n];
    }
}

