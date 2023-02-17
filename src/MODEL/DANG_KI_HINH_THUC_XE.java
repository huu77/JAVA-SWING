/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author HUU77
 */
public class DANG_KI_HINH_THUC_XE {

    private String bienSoXe;
    private String tenHinhThucGui;
    private String idHinhThucGui;
    private String idthe;

    public DANG_KI_HINH_THUC_XE() {
    }

    public DANG_KI_HINH_THUC_XE(String bienSoXe, String tenHinhThucGui, String idHinhThucGui, String idthe) {
        this.bienSoXe = bienSoXe;
        this.tenHinhThucGui = tenHinhThucGui;
        this.idHinhThucGui = idHinhThucGui;
        this.idthe = idthe;
    }

    public String getBienSoXe() {
        return bienSoXe;
    }

    public void setBienSoXe(String bienSoXe) {
        this.bienSoXe = bienSoXe;
    }

    public String getTenHinhThucGui() {
        return tenHinhThucGui;
    }

    public void setTenHinhThucGui(String tenHinhThucGui) {
        this.tenHinhThucGui = tenHinhThucGui;
    }

    public String getIdHinhThucGui() {
        return idHinhThucGui;
    }

    public void setIdHinhThucGui(String idHinhThucGui) {
        this.idHinhThucGui = idHinhThucGui;
    }

    public String getIdthe() {
        return idthe;
    }

    public void setIdthe(String idthe) {
        this.idthe = idthe;
    }
    
}
