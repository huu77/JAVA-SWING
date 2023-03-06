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
import MODEL.RAVAO;
import MODEL.XE_MODEL;
import java.sql.SQLException;


/**
 *
 * @author ADMIN
 */
public class RAVAO_DTO {
    public static List<RAVAO> getListRAVAO(){
        List<RAVAO> listRAVAO = new ArrayList<>();
        try {
            String query = "SELECT BIENSOXE, TENHINHTHUC, TGVAO, TGRA, SOTIEN, MANV, TENCATRUC FROM DANGKY_HINHTHUCGUI , HINHTHUCGUI, GUIXE, PHANCONG,CATRUC,LOAICATRUC WHERE DANGKY_HINHTHUCGUI.IDDANGKY=GUIXE.IDDANGKY AND GUIXE.IDCATRUC=PHANCONG.IDCATRUC AND CATRUC.IDCATRUC = GUIXE.IDCATRUC AND CATRUC.IDLOAICATRUC=LOAICATRUC.IDLOAICATRUC";
            Connection con = sqlDao.getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                RAVAO lg = new RAVAO(rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));

                listRAVAO.add(lg);

            }
        } catch (SQLException e) {
        }
        return listRAVAO;
    }
    public static void main(String[] args)   {

        System.out.println(THE_DTO.getListThe());
    }


}