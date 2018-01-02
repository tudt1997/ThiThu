/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tu
 */
public class MatHang {
    private String maMH;
    private String tenMH;
    private int sl;
    private double gia;

    public MatHang(String maMH, String tenMH, int sl, double gia) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.sl = sl;
        this.gia = gia;
    }
    
    public static ArrayList<MatHang> docFile(String fileName) {
        ArrayList<MatHang> dsMH = new ArrayList<>();
        
        try (Scanner sc = new Scanner(new File(fileName))) {
            while (sc.hasNext()) {                
                try {
                    String maMH = sc.nextLine();
                    String tenMH = sc.nextLine();
                    int sl = Integer.parseInt(sc.nextLine());
                    double gia = Double.parseDouble(sc.nextLine());
                    if (maMH.equals("") || tenMH.equals(""))
                        throw new EmptyException();
                    dsMH.add(new MatHang(maMH, tenMH, sl, gia));
                } catch (EmptyException | NumberFormatException e) {
                    
                }
            }
        } catch (Exception e) {
            
        }
        
        return dsMH;
    }

    public String getMaMH() {
        return maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    @Override
    public String toString() {
        return maMH; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public Object[] toObject() {
        return new Object[] {maMH, tenMH, sl, gia};
    }
}
