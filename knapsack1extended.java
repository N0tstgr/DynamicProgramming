package DynamicProgramming;

import java.util.Scanner;

public class Knapsack1 {

   public static  int Solve(int n,  int W, int[] value, int[] weight ){
       int[][] dp = new int[n+1][W+1];
       for(int i = 0; i<=n; i++){
           for( int j = 0; j<=W; j++){
               dp[n][W] = 0;
           }


       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] value = new int[N + 1];
        int[] weight = new int[N + 1];

        for (i = 1; i <= N; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
        }
        System.out.println(N, W, value, weight);
    }

    // memoization for the knap
}
