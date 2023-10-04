/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OTO;

import BaiTap2.DongVat;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QLOTO {
    ArrayList<Oto> listoto =new ArrayList<>();

    public QLOTO() {
         listoto.add(new Oto("01", "Roll","Vang", "Moi"));
     listoto.add(new Oto("02", "TOyota","Den", "Cu"));
     listoto.add(new Oto("03", "MINI","Do", "Moi"));
    }
    
    ArrayList<Oto> getlist(){   
    
    return listoto;
    }
    Boolean addNew(Oto oto){
    listoto.add(oto);
        return true;
    }
    
Boolean delete(int row){
  listoto.remove(row);
        return true;
    }
Boolean update(int row, Oto otonew){
  listoto.set(row, otonew);
        return true;
    }
    ArrayList<Oto> tim(String tencantom){
    ArrayList ketqua = new ArrayList();
        for (Oto oto : listoto) {
            if (oto.getTen().equals(tencantom)) {
                ketqua.add(oto);
            }
        }
        return ketqua;
    }
} 