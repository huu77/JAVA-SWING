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
    private String ngayDK;
    private String ngayHH;
    private String idtinhtrang;
    private String tienDaThu;

    public DANG_KI_HINH_THUC_XE() {
    }

    public DANG_KI_HINH_THUC_XE(String bienSoXe, String tenHinhThucGui) {
        this.bienSoXe = bienSoXe;
        this.tenHinhThucGui = tenHinhThucGui;
    }

   

    public DANG_KI_HINH_THUC_XE(String bienSoXe, String tenHinhThucGui, String ngayDK, String ngayHH, String tienDaThu) {
        this.bienSoXe = bienSoXe;
        this.tenHinhThucGui = tenHinhThucGui;
        this.ngayDK = ngayDK;
        this.ngayHH = ngayHH;
        this.tienDaThu = tienDaThu;
    }

    public DANG_KI_HINH_THUC_XE(String idthe, String bienSoXe, String idHinhThucGui, String ngayDK, String ngayHH, String tienDaThu, String idtinhtrang) {
        this.bienSoXe = bienSoXe;
        this.idHinhThucGui = idHinhThucGui;
        this.idthe = idthe;
        this.ngayDK = ngayDK;
        this.ngayHH = ngayHH;
        this.idtinhtrang = idtinhtrang;
        this.tienDaThu = tienDaThu;
    }

    public DANG_KI_HINH_THUC_XE(String bienSoXe, String tenHinhThucGui, String idHinhThucGui, String idthe) {
        this.bienSoXe = bienSoXe;
        this.tenHinhThucGui = tenHinhThucGui;
        this.idHinhThucGui = idHinhThucGui;
        this.idthe = idthe;
    }

    public String getNgayDK() {
        return ngayDK;
    }

    public void setNgayDK(String ngayDK) {
        this.ngayDK = ngayDK;
    }

    public String getNgayHH() {
        return ngayHH;
    }

    public void setNgayHH(String ngayHH) {
        this.ngayHH = ngayHH;
    }

    public String getIdtinhtrang() {
        return idtinhtrang;
    }

    public void setIdtinhtrang(String idtinhtrang) {
        this.idtinhtrang = idtinhtrang;
    }

    public String getTienDaThu() {
        return tienDaThu;
    }

    public void setTienDaThu(String tienDaThu) {
        this.tienDaThu = tienDaThu;
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
