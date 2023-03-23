package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    public boolean addedCheese;
    public  boolean addedTopping;
    public boolean paperBagAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) this.price = 300;
        else  this.price = 400;

       bill =  "Base Price Of The Pizza: "+this.price+'\n';
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!addedCheese) {
            addedCheese = true;
            this.price += 80;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!addedTopping) {
            addedTopping = true;
            if (isVeg)
                this.price += 70;

            else
                this.price += 120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!paperBagAdded) {
            paperBagAdded = true;
            this.price += 20;
        }
    }

    public String getBill(){
        // your code goes here
        if(addedCheese){
            this.bill+= "Extra Cheese Added: 80" + '\n';
        }
        if(addedTopping) {
            if(isVeg)
                this.bill += "Extra Toppings Added: 70" + '\n';
            else
                this.bill += "Extra Toppings Added: 120" + '\n';
        }
        if(paperBagAdded){
            this.bill += "Paperbag Added: 20" + '\n';
        }
        this.bill+="Total Price: " + this.price + '\n';
        return this.bill;
    }
}
