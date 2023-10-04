/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd18405;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a:");
        int a=0;
        try {
              a = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException ex) {
            System.out.println("a sai");
        }
     
        System.out.println("so a la :"+a);
    }
}
