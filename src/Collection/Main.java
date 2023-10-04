/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); 
        list.add(1);
         list.add(2);
          list.add(2);
          
        System.out.println(list.toString());
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(2);
        set.add(1);
        set.add(2);
        
         System.out.println(set.toString());
    }
}
