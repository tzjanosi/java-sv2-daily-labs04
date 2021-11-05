package day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stock {
    private List<Double> prices;
    private double epsilon;
    private List<ExtendedPrice> priceList = new ArrayList<>();

    public Stock(List<Double> prices, double epsilon) {
        this.prices = prices;
        this.epsilon = epsilon;
    }

    public List<ExtendedPrice> removeIdenticalValues(){
        List<ExtendedPrice> output = new ArrayList<>();
        ExtendedPrice extendedPrice=new ExtendedPrice(prices.get(0),0,null);
        output.add(extendedPrice);
        for(int i=1; i<prices.size(); i++){
            if(Math.abs(prices.get(i) - prices.get(i-1)) > epsilon){
                extendedPrice=new ExtendedPrice(prices.get(i),i,null);
                output.add(extendedPrice);
            }
        }
        return output;
    }

    public void createExtendedList(List<ExtendedPrice> tempPriceList){
        ExtendedPrice extendedPrice;

        extendedPrice=tempPriceList.get(0);
        if(tempPriceList.get(1).getPrice()>tempPriceList.get(0).getPrice()){
            extendedPrice.setExtremity(Extremities.MIN);
        }
        else{
            extendedPrice.setExtremity(Extremities.MAX);
        }
        priceList.add(extendedPrice);

        for(int i=1; i<tempPriceList.size()-1;i++){
            extendedPrice=tempPriceList.get(i);
            if(tempPriceList.get(i-1).getPrice()>tempPriceList.get(i).getPrice() && tempPriceList.get(i+1).getPrice()>tempPriceList.get(i).getPrice()){
                extendedPrice.setExtremity(Extremities.MIN);
                priceList.add(extendedPrice);
            }
            if(tempPriceList.get(i-1).getPrice()<tempPriceList.get(i).getPrice() && tempPriceList.get(i+1).getPrice()<tempPriceList.get(i).getPrice()){
                extendedPrice.setExtremity(Extremities.MAX);
                priceList.add(extendedPrice);
            }
        }

        extendedPrice=tempPriceList.get(tempPriceList.size()-1);
        if(tempPriceList.get(tempPriceList.size()-2).getPrice()>tempPriceList.get(tempPriceList.size()-1).getPrice()){
            extendedPrice.setExtremity(Extremities.MIN);
        }
        else{
            extendedPrice.setExtremity(Extremities.MAX);
        }
        priceList.add(extendedPrice);
    }
    public double maxProfit(){
        double maxGain=0;
        double actualGain;
        for(int i=0; i<priceList.size();i++){
            if(priceList.get(i).getExtremity()==Extremities.MIN){
                for(int j=i+1; j<priceList.size();j++){
                    if(priceList.get(j).getExtremity()==Extremities.MAX){
                        actualGain=priceList.get(j).getPrice()-priceList.get(i).getPrice();
                        if(actualGain>maxGain){
                            maxGain=actualGain;
                        }
                    }
                }
            }
        }
        return maxGain;
    }
    public static void main(String[] args) {
        Stock stock = new Stock(Arrays.asList(1.23,4.35,0.23,4.0,8.4),0.00001);
        stock.createExtendedList(stock.removeIdenticalValues());
        System.out.println(stock.maxProfit());  //8.17

        Stock stock2 = new Stock(Arrays.asList(12.0,2.0,8.0,4.0),0.00001);
        stock2.createExtendedList(stock2.removeIdenticalValues());
        System.out.println(stock2.maxProfit()); //6.0
    }
}
