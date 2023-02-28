/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import DAO.sqlDao;
import MODEL.DANG_KI_HINH_THUC_XE;
import MODEL.THE1_MODEL;
import MODEL.XE_MODEL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class THONG_KE_DTO {

    public static List<DANG_KI_HINH_THUC_XE> getDS(String text1, String text2) {
        List<DANG_KI_HINH_THUC_XE> listXe = new ArrayList<>();
        try {
            String query = "select BIENSOXE ,TENHINHTHUC ,NGAYDK ,NGAYKT,TIENDATHU from DANGKY_HINHTHUCGUI as dk ,HINHTHUCGUI as htg where dk.IDHINHTHUC=htg.IDHINHTHUC and NGAYDK>=   '" + text1 + "' and NGAYKT <= '" + text2 + "'";
            Connection con = sqlDao.getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                DANG_KI_HINH_THUC_XE lg = new DANG_KI_HINH_THUC_XE(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));

                listXe.add(lg);

            }
        } catch (SQLException e) {
        }
        return listXe;
    }

    public static String SumTienXe(String text1, String text2) {
        String tien = "";
        try {
            String query = "select sum(SOTIEN) \n"
                    + "from XE,DANGKY_HINHTHUCGUI, HINHTHUCGUI, GUIXE \n"
                    + "where XE.BIENSOXE=DANGKY_HINHTHUCGUI.BIENSOXE \n"
                    + "and GUIXE.IDDANGKY = DANGKY_HINHTHUCGUI.IDDANGKY \n"
                    + "and DANGKY_HINHTHUCGUI.IDHINHTHUC = HINHTHUCGUI.IDHINHTHUC  \n"
                    + "and TENHINHTHUC='Ngày' and NGAYDK>=   '" + text1 + "' and NGAYKT <= '" + text2 + "' and XE.IDLOAIXE=1;";

            Connection con = sqlDao.getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                tien = rs.getString(1);

            }
        } catch (SQLException e) {
        }

        return tien;
    }

    public static String SumTienOTo(String text1, String text2) {
        String tien = "";
        try {
            String query = "select sum(SOTIEN) \n"
                    + "from XE,DANGKY_HINHTHUCGUI, HINHTHUCGUI, GUIXE \n"
                    + "where XE.BIENSOXE=DANGKY_HINHTHUCGUI.BIENSOXE \n"
                    + "and GUIXE.IDDANGKY = DANGKY_HINHTHUCGUI.IDDANGKY \n"
                    + "and DANGKY_HINHTHUCGUI.IDHINHTHUC = HINHTHUCGUI.IDHINHTHUC  \n"
                    + "and TENHINHTHUC='Ngày' and NGAYDK>=   '" + text1 + "' and NGAYKT <= '" + text2 + "' and XE.IDLOAIXE=2;";
            Connection con = sqlDao.getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                tien = rs.getString(1);

            }
        } catch (SQLException e) {
        }

        return tien;
    }

    public static String TheNullxe(String text1, String text2) {
        String theNull = "";
        try {
            String query = "select count(THE.IDTHE) from DANGKY_HINHTHUCGUI,THE where DANGKY_HINHTHUCGUI.IDTHE=THE.IDTHE "
                    + "and THE.TRANGTHAI is null\n"
                    + "and  NGAYDK >= '" + text1 + "' and NGAYKT <= '" + text2 + "'  ";
            Connection con = sqlDao.getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                theNull = rs.getString(1);

            }
        } catch (SQLException e) {
        }

        return theNull;
    }

    public static String RAVAO(String text1, String text2, String date, String id) {
        String X = "";
        try {
            String query = "select count(XE.BIENSOXE) \n"
                    + "from XE,DANGKY_HINHTHUCGUI, HINHTHUCGUI, GUIXE \n"
                    + "where XE.BIENSOXE=DANGKY_HINHTHUCGUI.BIENSOXE \n"
                    + "and GUIXE.IDDANGKY = DANGKY_HINHTHUCGUI.IDDANGKY \n"
                    + "and DANGKY_HINHTHUCGUI.IDHINHTHUC = HINHTHUCGUI.IDHINHTHUC  \n"
                    + "and TENHINHTHUC='"+date+"' and NGAYKT>= '"+text1+"'and NGAYKT<='"+text2+"' and XE.IDLOAIXE="+id+"";
            Connection con = sqlDao.getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                X = rs.getString(1);

            }
        } catch (SQLException e) {
        }

        return X;
    }

    public static void main(String[] args) {

    }
}
