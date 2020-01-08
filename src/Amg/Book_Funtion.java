/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amg;


import java.util.Scanner;

public class Book_Funtion {
    public static void main(String[] args) {

//        du lieu sach
        Book_management List = new Book_management();
        List.addList("php");
        List.addList("Laravel");
        List.addList("Java");
        List.addList("Tinh nhat phai");
        List.addList("THuy thuy mat trang");
        List.addList("wibu");
        List.addList("nhanh");
        List.addList("cham");


        System.out.println("Thu vien cua chung toi co");
        List.displayList();


        Book_management nguoi_muon = new Book_management();
        String Ten_Dang_Nhap = Book_management.save().getUser();
        String Pass = Book_management.save().getMasv();


        String Ten_Dang_Nhap2 = Book_management.save1().getUser();
        String Pass2 = Book_management.save1().getMasv();

        String Ten_Dang_Nhap3 = Book_management.save2().getUser();
        String Pass3 = Book_management.save2().getMasv();


        Scanner s = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên sách bạn muốn mượn");
        String muon = s.nextLine();
        Boolean has = List.search(muon);

        Scanner myObj = new Scanner(System.in);
        System.out.println("Moi nhap ma sinh vien");
        String sothe1 = myObj.nextLine();
        System.out.println("Passwork");
        String mapin1 = myObj.nextLine();

        if (sothe1.equals(Ten_Dang_Nhap) && mapin1.equals(Pass) || sothe1.equals(Ten_Dang_Nhap2) && mapin1.equals(Pass2)
                || sothe1.equals(Ten_Dang_Nhap3) && mapin1.equals(Pass3)) {
            System.out.println("Dang nhap thanh cong");

            if (has) {
                List.remove(muon);
                System.out.println("Sach ban da muon la\n" + muon);
//                List.remove(muon);
                System.out.println("So sach con lai:\n");
                List.displayList();
            } else {
                System.out.println("deo co");
            }
            Scanner myObj1 = new Scanner(System.in);
            System.out.println("Ban muốn tìm sách nào?");
            String sothe4 = myObj1.nextLine();


//            List.seachMovie(sothe4);
//            if (sothe4.equals(List)) {
//                System.out.println("Sach nay van con");
//                List.seachMovie(sothe4);
//            } else {
//                System.out.println("Mission fail");
//            }

        }
    }

}