package Oops_Programming;

import java.lang.foreign.SegmentAllocator;

public class Product implements Taxable {
    private String prod_id;
    private double price;
    private double quantity;

    public Product(String prod_id, double price, double quantity){
        this.prod_id = prod_id;
        this.price = price;
        this.quantity = quantity;
    }

    public double calcTax(){

        double val = this.price * (salesTax/100);
        System.out.println("The price of the "+this.prod_id+" is : "+this.price);
        System.out.println("The Sales Tax is : "+val);
        System.out.println();
        return val;
    }

}
