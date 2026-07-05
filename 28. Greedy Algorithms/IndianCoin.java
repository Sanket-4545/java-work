
import java.util.*;
public class IndianCoin {
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,1000};

        Arrays.sort(coins, Collections.reverseOrder());
        int  countOfCoins = 0;
        int amount = 590;

        ArrayList<Integer>ans = new ArrayList<>();
        for(int i = 0; i<coins.length ;i++){
            if(coins[i]<= amount){
                while(coins[i]<= amount){
                    countOfCoins++;
                    amount -= coins[i];
                    ans.add(coins[i]);
                }
            }
        }
        System.out.println("Minimum number of coins required: " + countOfCoins);
        System.out.println("Coins used: " + ans);
    }
}
