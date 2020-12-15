package com.company;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.List;

interface Order {

    void addOrder(Item item);

    void deleteOrder(String name);
    int deleteAllWithName(String name);
    int TotalnumberofPosition();
    String TotalPosition();
    int TotalPrice();
    Item[] Lowtohighprice();



}
