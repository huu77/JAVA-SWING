/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import DAO.sqlDao;
import MODEL.NHANVIEN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import MODEL.TaiKhoan;

/**
 *
 * @author ginku
 */
public class QLTAIKHOAN_DTO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<TaiKhoan> getAllTaiKhoan() {
        String querry = """
                       select TAIKHOAN.*,NHANVIEN.ISDELETE
                                              from TAIKHOAN
                                              join NHANVIEN on NHANVIEN.MANV = TAIKHOAN.MANV""";
        try {
            List<TaiKhoan> listTaiKhoan = new ArrayList<>();
            conn = sqlDao.getConnection();
            ps = conn.prepareStatement(querry);
            rs = ps.executeQuery();
            while (rs.next()) {

                listTaiKhoan.add(new TaiKhoan(rs.getString(3),
                        rs.getString(1),
                        rs.getString(2),
                        rs.getBoolean(4), rs.getBoolean(5))
                );
            }
            return listTaiKhoan;
        } catch (SQLException e) {
        }
        return null;
    }
    public void activeTaiKhoan(String MANV){
        String querry ="""
                       update NHANVIEN set ISDELETE = 0 where NHANVIEN.MANV = ?
                       """;                    
        try {
            conn = sqlDao.getConnection();
            ps = conn.prepareStatement(querry);
            ps.setString(1,MANV);
            ps.executeUpdate();
            }catch (SQLException e) {
        }
        } 
    public void doiMK(String MANV,String MK){
        String querry ="""
                       update TAIKHOAN set MATKHAU = ? where TAIKHOAN.MANV = ?
                       """;                    
        try {
            conn = sqlDao.getConnection();
            ps = conn.prepareStatement(querry);
            ps.setString(2,MANV);
            ps.setString(1,MK);
            ps.executeUpdate();
            }catch (SQLException e) {
        }
    }
    }

