/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

import java.util.Date;
import java.sql.Time;

/**
 *
 * @author ginku
 */
public class LOAICATRUC {
    Time TGBatDau, TGKetThuc;
    String IDLoaiCaTuc, tenCaTruc;

    public LOAICATRUC(Time TGBatDau, Time TGKetThuc, String IDLoaiCaTuc, String tenCaTruc) {
        this.TGBatDau = TGBatDau;
        this.TGKetThuc = TGKetThuc;
        this.IDLoaiCaTuc = IDLoaiCaTuc;
        this.tenCaTruc = tenCaTruc;
    }

    public Time getTGBatDau() {
        return TGBatDau;
    }

    public void setTGBatDau(Time TGBatDau) {
        this.TGBatDau = TGBatDau;
    }

    public Time getTGKetThuc() {
        return TGKetThuc;
    }

    public void setTGKetThuc(Time TGKetThuc) {
        this.TGKetThuc = TGKetThuc;
    }

    public String getIDLoaiCaTuc() {
        return IDLoaiCaTuc;
    }

    public void setIDLoaiCaTuc(String IDLoaiCaTuc) {
        this.IDLoaiCaTuc = IDLoaiCaTuc;
    }

    public String getTenCaTruc() {
        return tenCaTruc;
    }

    public void setTenCaTruc(String tenCaTruc) {
        this.tenCaTruc = tenCaTruc;
    }

  

  
}
