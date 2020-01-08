/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderfood;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class FoodList {

    private String myFood;

    private ArrayList<Food> myFoods;

    public FoodList(String myFood) {
        this.myFood = myFood;
        this.myFoods = new ArrayList<Food>();

    }

    public int findFood(Food food) {
        return this.myFoods.indexOf(food);

    }

    public int findFoods(Food food) {
        for (int i = 0; i < this.myFoods.size(); i++) {
            Food contact = this.myFoods.get(i);
            if (contact.getFood().equals(food.getFood())) {
                //System.out.print("your name exist in the list with the order: "+i);
                return i;
            }
        }
        return -1;
    }

    public boolean addFood(Food food) {

        if (findFoods(food) >= 0) {
            //System.out.print("your name exist in the list with the order: ");
            Food foodSame = myFoods.get(findFoods(food));
            foodSame.setAmount(foodSame.getAmount() + food.getAmount());
            System.out.println("Food is already ");
            return false;

        } else {
            myFoods.add(food);
            return true;
        }

    }

    public boolean updateAmount(Food food, int i) {
        if (findFoods(food) >= 0) {
            Food foodSame = myFoods.get(findFoods(food));
            foodSame.setAmount(i);
            return false;

        } else {
            System.out.println("no name food in your bill please add to change");
            return true;
        }

    }

    public int sum() {
        int bill = 0;
        for (int i = 0; i < myFoods.size(); i++) {
            Food count = myFoods.get(i);
            bill += (count.getMoney() * count.getAmount());

        }
        return bill;
    }

    public boolean updateFood(Food oldFood, Food newFood) {
        int foundPosition = findFood(oldFood);
        if (foundPosition < 0) {
            System.out.println("Food was not found ");
            return false;
        }
        this.myFoods.set(foundPosition, newFood);
        System.out.println(oldFood.getFood() + "was replace with " + newFood.getFood());
        return true;
    }

    public boolean removeFood(Food food) {
        int foundPosition = findFood(food);
        if (foundPosition < 0) {
            System.out.println("Food was not  found ");
            return false;
        }
        this.myFoods.remove(food);
        System.out.println(food.getFood() + " was deleted ");
        return true;
    }

    public int findFood(String contactName) {
        for (int i = 0; i < this.myFoods.size(); i++) {
            Food contact = myFoods.get(i);
            if (contact.getFood().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public void printFoods() {
        System.out.println("Contact List " + this.myFood);
        int bill=0;
        for (int i = 0; i < this.myFoods.size(); i++) {
            System.out.println((i + 1) + " " + myFoods.get(i).getFood() + " -> " + myFoods.get(i).getMoney() + " " + myFoods.get(i).getAmount());
            Food count = myFoods.get(i);
            bill += (count.getMoney() * count.getAmount());
        }
        System.out.println("your charge is : "+bill);
    }

    public Food queryFood(String name) {
        int position = findFood(name);
        if (position >= 0) {
            return this.myFoods.get(position);
        }
        return null;

    }

    public String queryFood(Food food) {
        if (findFood(food) >= 0) {
            return food.getFood();
        }
        return null;
    }

    void updateFood(String pasta, String noodle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object get(Food existingFood) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}