package ArrayProblems;

public class IMP_BestTimeToBuyAndSellAStock {
    public static void main(String[] args) {
        int a[] = {7,1,5,3,6,4};
        int toBuy = 0;
        int toSell = 0;
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(min > a[i]) {
                min = a[i];
                toBuy = i;
            }
            if(profit < (a[i]-min)){
                profit = a[i]-min;
                toSell = i;
            }
        }

        System.out.println("To Buy : Day - " + ++toBuy);
        System.out.println("To Sell : Day - " + ++toSell);
        System.out.println("Profit - " + profit);


    }
}
