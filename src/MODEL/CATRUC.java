/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.time.LocalDate;

/**
 *
 * @author LENOVO
 */
public class CATRUC {
    public String IDCaTruc;
    public LocalDate ngayTruc;
    public String tenCaTruc,MANV,tenNhiemVu;

    public CATRUC(String IDCaTruc, LocalDate ngayTruc, String tenCaTruc, String MANV, String tenNhiemVu) {
        this.IDCaTruc = IDCaTruc;
        this.ngayTruc = ngayTruc;
        this.tenCaTruc = tenCaTruc;
        this.MANV = MANV;
        this.tenNhiemVu = tenNhiemVu;
    }

    public String getIDCaTruc() {
        return IDCaTruc;
    }

    public void setIDCaTruc(String IDCaTruc) {
        this.IDCaTruc = IDCaTruc;
    }

    public LocalDate getNgayTruc() {
        return ngayTruc;
    }

    public void setNgayTruc(LocalDate ngayTruc) {
        this.ngayTruc = ngayTruc;
    }

    public String getTenCaTruc() {
        return tenCaTruc;
    }

    public void setTenCaTruc(String tenCaTruc) {
        this.tenCaTruc = tenCaTruc;
    }

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public String getTenNhiemVu() {
        return tenNhiemVu;
    }

    public void setTenNhiemVu(String tenNhiemVu) {
        this.tenNhiemVu = tenNhiemVu;
    }
    

}
