package gr.elepapaio.storeSimulation;

public class SimpleRetailStore implements IStore {
    private double totalBuyBalance=1000;
    private double totalSellBalance=0;

    public SimpleRetailStore(double totalBuyBalance, double totalSellBalance) {
        this.totalBuyBalance = totalBuyBalance;
        this.totalSellBalance = totalSellBalance;
    }

    public SimpleRetailStore(){
    }

    @Override
    public void buy(Product product) {
        if (product.getPriceWhenBuy()<=totalBuyBalance){
            totalBuyBalance-=product.getPriceWhenBuy();
            System.out.println(product.toString() + " was successfully bought");
        }
        else{
            System.out.println("Buying " + product.toString() + " not possible, not enough balance!");
        }
    }

    @Override
    public void sell(Product product) {
        totalSellBalance+=product.getPriceWhenSell();
        System.out.println(product.toString() + " was successfully sold");
    }

    @Override
    public double getRevenue() {
        return totalSellBalance;
    }
}
