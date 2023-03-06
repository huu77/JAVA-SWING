/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author HUU77
 */
public class NHANVIEN {

    private String MANV, hoten, CMND, gioiTinh, diaChi, SDT, idVaiTRo ,isDelete;
    private String tenDdangNhap;
    private String password;
 
 

    public NHANVIEN() {
    }

    public NHANVIEN(String MANV, String hoten, String CMND, String gioiTinh, String diaChi, String SDT, String idVaiTRo, String tenDdangNhap, String password) {
        this.MANV = MANV;
        this.hoten = hoten;
        this.CMND = CMND;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.SDT = SDT;
        this.idVaiTRo = idVaiTRo;
        this.tenDdangNhap = tenDdangNhap;
        this.password = password;
        
    }

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public NHANVIEN(String MANV, String HOTEN, String CMND, String GIOITINH, String DIACHI, String SDT) {
        this.MANV = MANV;
        this.hoten = HOTEN;
        this.CMND = CMND;
        this.gioiTinh = GIOITINH;
        this.diaChi = DIACHI;
        this.SDT = SDT;
    }
     public NHANVIEN(String MANV, String HOTEN, String CMND, String GIOITINH, String TENVAITRO, String DIACHI, String SDT) {
        this.MANV = MANV;
        this.hoten = HOTEN;
        this.CMND = CMND;
        this.gioiTinh = GIOITINH;
        this.diaChi = DIACHI;
        this.SDT = SDT;
        this.idVaiTRo =TENVAITRO;
    }

    public NHANVIEN(String tenDdangNhap, String password, String hoten, String idVaiTRo ,String isDelete) {
        this.tenDdangNhap = tenDdangNhap;
        this.password = password;
        this.hoten = hoten;
        this.idVaiTRo = idVaiTRo;
        this.isDelete=isDelete;
    }
    

    public String getTenDdangNhap() {
        return tenDdangNhap;
    }

    public void setTenDdangNhap(String tenDdangNhap) {
        this.tenDdangNhap = tenDdangNhap;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getIdVaiTRo() {
        return idVaiTRo;
    }

    public void setIdVaiTRo(String idVaiTRo) {
        this.idVaiTRo = idVaiTRo;
    }

}
