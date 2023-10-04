/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap2;

/**
 *
 * @author Admin
 */
public class DongVat {
    private String ma;
   private String Ten;
   private String loai;
   private String giongloai;

    public DongVat() {
    }

    public DongVat(String ma, String Ten, String loai, String giongloai) {
        this.ma = ma;
        this.Ten = Ten;
        this.loai = loai;
        this.giongloai = giongloai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getGiongloai() {
        return giongloai;
    }

    public void setGiongloai(String giongloai) {
        this.giongloai = giongloai;
    }
   
   }
