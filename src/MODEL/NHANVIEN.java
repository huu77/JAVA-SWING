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
    private String tenDdangNhap;
    private  String password;
    private String hoten;
    private String idVaiTRo;

    public NHANVIEN() {
    }

    public NHANVIEN(String tenDdangNhap, String password, String hoten, String idVaiTRo) {
        this.tenDdangNhap = tenDdangNhap;
        this.password = password;
        this.hoten = hoten;
        this.idVaiTRo = idVaiTRo;
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
