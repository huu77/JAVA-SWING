/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

public class TaiKhoan {
    String MANV,tenDangNhap, matKhau;
    boolean trangThaiXoa,trangThai;

    public TaiKhoan(String MANV, String tenDangNhap, String matKhau, boolean trangThai, boolean trangThaiXoa) {
        this.MANV = MANV;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
    
        this.trangThai = trangThai;
        this.trangThaiXoa = trangThaiXoa;
    }

    public boolean isTrangThaiXoa() {
        return trangThaiXoa;
    }

    public void setTrangThaiXoa(boolean trangThaiXoa) {
        this.trangThaiXoa = trangThaiXoa;
    }

    public TaiKhoan() {
    }

    public TaiKhoan(String MANV, String TENDANGNHAP, String MATKHAU,boolean TRANGTHAI) {
        this.MANV = MANV;
        this.tenDangNhap = TENDANGNHAP;
        this.matKhau = MATKHAU;
        this.trangThai=TRANGTHAI;
    }

    public TaiKhoan(String TENDANGNHAP, String MATKHAU) {
        this.tenDangNhap = TENDANGNHAP;
        this.matKhau = MATKHAU;
    }

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }



    public boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
}
