package com.galvanize;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private  double totalPrice = 0.0;

    private List<Item> items = new ArrayList<>();

    private List<String> itemQuantities = new ArrayList<>();

    private List<String> onSaleItems = new ArrayList<>();

    private List<String> itemizedList = new ArrayList<>();


    public void AddItem(Item item){
        add(item);
        totalPrice += item.getPrice();
    }

    public void AddItem(Item item, int n){
        add(item);
        for(int i=1; i<=n; i++){
            totalPrice += item.getPrice();
        }
        itemQuantities.add(item.getName() + " - " +  n);
    }

    public void add(Item item){
        items.add(item);
        itemizedList.add(item.getName() + " - $" + item.getPrice());
        if(item.getOnSale()){
            onSaleItems.add(item.getName() + " - $" + item.getPrice());
        }

    }

    public List<String> ItemQuantities() {
        return itemQuantities;
    }

    public List<String> OnSaleItems() {
        return onSaleItems;
    }

    public List<String> ItemizedList() {
        return itemizedList;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<String> getItemQuantities() {
        return itemQuantities;
    }

    public void setItemQuantities(List<String> itemQuantities) {
        this.itemQuantities = itemQuantities;
    }

}
