/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTAp1;

/**
 *
 * @author Admin
 */
public class NhanVien {
    private String maNhanVien;
    private String tenNhanVien;
    private int luongCoBan;
    private String phongBAn;
    private String chucvu;
    private int namSinh;
    private boolean gioiTinh;

    public NhanVien() {
    }

    public NhanVien(String maNhanVien, String tenNhanVien, int luongCoBan, String phongBAn, String chucvu, int namSinh, boolean gioiTinh) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.phongBAn = phongBAn;
        this.chucvu = chucvu;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public String getPhongBAn() {
        return phongBAn;
    }

    public void setPhongBAn(String phongBAn) {
        this.phongBAn = phongBAn;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNhanVien=" + maNhanVien + ", tenNhanVien=" + tenNhanVien + ", luongCoBan=" + luongCoBan + ", phongBAn=" + phongBAn + ", chucvu=" + chucvu + ", namSinh=" + namSinh + ", gioiTinh=" + gioiTinh + '}';
    }
    
    
}
