/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author ADMIN
 */
public class LOAIXE_MODEL {
    private String IDLOAIXE;
    private String TENLOAIXE;
    private String GIATIEN;
    private String TIENTHUPHI;
    private String PHIMATTHE;

    public LOAIXE_MODEL(String IDLOAIXE, String TENLOAIXE, String GIATIEN, String TIENTHUPHI, String PHIMATTHE) {
        this.IDLOAIXE = IDLOAIXE;
        this.TENLOAIXE = TENLOAIXE;
        this.GIATIEN = GIATIEN;
        this.TIENTHUPHI = TIENTHUPHI;
        this.PHIMATTHE = PHIMATTHE;
    }

    public String getIDLOAIXE() {
        return IDLOAIXE;
    }

    public void setIDLOAIXE(String IDLOAIXE) {
        this.IDLOAIXE = IDLOAIXE;
    }

    public String getTENLOAIXE() {
        return TENLOAIXE;
    }

    public void setTENLOAIXE(String TENLOAIXE) {
        this.TENLOAIXE = TENLOAIXE;
    }

    public String getGIATIEN() {
        return GIATIEN;
    }

    public void setGIATIEN(String GIATIEN) {
        this.GIATIEN = GIATIEN;
    }

    public String getTIENTHUPHI() {
        return TIENTHUPHI;
    }

    public void setTIENTHUPHI(String TIENTHUPHI) {
        this.TIENTHUPHI = TIENTHUPHI;
    }

    public String getPHIMATTHE() {
        return PHIMATTHE;
    }

    public void setPHIMATTHE(String PHIMATTHE) {
        this.PHIMATTHE = PHIMATTHE;
    }
    
}

