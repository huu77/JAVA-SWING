/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import DAO.sqlDao;
import MODEL.LOAICATRUC;
import MODEL.NHIEMVU;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;
import java.util.List;
import MODEL.CATRUC;
import MODEL.TaiKhoan;


/*querry
DECLARE @max_value INT
SELECT @max_value = MAX([NO.]) FROM CATRUC
DBCC CHECKIDENT('CATRUC', RESEED, @max_value);
INSERT INTO CATRUC(NGAYTRUC, IDLOAICATRUC, IDCATRUC) 
VALUES ('2024-03-02', 'LCT2', CONCAT('CT', (SELECT MAX([NO.]) FROM CATRUC)+1))
/**
 *
 * @author ginku
 */
public class QLCATRUC_DTO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
 public List<CATRUC> getAllCaTruc() {
     LocalDate currentDate= LocalDate.now();
    
        String querry = """
                       SELECT CATRUC.IDCATRUC,CATRUC.NGAYTRUC,LOAICATRUC.TENCATRUC,PHANCONG.MANV,NHIEMVU.TENNHIEMVU
                                              FROM CATRUC
                                              JOIN PHANCONG ON PHANCONG.IDCATRUC = CATRUC.IDCATRUC
                                              join NHIEMVU on NHIEMVU.IDNHIEMVU = PHANCONG.IDNHIEMVU
                                              join LOAICATRUC on LOAICATRUC.IDLOAICATRUC = CATRUC.IDLOAICATRUC""";
        try {
            List<CATRUC> listCaTruc = new ArrayList<>();
            conn = sqlDao.getConnection();
            ps = conn.prepareStatement(querry);
            rs = ps.executeQuery();
                                            System.out.print("current date:"+currentDate);

            while (rs.next()) {
                if(rs.getDate(2).toLocalDate().isAfter(currentDate)){
                     System.out.print(rs.getDate(2).toLocalDate()+"\n");
              
                     listCaTruc.add(new CATRUC(rs.getString(1),
                        rs.getDate(2).toLocalDate(),
                        rs.getString(3),
                        rs.getString(4), rs.getString(5))
                );
                }
                
            }
            return listCaTruc;
        } catch (SQLException e) {
        }
        return null;
    }
 public List<LOAICATRUC> getAllLoaiCaTruc() {

        String querry = """
                       SELECT * FROM LOAICATRUC""";
        try {
            List<LOAICATRUC> listCaTruc = new ArrayList<>();
            conn = sqlDao.getConnection();
            ps = conn.prepareStatement(querry);
            rs = ps.executeQuery();
            while (rs.next()) {
                listCaTruc.add(new LOAICATRUC(rs.getTime(1),
                        rs.getTime(2),
                        rs.getString(3),
                        rs.getString(4))
                );
            }
            return listCaTruc;
        } catch (SQLException e) {
        }
        return null;
    }
  public List<NHIEMVU> getAllNhiemVu() {
        String querry = """
                       SELECT * FROM NHIEMVU""";
        try {
            List<NHIEMVU> list = new ArrayList<>();
            conn = sqlDao.getConnection();
            ps = conn.prepareStatement(querry);
            rs = ps.executeQuery();
            while (rs.next()) {
                   list.add(new NHIEMVU(rs.getString(1),rs.getString(2))
                   );
            }
            return list;
        } catch (SQLException e) {
        }
        return null;
    }
  public void insertNewCaTruc(Date ngayTruc, String idLoaiCaTruc,String MANV,String idNhiemVu){
      java.sql.Date sqlDate = new java.sql.Date(ngayTruc.getTime());
      System.out.print(sqlDate);
      
      
      
      
      
      
      
      
      
      
      String querry ="""
                     DECLARE @max_value INT
                     SELECT @max_value = MAX([NO.]) FROM CATRUC
                     DBCC CHECKIDENT('CATRUC', RESEED, @max_value);
                     INSERT INTO CATRUC(NGAYTRUC, IDLOAICATRUC, IDCATRUC) 
                     VALUES (?, ?, CONCAT('CT', (SELECT MAX([NO.]) FROM CATRUC)+1))
                     INSERT INTO PHANCONG(IDCATRUC,MANV,IDNHIEMVU)
                     VALUES(CONCAT('CT', (SELECT MAX([NO.]) FROM CATRUC)),?,?)
                     """;
       try {
           conn = sqlDao.getConnection();
           ps= conn.prepareStatement(querry);
           ps.setDate(1, (java.sql.Date)sqlDate);
           ps.setString(2,idLoaiCaTruc);
           ps.setString(3,MANV);
           ps.setString(4,idNhiemVu);
          
           ps.executeUpdate();
           System.out.println("insert successfully!");
       } catch (SQLException e) {
            System.out.println(e);
       }
  }
}
