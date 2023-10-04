/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd18405;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QLSV {

    Scanner sc = new Scanner(System.in);
    public ArrayList<SinhVien> listSinhVien = new ArrayList<>();

    public void nhap() {

        System.out.println("Nhap ma");
        String ma = sc.nextLine();
        System.out.println("Nhap Ho ten");
        String ten = sc.nextLine();
        System.out.println("Nhap dia chi");
        String diachi = sc.nextLine();
        System.out.println("Nhap tuoi");

        int tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Lop");
        String lop = sc.nextLine();
        System.out.println("Nhap diem");
        float diem = Float.parseFloat(sc.nextLine());
        SinhVien sinhvien = new SinhVien(ma, ten, diachi, tuoi, lop, diem);
        listSinhVien.add(sinhvien);
    }

    public ArrayList<SinhVien> xuatSinhVien() {

        return listSinhVien;

    }

    public ArrayList<SinhVien> tim(String tenCanTim) {

        ArrayList<SinhVien> ketqua = new ArrayList<>();
        for (SinhVien sinhVien : listSinhVien) {
            if (sinhVien.getHoTen().equals(tenCanTim)) {
                ketqua.add(sinhVien);
            }
        }
        return ketqua;
    }

    public ArrayList<SinhVien> timdiem(float diem2) {
        ArrayList<SinhVien> ketquadiem = new ArrayList<>();
        for (SinhVien sinhVien : listSinhVien) {
            if (sinhVien.getDiem() > diem2) {
                ketquadiem.add(sinhVien);
            }
        }
        return ketquadiem;
    }

}
