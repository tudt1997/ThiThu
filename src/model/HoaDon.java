/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Tu
 */
public class HoaDon {
    private int maHD;
    private String thoiGian;
    private ArrayList<Pair<MatHang, Integer>> dsCap;

    public HoaDon(int maHD, String thoiGian, ArrayList<Pair<MatHang, Integer>> dsCap) {
        this.maHD = maHD;
        this.thoiGian = thoiGian;
        this.dsCap = dsCap;
    }

    
}
