/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTAp1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QLNHANVIEN {
     Scanner sc = new Scanner(System.in);
     public ArrayList<NhanVien> listNhanVien = new ArrayList<>();
     public void nhap(){
     System.out.println("Nhap ma");
        String ma = sc.nextLine();
        System.out.println("Nhap Ho ten");
        String ten = sc.nextLine();
         System.out.println("Nhap lUong");
         int luong = Integer.parseInt(sc.nextLine());
         System.out.println("Phong Ban");
         String phongban = sc.nextLine();
         System.out.println("Chac Vu");
         String chucvu = sc.nextLine();
         System.out.println("nam Sinh");
         int namsinh = Integer.parseInt(sc.nextLine());
         System.out.println("Gioi Tinh");
         boolean gioitinh = Boolean.parseBoolean(sc.nextLine());
         NhanVien nhanvien = new NhanVien(ma,ten,luong,phongban,chucvu,namsinh,gioitinh);
         listNhanVien.add(nhanvien);
     }
     public ArrayList<NhanVien> xuat (){
     return listNhanVien;
     }
     public ArrayList<NhanVien> timphong(String phongban){
     ArrayList<NhanVien> Phongban = new ArrayList<>();
         for (NhanVien nhanVien : listNhanVien) {
             if (nhanVien.getPhongBAn().equals(phongban)) {
               Phongban.add(nhanVien);
          
             }
         }
         return Phongban;
     }
}
