/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import DAO.sqlDao;

import MODEL.LOAIXE_MODEL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class LOAIXE_DTO {

    public static List<LOAIXE_MODEL> getListLOAIXE() {
        List<LOAIXE_MODEL> listLOAIXE = new ArrayList<>();
        try {
            String query = "SELECT * From LOAIXE";
            Connection con = sqlDao.getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                LOAIXE_MODEL lg = new LOAIXE_MODEL(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));

                listLOAIXE.add(lg);

            }
        } catch (SQLException e) {
        }
        return listLOAIXE;
    }

    public static void updateloaixe(String a, String b, String c, int d) {
        try {
            String query = "UPDATE LOAIXE SET GIATIEN ='" + a + "' ,TIENTHUPHI ='" + b + "' , PHIMATTHE ='" + c + "' WHERE IDLOAIXE='" + d + "'";;
            Connection con = sqlDao.getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
           

        } catch (SQLException e) {
        }
    }
}
