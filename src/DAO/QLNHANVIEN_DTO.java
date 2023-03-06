/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import MODEL.VaiTro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import MODEL.NHANVIEN;

/**
 *
 * @author ginku
 */
//update NHANVIEN set HOTEN='aaa',CMND='223456789',GIOITINH='Nam',SDT='0366301981',DIACHI='ádsdsd',IDVAITRO='1' 
//where MANV='NV21' update querry
//insert nhanvien insert into NHANVIEN values('nv25','1','1','1','1','1','1')
public class QLNHANVIEN_DTO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<NHANVIEN> getAllNhanVien() {
        String querry = """
                       select *from NHANVIEN""";
        try {
            List<NHANVIEN> listNhanVien = new ArrayList<>();
            conn = sqlDao.getConnection();
            ps = conn.prepareStatement(querry);
            rs = ps.executeQuery();
            while (rs.next()) {
                if (!rs.getBoolean(8)) {
                    System.out.print(rs.getString(7)+"\n");
                    listNhanVien.add(new NHANVIEN(rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(7),
                            rs.getString(6),
                            rs.getString(5))
                    );
                }
            }
            return listNhanVien;
        } catch (SQLException e) {
        }
        return null;
    }

    public List<VaiTro> getAllTenVaiTro() {
        String querry = "select * FROM VAITRO";
        try {
            List<VaiTro> listVaiTro = new ArrayList<>();
            conn = sqlDao.getConnection();
            ps = conn.prepareStatement(querry);
            rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString(1);
                String ten = rs.getString(2);

                VaiTro vt = new VaiTro(id, ten);
                listVaiTro.add(vt);
            }
            return listVaiTro;
        } catch (SQLException e) {
        }
        return null;
    }

    public void InsertNhanVien(NHANVIEN nv) {
        String MANV = nv.getMANV();
        String tenNhanVien = nv.getHoten();
        String diaChi = nv.getDiaChi();
        String SDT = nv.getSDT();
        String CMND = nv.getCMND();
        String gioiTinh = nv.getGioiTinh();
        String idVaiTro = nv.getIdVaiTRo();
        String querry = "insert into NHANVIEN(MANV,HOTEN,CMND,GIOITINH,SDT,DIACHI,IDVAITRO,ISDELETE) values(?,?,?,?,?,?,?,?)"
                ;
        try {
            conn = sqlDao.getConnection();
            ps = conn.prepareStatement(querry);
            ps.setString(1, MANV);
            ps.setString(2, tenNhanVien);
            ps.setString(3, CMND);
            ps.setString(4, gioiTinh);
            ps.setString(5, SDT);
            ps.setString(6, diaChi);
            ps.setString(7, idVaiTro);
            ps.setString(8,"1");
            ps.executeUpdate();
            System.out.println("insert successfully!");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void insertTaiKhoan(NHANVIEN nv){
        String MANV = nv.getMANV();
        String MK = nv.getPassword();
        String tenDangNhap = nv.getTenDdangNhap();
        String querry = "insert into TAIKHOAN (MANV,TENDANGNHAP,MATKHAU,TRANGTHAI) values(?,?,?,1)";
        try {
            conn = sqlDao.getConnection();
            ps = conn.prepareStatement(querry);
            ps.setString(1, MANV);
            ps.setString(2, tenDangNhap);
            ps.setString(3, MK);
            ps.executeUpdate();
            System.out.println("insert successfully!");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void UpdateNhanVien(NHANVIEN nv) {
        String MANV = nv.getMANV();
        String tenNhanVien = nv.getHoten();
        String diaChi = nv.getDiaChi();
        String SDT = nv.getSDT();
        String vaiTro = nv.getIdVaiTRo();
        String CMND = nv.getCMND();
        String gioiTinh = nv.getGioiTinh();
        String querry = """
                       update NHANVIEN set HOTEN=?,CMND=?,GIOITINH=?,SDT=?,DIACHI=?,IDVAITRO=? 
                       where MANV=?""";
        try {
            conn = sqlDao.getConnection();
            ps = conn.prepareStatement(querry);
            ps.setString(7, MANV);
            ps.setString(1, tenNhanVien);
            ps.setString(2, CMND);
            ps.setString(3, gioiTinh);
            ps.setString(4, SDT);
            ps.setString(5, diaChi);
            ps.setString(6, vaiTro);
            ps.executeUpdate();
            System.out.println("update successfully!");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void UpdateTrangThaiXoaNhanVien(String MANV) {
        String querry = """
                       update NHANVIEN set ISDELETE=1
                       where MANV=?""";
        try {
            conn = sqlDao.getConnection();
            ps = conn.prepareStatement(querry);
            ps.setString(1, MANV);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

}
