package Notes.DynamicProgramming;

import java.util.Arrays;

public class DPbasics {
    public static void main(String[] args) {
        int sum = 19;
        int[] coins = {1, 5, 7};
        int ans = minCoins(sum, coins);
        System.out.println(ans);

        int[] dp = new int[sum+1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        int dpAns = minCoinsDP(sum, coins, dp);
        System.out.println(dpAns);
    }

    static int minCoins(int sum, int[] coins) {
        if(sum == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for (int coin : coins) {
            if (sum - coin >= 0) {
                int subAns = minCoins(sum - coin, coins);
                if (subAns != Integer.MAX_VALUE && subAns + 1 < ans) {
                    ans = subAns + 1;
                }
            }
        }
        return ans;
    }

    static int minCoinsDP(int sum, int[] coins, int[] dp) {
        if(sum == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for (int coin : coins) {
            if (sum - coin >= 0) {
                int subAns = 0;
                if(dp[sum-coin] != -1) {
                    subAns = dp[sum-coin];
                } else {
                    subAns = minCoinsDP(sum - coin, coins, dp);
                }
                if (subAns != Integer.MAX_VALUE && subAns + 1 < ans) {
                    ans = subAns + 1;
                }
            }
        }
        return dp[sum] = ans;
    }
}
