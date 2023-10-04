/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sd18405;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SD18405 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QLSV ql = new QLSV();
        Scanner sc = new Scanner(System.in);
        //Nhap
        while (true) {
            ql.nhap();
            System.out.println("Ban muon nhap tiep kh");
            String check = sc.nextLine();
            if (check.equals("no")) {
                break;
            }
        }
        //Xuat
        ArrayList<SinhVien> List = ql.xuatSinhVien();
        for (SinhVien sinhVien : List) {
            System.out.println(sinhVien.toString());
        }

        //Tim Kiem 
        System.out.println("Nhap ten can tim");
        String tenCanTim = sc.nextLine();
        ArrayList<SinhVien> ketqua = ql.tim(tenCanTim);
        if (ketqua.isEmpty()) {
            System.out.println("Khong tim thay ket qua");
        } else {
            for (SinhVien sinhVien : ketqua) {
                System.out.println(sinhVien.toString());
            }
        }
//Timdiem
      
        System.out.println("Moi nhap diem:");
        float diem1 = sc.nextFloat();
        ArrayList<SinhVien> ketquadiem = ql.timdiem(diem1);
        
       
         if(ketquadiem.isEmpty()) {
             System.out.println("Khong cop ket qua");
         }
         else{
             for (SinhVien sinhVien : ketquadiem) {
                System.out.println(sinhVien.toString());
            }}
            
        }
    }


//nhap ten va in ra ten sv 
