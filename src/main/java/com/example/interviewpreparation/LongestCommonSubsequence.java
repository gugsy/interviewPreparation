package com.example.interviewpreparation;

public class LongestCommonSubsequence {
    
    // Function to find the longest common subsequence
    public static String findLCS(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        // Create a 2D array to store lengths of LCS
        int[][] dp = new int[m + 1][n + 1];

        // Build the dp array from bottom up
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Recover the longest common subsequence from the dp table
        StringBuilder lcs = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                // If the current character in both strings is the same, it is part of LCS
                lcs.append(s1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        // Since we built the LCS from the end, reverse it before returning
        return lcs.reverse().toString();
    }

    public static void main(String[] args) {
        String s1 = "ABCBDAB";
        String s2 = "BDCAB";

        String lcs = findLCS(s1, s2);
        System.out.println("Longest Common Subsequence: " + lcs);
    }
}
