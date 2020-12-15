package com.company;

final public class Drink implements  Item{
   private  int price;
    private String name;
     private String discription;


     Drink(String name,String discription)
     {
this.name=name;
this.discription=discription;
     }


     Drink(int price,String name,String discription)
     {
         this.price=price;
         this.name=name;
         this.discription=discription;
     }


    @Override
    public int price() {
        return price;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String discription() {
        return discription;
    }
}
