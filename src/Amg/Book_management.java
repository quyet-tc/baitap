/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM;

import java.util.ArrayList;

public class Book_management {

 private  String User;
 private  String Masv;
 private String sach;
 private  int soluong;

    public Book_management() {

    }

    public static Book_management save(){
        Book_management book =new Book_management();
        book.setUser("Hoang Trong Ha");
        book.setMasv("123");
        return book;
    }
    public static Book_management save1(){
        Book_management book =new Book_management();
        book.setUser("Nguyen Xuan Huy");
        book.setMasv("1234");
        return book;
    }
    public static Book_management save2(){
        Book_management book =new Book_management();
        book.setUser("Tran Diem Quynh");
        book.setMasv("12345");
        return book;
    }
    public Book_management(String user, String masv,  int soluong) {
        User = user;
        Masv = masv;

        this.soluong = soluong;
    }
    public String getUser() {
        return User;
    }
    public void setUser(String user) {
        User = user;
    }
    public String getMasv() {
        return Masv;
    }
    public void setMasv(String masv) {
        Masv = masv;
    }
    public String getSach() {
        return sach;
    }
    public void setSach(String sach) {
        this.sach = sach;
    }
    public int getSoluong() {
        return soluong;
    }
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public  void displayList(){
        for (int i = 0; i < sachList.size(); i++) {
            System.out.println(sachList.get(i));
        }
//        System.out.println("Thu vien dang co:"+getSach()+"Items"+getSach());
//        for(int i=0;i<getSach().length();i++){
//            System.out.println("Movie"+(i+1)+getSach().length(i+1));
//        }
    }
    private ArrayList<String> sachList = new ArrayList<>();
    public void addList(String move) {
        sachList.add(move);
    }



    public boolean search(String move) {
        for (int i = 0; i < sachList.size(); i++) {
            if (sachList.get(i).equals(move)){
                return true;
            }
        }
        return false;
    }
    public void remove(String move) {
        sachList.remove(move);
    }

    public String seachMovie(String Search){
        int po = sachList.indexOf(Search);
        if(po >0){
            return sachList.get(po);
        }
        return null;
    }
//        int po = sachList.indexOf(Search);
//        if(po >0){
//            return sach.get(po);
//        }
//        return null;
//    }
}