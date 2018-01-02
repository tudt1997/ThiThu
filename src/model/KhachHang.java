/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tu
 */
public class KhachHang extends Nguoi {
    private String maKH;
    private String loaiKH;

    public KhachHang(String maKH, String loaiKH, String CMTND, String hoTen, String diaChi) {
        super(CMTND, hoTen, diaChi);
        this.maKH = maKH;
        this.loaiKH = loaiKH;
    }

    public KhachHang(String maKH, String loaiKH) {
        this.maKH = maKH;
        this.loaiKH = loaiKH;
    }
    
    public static ArrayList<KhachHang> docFile(String fileName) {
        ArrayList<KhachHang> dsKH = new ArrayList<>();
        
        try (Scanner sc = new Scanner(new File(fileName))) {
            while (sc.hasNext()) {                
                try {
                    String CMTND = sc.nextLine();
                    String hoTen = sc.nextLine();
                    String diaChi = sc.nextLine();
                    String maKH = sc.nextLine();
                    String loaiKH = sc.nextLine();
                    if (CMTND.equals("") || hoTen.equals("") || diaChi.equals("") || maKH.equals("") || loaiKH.equals(""))
                        throw new EmptyException();
                    dsKH.add(new KhachHang(maKH, loaiKH, CMTND, hoTen, diaChi));
                } catch (EmptyException e) {
                    
                }
            }
        } catch (Exception e) {
            
        }
        
        return dsKH;
    }

    @Override
    public String toString() {
        return maKH; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public Object[] toObject() {
        return new Object[] {CMTND, hoTen, diaChi, maKH, loaiKH};
    }
}
