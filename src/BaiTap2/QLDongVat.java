/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap2;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QLDongVat {
    ArrayList<DongVat> listDongVat = new ArrayList<>();

    public QLDongVat() {
           listDongVat.add(new DongVat("1", "Dat", "Cho" ,"Cai"));
        listDongVat.add(new DongVat("2", "Ngu", "MEO" ,"Duc"));
        listDongVat.add(new DongVat("3", "Vl", "Cho" ,"Cai"));
    }
    
    ArrayList<DongVat> getlist(){
 
    return listDongVat;
    }
    Boolean addNew(DongVat dongvat){
    listDongVat.add(dongvat);
        return true;
    }
    Boolean delete(int viTri){
    listDongVat.remove(viTri);
    return true;
        
    }
    Boolean update(int vitri , DongVat dongvatnew){
    listDongVat.set(vitri, dongvatnew);
    return true;
    }
    
    ArrayList<DongVat> search (String tencantim){
    ArrayList<DongVat> listketqua = new ArrayList<>();
        for (DongVat dongVat : listDongVat) {
            if (dongVat.getTen().equals(tencantim)) {
                listketqua.add(dongVat);
            }
        }
        return  listketqua;
    }
}
