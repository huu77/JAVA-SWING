/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;
import AES.AES;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;
import DAO.sqlDao;
import MODEL.THE;
import MODEL.XE_MODEL;
import java.sql.SQLException;



/**
 *
 * @author ADMIN
 */
public class THE_DTO {
    public static List<THE> getListThe(){
        List<THE> listTHE = new ArrayList<>();
        try {
            String query = "SELECT DANGKY_HINHTHUCGUI.IDTHE,BIENSOXE,TRANGTHAI,TENHINHTHUC FROM DANGKY_HINHTHUCGUI,THE,HINHTHUCGUI  Where DANGKY_HINHTHUCGUI.IDTHE=THE.IDTHE ;";
            Connection con = sqlDao.getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                THE lg = new THE(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));

                listTHE.add(lg);

            }
        } catch (SQLException e) {
        }
        return listTHE;
    }
    public static void main(String[] args)   {

        System.out.println(THE_DTO.getListThe());
    }


}
