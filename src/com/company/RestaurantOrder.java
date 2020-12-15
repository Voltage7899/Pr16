package com.company;

import java.util.ArrayList;

public class RestaurantOrder implements Order{
    ArrayList<Item> list2 = new ArrayList();

    RestaurantOrder() {
        ArrayList<Item> list1 = new ArrayList();
    }

    RestaurantOrder(Item item) {

        list2.add(item);
    }

    @Override
    public void addOrder(Item item) {
        list2.add(item);
    }

    @Override
    public void deleteOrder(String name) {
        for (Item item : list2) {
            if (list2.contains(item.name()) & item.name() == name) {
                list2.remove(item);
                break;
            }
        }
    }

    @Override
    public int deleteAllWithName(String name) {
        int i = 0;
        for (Item item : list2) {
            if (list2.contains(item.name()) & item.name() == name) {
                list2.remove(item);
                i++;
            }
        }
        return i;
    }

    @Override
    public int TotalnumberofPosition() {
        return list2.size();
    }

    @Override
    public String TotalPosition() {
        Item[] arr;

        return null;
    }

    @Override
    public int TotalPrice() {
        int sum = 0;
        for (Item item : list2) {
            sum = item.price() + sum;
        }

        return sum;
    }

    @Override
    public Item[] Lowtohighprice() {
        Item[] arrofPos = null;

        for (int i = 0; i < list2.size() - 1; i++) {

            arrofPos[i] = list2.get(i);
        }
        boolean sorted = false;
        Item temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arrofPos.length - 1; i++) {
                if (arrofPos[i].price() > arrofPos[i + 1].price()) {
                    temp = arrofPos[i];
                    arrofPos[i] = arrofPos[i + 1];
                    arrofPos[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return arrofPos;
    }
}
