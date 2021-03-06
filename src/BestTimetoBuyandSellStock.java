public class BestTimetoBuyandSellStock {
    public static void main(String[] args){
        String test = null;
        testObject testObject = new testObject();
        testObject.setNum(5);
        System.out.println(testObject.getNum().getClass());

        //int[] prices = {7,6,4,3,1};

        //System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices){
        int anw=0, minValue=prices[0];
        for(int i=1;i<prices.length;i++){
            anw = Math.max(anw, prices[i] - minValue);
            minValue = Math.min(minValue, prices[i]);
        }
        return anw;
    }
}
