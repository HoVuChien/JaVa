/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QuanLyNhanVien {
    ArrayList<NhanVien> listnhanvien = new ArrayList<>();

    public QuanLyNhanVien() {
    listnhanvien.add(new NhanVien ("nv1","Chien","Nam","SD"));
    listnhanvien.add(new NhanVien ("nv2","Bac","Nam","1"));
    listnhanvien.add(new NhanVien ("nv1","coi","Nu","SD"));
    }

    ArrayList<NhanVien> getlist(){
  
    return listnhanvien;
    }
    
    Boolean addNew(NhanVien nhanvien){
    listnhanvien.add(nhanvien);
    return true;
    }
   Boolean delete(int vitri){
   listnhanvien.remove(vitri);
   return true;
   }
   Boolean update(int vitri , NhanVien nhanvienNew){
   listnhanvien.set(vitri, nhanvienNew);
   return true;
   }
     
}
