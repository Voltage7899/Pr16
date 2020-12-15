package com.company;

public class Main {
    public static void main(String [] args)
    {
        Dish pasta=new Dish(500,"pasta","With tomatoes");
        Drink Vino=new Drink(1000,"RedKiss","For 18+");
        InternetOrder firstclient=new InternetOrder();
        firstclient.addOrder(pasta);
        firstclient.addOrder(Vino);
        System.out.println(firstclient.TotalPrice());












    }
}
