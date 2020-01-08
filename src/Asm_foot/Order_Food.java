/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderfood;

import java.util.Scanner;

public class Order_Food {

    private static Scanner scanner = new Scanner(System.in);
    private static FoodList foodList = new FoodList("customer beauty");
    private static Menu_List menuList = new Menu_List("for customer a ");

    public static void main(String[] args) {
        // TODO code application logic here
        menuList.addMenu(new Food("pasta", 1));
        menuList.addMenu(new Food("babecue", 1));
        menuList.addMenu(new Food("Sausages", 1));
        menuList.addMenu(new Food("Burgers", 1));
        menuList.addMenu(new Food("Steak", 1));
        menuList.addMenu(new Food("Lasagne", 1));

        foodList.addFood(new Food(1, "pasta", 1000));
        foodList.addFood(new Food(2, "Lasagne", 1000));
        foodList.addFood(new Food(1, "Lasagne", 1000));

        boolean quit = false;
        while (!quit) {
            System.out.println("Enter actions: (6 to show all action)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    menuList.displayMemu();
                    break;
                case 2:
                    addNewFood();
                    break;
                case 3:
                    foodList.printFoods();
                    break;
                case 4:
                    removeFood();
                    break;
                case 5:
                    updateAmount();
                    break;
                case 6:
                    printAction();
                    break;

            }
        }
        //updateFood();
        //removeFood();
        //addNewFood();
        // updateAmount();

    }

    private static void updateAmount() {
        System.out.println("Enter the name");
        String name = scanner.nextLine();
        Food existingFood = foodList.queryFood(name);
        if (existingFood == null) {
            System.out.println("Food not found ");
            return;
        }
        System.out.println("Enter amount");
        int newAmount = scanner.nextInt();
        existingFood.setAmount(newAmount);
        System.out.println("you just change your bill");

    }

    private static void addNewFood() {
        System.out.println("Enter new food name : ");
        String name = scanner.nextLine();
        System.out.println("Enter amount ");
        int amount = scanner.nextInt();
        System.out.println("Enter price");
        int price = scanner.nextInt();
        Food food = new Food(price, name, amount);
        if (foodList.addFood(food)) {
            System.out.println("new food added : name= " + name + " price = " + price + " amount " + amount);

        } else {
            System.out.println("Cannot add, " + name + " already on contact  list");
        }
    }

    private static void updateFood() {
        System.out.println("Enter existing food name : ");
        String name = scanner.nextLine();
        Food existingFood = foodList.queryFood(name);

        if (existingFood == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new food name");
        String newName = scanner.nextLine();
        System.out.println("Enter new price");
        int newPrice = scanner.nextInt();
        System.out.println("Enter new amount");
        int newAmount = scanner.nextInt();
        Food food = new Food(newPrice, newName, newAmount);

    }

    private static void removeFood() {
        System.out.println("Enter existing food name: ");
        String name = scanner.nextLine();
        Food existingFood = foodList.queryFood(name);
        if (existingFood == null) {
            System.out.println("Food not found");
            return;
        }
        if (foodList.removeFood(existingFood)) {
            System.out.println("successfully deleted ");
        } else {
            System.out.println("Error deleted food");
        }
    }

    private static void printAction() {
        System.out.println("0 - to shutting up"
                + "\n1 - to show menu "
                + "\n2 - to add food"
                + "\n3 - to show bill"
                + "\n4 - to delete food"
                + "\n5 - to change amount of the foods"
                + "\n6 - to show all action");
        System.out.println("choose your actions: ");
    }

}