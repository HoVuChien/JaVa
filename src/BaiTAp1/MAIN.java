/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTAp1;

import com.sun.source.tree.WhileLoopTree;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MAIN {
    public static void main(String[] args) {
         QLNHANVIEN ql = new QLNHANVIEN();
    Scanner sc = new Scanner(System.in);
    
        while (true) {            
            ql.nhap();
            System.out.println("Ban Muon nhap tiep kh");
            String check =sc.nextLine();
            if (check.equals("no")) {
                break;
            }
        }
        ArrayList<NhanVien> xuat = ql.xuat();
        for (NhanVien nhanVien : xuat) {
            System.out.println(nhanVien.toString());
        }
        System.out.println("Moin nhap Phong ban");
        String phongban = sc.nextLine();
        
       ArrayList<NhanVien> timphong = ql.timphong(phongban);
        if (timphong.isEmpty()) {
              System.out.println("Khong tim thay ket qua");
        }else{
            for (NhanVien nhanVien : timphong) {
                System.out.println(nhanVien.toString());
            }
                }        
         ArrayList<NhanVien> xuat2 = ql.xuat();
        for (NhanVien nhanVien : xuat2) {
            System.out.println(nhanVien.toString()+"Tuoi:"+(2023-nhanVien.getNamSinh()));
        }
    }
   
}
