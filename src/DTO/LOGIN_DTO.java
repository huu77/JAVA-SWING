package DTO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HUU77
 */
import AES.AES;
import DAO.sqlDao;
import MODEL.LOGIN_MODEL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;
public class LOGIN_DTO {
     protected final String secret="Thanhuu204768@gmail.com";
    
    /**
     *
     * @param username
     * @param password
     * @return
     */
    public static List<LOGIN_MODEL> getLoginUp(String username, String password){
       List<LOGIN_MODEL> listTK = new ArrayList<>();
       AES aes=new AES();
      try {
            String query = "select * from TAIKHOAN where TENDANGNHAP='"+username+"' and MATKHAU='"+password+"';";
            Connection con = sqlDao.getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                LOGIN_MODEL lg=new LOGIN_MODEL(rs.getString(1), rs.getString(2));
                System.out.println(rs.getString(1)+"vaf "+ rs.getString(2));
                listTK.add(lg);
                 
            }
      } catch (Exception e) {
      }
      return listTK;
  }
    public static void main(String[] args) {
    LOGIN_DTO lgDTO=new LOGIN_DTO();
    //test
//    String user="abcc";
//    String pass="E10ADC3949BA59ABBE56E057F20F883E";
//      lgDTO.getLoginUp(user,pass );


//cac tai khoan test abcc:huucaca2002 va admin:huu123
//em test bao mat cua thuat toan AES chuyen mk tu sql len va ma hoa no thu
//AES a=new AES();
//       String x= a.encrypt("huu123",lgDTO.secret);
//       String y=a.decrypt(x, lgDTO.secret);
//        System.out.println(x+" va "+y);

    }
 
}
