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
     * Complete the 'getRich' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. LONG_INTEGER initialEnergy
     *  2. INTEGER_ARRAY energy
     *  3. INTEGER_ARRAY coins
     */
    
    public static int sumOfEnergy(List<Integer> coins) {
        int n=coins.size();
        int sum=0;
        for(int i=0;i<n;i++) {
            sum=sum+coins.get(i);
        }
        return sum;
    }

    public static int getRich(long initialEnergy, List<Integer> energy, List<Integer> coins) {
        int n=coins.size();
        if(initialEnergy>=n) {
            return sumOfEnergy(coins);
        }

        int m=(int)initialEnergy;
        int dp[][]=new int[n+1000][2000];

        for(int j=0;j<=1000;j++) {
            dp[n-1][j]=coins.get(n-1);
        }

        for(int i=n-2;i>=0;i--) {
              //if energy.get(i) is 0
            for(int j=0;j<=1000;j++) {
                if(j==0)
                    dp[i][0]=Math.max(coins.get(i),dp[i+1][Math.min(1000,energy.get(i)-1)]);
                else
                    dp[i][j]=Math.max(coins.get(i)+dp[i+1][j-1],dp[i+1][Math.min(1000,j+energy.get(i)-1)]);
            }
        }

        /*for(int i=n-1;i>=0;i--) {
            for(int j=0;j<=8;j++)
                System.out.print(dp[i][j]+" ");
            System.out.println(" ");
        }*/
        return dp[0][m];
    }

}
public class Solution {