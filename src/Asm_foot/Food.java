/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderfood;

/**
 *
 * @author Admin
 */
public class Food {

    private int amount;

    public Food(int amount, String food, int money) {
        this.amount = amount;
        this.food = food;
        this.money = money;
    }
    public Food(String food,int money){
        this.food=food;
        this.money=money;
    }
    public Food(int amount,String food){
        this.amount=amount;
        this.food=food;
        
    }
    public Food (int amount){
        this.amount=amount;
    }

    /**
     * Get the value of amount
     *
     * @return the value of amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Set the value of amount
     *
     * @param amount new value of amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    private String food;

    /**
     * Get the value of food
     *
     * @return the value of food
     */
    public String getFood() {
        return food;
    }

    /**
     * Set the value of food
     *
     * @param food new value of food
     */
    public void setFood(String food) {
        this.food = food;
    }

    private int money;

    /**
     * Get the value of money
     *
     * @return the value of money
     */
    public int getMoney() {
        return money;
    }

    /**
     * Set the value of money
     *
     * @param money new value of money
     */
    public void setMoney(int money) {
        this.money = money;
    }

}