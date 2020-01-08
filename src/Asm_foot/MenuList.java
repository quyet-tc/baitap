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
public class MenuList {

    private String menuName;
    ArrayList<Food> menuList;

    public MenuList(String menumber) {
        this.menuName = menuName;
        this.menuList = new ArrayList<Food>();
    }

    public void addMenu(Food food) {
        menuList.add(food);
    }

    public void displayMemu() {
        System.out.println("dishes    price");
        for (int i = 0; i < menuList.size(); i++) {
            System.out.println(menuList.get(i).getFood() + ": " + menuList.get(i).getMoney());
            
        }
    }
    
}