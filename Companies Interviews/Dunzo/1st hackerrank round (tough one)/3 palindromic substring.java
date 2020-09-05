/*
    DP 8 class (scaler batch 79 covered at last)
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'threePalindromicSubstrings' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING word as parameter.
     */

    public static List<String> threePalindromicSubstrings(String word) {
        // Write your code here
        int n=word.length();
        boolean[][] pal=new boolean[n][n];

        for(int i=0;i<n;i++) {
            pal[i][i]=true;
        }

        for(int i=0;i<n-1;i++) {
            if(word.charAt(i)==word.charAt(i+1))
                pal[i][i+1]=true;
        }

        for(int len=3;len<=n;len++) {
            for(int i=0;i+len-1<n;i++) {
                int j=i+len-1;
                if(word.charAt(i)==word.charAt(j))
                    pal[i][j]=pal[i+1][j-1];
            }
        }

        boolean[][] dp=new boolean[n+1][4];
        dp[n][0]=true;

        for(int j=1;j<=3;j++) {
            for(int i=n-1;i>=0;i--) {
                for(int k=i;k<n;k++) {
                    if(pal[i][k] && dp[k+1][j-1])
                        dp[i][j]=true;
                }
            }
        }

        List<String> ans=new ArrayList<>();
        if(dp[0][3]) {
            int firstSplitIndex=-1;
            for(int i=1;i<dp.length;i++) {
                if(dp[i][2] && pal[0][i-1]) {
                    firstSplitIndex=i;
                    ans.add(word.substring(0,i));
                    break;
                }
            }
            for(int i=firstSplitIndex+1;i<dp.length;i++) {
                if(dp[i][1] && pal[firstSplitIndex][i-1]) {
                    ans.add(word.substring(firstSplitIndex,i));
                    ans.add(word.substring(i,n));
                    break;
                }
            }
        } else {
            ans.add("Impossible");
        }
        return ans;
    }

}

public class Solution { 

}