public class stocks {

    public static int stock(int stock_price[]){
        int buy_price= Integer.MAX_VALUE; // +infinity
        int max_profit=0;

        for(int i=0;i<stock_price.length;i++){
            if(buy_price<stock_price[i]){
            int profit=stock_price[i]-buy_price;
            max_profit=Math.max(max_profit, profit);

            }
            else{
                buy_price=stock_price[i];
            }
        }
        return max_profit;
    }

    public static void main(String args[]){
        int stock_price[]= {2,5,4,8,1};
        System.out.println("maximum profit is "+ stock(stock_price) );

    }

}
