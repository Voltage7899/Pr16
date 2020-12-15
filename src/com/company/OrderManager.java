package com.company;
import java.util.HashMap;

import java.util.ArrayList;
import java.util.Map;

public class OrderManager {

    private HashMap<Integer, RestaurantOrder> restaurant;
    private HashMap<String, InternetOrder> internet;

    public OrderManager(){
        restaurant = new HashMap<>();
        internet = new HashMap<>();
    }

    public boolean add(int tableNumber, RestaurantOrder order) throws Exception {
        if (restaurant.containsKey(tableNumber)){
            throw new Exception ("OrderAlreadyAddedException");
        }
        else {
            restaurant.put(tableNumber, order);
            return true;
        }
    }
    public boolean add(String address, InternetOrder order){
        internet.put(address, order);
        return true;
    }

    public void removeRestaurantOrder(int tableNumber){
        restaurant.remove(tableNumber);
    }

    public void removeInternetOrder(String address){
        internet.remove(address);
    }

    public RestaurantOrder getRestaurantOrder(int tableNumber) {
        return restaurant.get(tableNumber);
    }

    public InternetOrder getInternetOrder(String address) {
        return internet.get(address);
    }

    public double RestaurantOrdersCostSummary(){
        double total = 0;
        for(int key : restaurant.keySet()){
            total += internet.get(key).TotalPrice();
        }
        return total;
    }
    public double InternetOrdersCostSummary(){
        double total = 0;
        for(String key : internet.keySet()){
            total += internet.get(key).TotalPrice();
        }
        return total;
    }
    public void addDish_RestaurantOrder(int tableNumber, Dish dish){
        restaurant.get(tableNumber).addOrder(dish);
    }
    public void addDrink_RestaurantOrder(int tableNumber, Drink drink){
        restaurant.get(tableNumber).addOrder(drink);
    }
    public void addDish_InternetOrder(String address, Dish dish){
        internet.get(address).addOrder(dish);
    }
    public void addDrink_InternetOrder(String address, Drink drink){
        internet.get(address).addOrder(drink);
    }

    public String getAllOrders(){
        String s = "";
        if (!restaurant.isEmpty()) {
            s += "Заказ в ресторане:\n";
            for (int key : restaurant.keySet()) {
                s += "стол " + key + "  суммa : " + restaurant.get(key).TotalPrice() + "\n";
            }
        }
        if (!internet.isEmpty()) {
            s += "Заказ в интернете:\n";
            for (String key : internet.keySet()) {
                s += "адресу: " + key + " суммa : " + internet.get(key).TotalPrice() + "\n";
            }
        }
        return s;
    }






}
