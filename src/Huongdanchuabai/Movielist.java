/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Huongdanchuabai;

import java.util.ArrayList;

/**
 *
 * @author caube
 */
public class Movielist {
    private ArrayList<String> movieList = new ArrayList<>();
    
   /**
    * 
    * @param movie 
    */
    public void addMovie(String movie){
        movieList.add(movie);
    }
    
    public void displayList(){
        System.out.println("you have " + movieList.size() + "items in favorite list");
        for(int i = 0; i <movieList.size(); i++){
            System.out.println("Movie " + (i + 1) + movieList.get(i));
        }
    }
    public void updateMovie(int index, String movie){
        movieList.set(index, movie);
        System.out.println("Updated ");
        System.out.println("Movie " + (index + 1) + " " + movie);
    }
    public void removeMovie(int index){
        String movie = movieList.get(index);
        movieList.remove(index);
        System.out.println("Removed " + movie);
    }
    public String findMovie(String search){
        int position = movieList.indexOf(search);
        if(position > 0){
            return movieList.get(position);
        }
        return null;
    }
    
    public static void main(String[] args) {
        System.out.println("     Movie List ");
        System.out.println("--------------------");
        
        Movielist List = new Movielist();
        List. addMovie("Titamic");
        List. addMovie("Catch me if you can");
        List. addMovie("Nothing Hills");
        List. addMovie("Cheaspeack Shore");
        List. addMovie("You have got email");
        
        List.displayList();
        
      
        
    }
}