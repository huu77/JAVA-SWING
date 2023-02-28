/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author HUU77
 */
public class THE1_MODEL {
    private String BienSoXe;
    private String IDTHE;
    private String trangThai;

    public THE1_MODEL() {
    }

    public THE1_MODEL(String BienSoXe, String IDTHE, String trangThai) {
        this.BienSoXe = BienSoXe;
        this.IDTHE = IDTHE;
        this.trangThai = trangThai;
    }

    public String getBienSoXe() {
        return BienSoXe;
    }

    public void setBienSoXe(String BienSoXe) {
        this.BienSoXe = BienSoXe;
    }

    public String getIDTHE() {
        return IDTHE;
    }

    public void setIDTHE(String IDTHE) {
        this.IDTHE = IDTHE;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
}
