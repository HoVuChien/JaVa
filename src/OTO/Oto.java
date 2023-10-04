/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OTO;

/**
 *
 * @author Admin
 */
public class Oto {
    private String ma;
    private String Ten;
    private String Mau;
 private String trangthai;

    public Oto() {
    }

    public Oto(String ma, String Ten, String Mau, String trangthai) {
        this.ma = ma;
        this.Ten = Ten;
        this.Mau = Mau;
     
        this.trangthai = trangthai;
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

    public String getMau() {
        return Mau;
    }

    public void setMau(String Mau) {
        this.Mau = Mau;
    }

  
    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }
    
   
    
}
