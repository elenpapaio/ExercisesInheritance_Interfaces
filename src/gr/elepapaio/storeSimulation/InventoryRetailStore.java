package gr.elepapaio.storeSimulation;

import java.util.ArrayList;
import java.util.List;

public class InventoryRetailStore implements IStore {
    private List<Product> products;
    private List<Product> soldProducts;


    public InventoryRetailStore(){
        products = new ArrayList<>();
        soldProducts = new ArrayList<>();
    }

    @Override
    public void buy(Product product) {
        products.add(product);
        System.out.println(product.toString() + " was successfully bought");
    }

    @Override
    public void sell(Product product) {
        if (products.contains(product)){
            products.remove(product);
            soldProducts.add(product);
            System.out.println(product.toString() + " was successfully sold");
        }
        else{
            System.out.println(product.toString() + " is out of stock");
        }
    }

    @Override
    public double getRevenue() {
        return soldProducts.stream().map(p -> p.getPriceWhenSell()).reduce(0., Double::sum);
    }

    public List<Product> getInventory(){
        return products;
    }

    public void reset(){
        products.clear();
    }
}
