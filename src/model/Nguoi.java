/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Tu
 */
public class Nguoi {
    protected String CMTND;
    protected String hoTen;
    protected String diaChi;

    public Nguoi(String CMTND, String hoTen, String diaChi) {
        this.CMTND = CMTND;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }

    public Nguoi() {
        this("", "", "");
    }
    
    
}
