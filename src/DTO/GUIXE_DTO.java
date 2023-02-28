package DTO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author HUU77
 */
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

public class GUIXE_DTO {

    //GET ALL LIST XE IN SQL
    public static List<XE_MODEL> getALLXE() {
        List<XE_MODEL> listXe = new ArrayList<>();
        try {
            String query = "SELECT BIENSOXE,TENXE,MAUXE,TENLOAIXE FROM XE INNER JOIN LOAIXE ON XE.IDLOAIXE=LOAIXE.IDLOAIXE";
            Connection con = sqlDao.getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                XE_MODEL lg = new XE_MODEL(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));

                listXe.add(lg);

            }
        } catch (SQLException e) {
        }
        return listXe;
    }

    //GET LOAIXE SHOWCOMBOBOX LOAI XE
    public static List<String> getLoaiXeCBB() {
        List<String> listLoaiXe = new ArrayList<>();
        try {
            String query = "SELECT TENLOAIXE FROM LOAIXE";
            Connection con = sqlDao.getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);

            while (rs.next()) {

                String l = rs.getString(1);
                listLoaiXe.add(l);

            }

        } catch (SQLException e) {
        }
        return listLoaiXe;

    }

    //GET HINHH THUC GUI SHOWCOMBOBOX HINH THUC GUI
    public static List<String> getHinhThucGUiCBB() {
        List<String> listHTG = new ArrayList<>();
        try {
            String query = "SELECT TENHINHTHUC FROM HINHTHUCGUI";
            Connection con = sqlDao.getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);

            while (rs.next()) {

                String l = rs.getString(1);
                listHTG.add(l);

            }

        } catch (SQLException e) {
        }
        return listHTG;

    }

    //get tinh trang 
    public static List<String> getTinhTrang() {
        List<String> listTT = new ArrayList<>();
        try {
            String query = "SELECT TENTINHTRANG FROM TINHTRANG_HINHTHUCGUI";
            Connection con = sqlDao.getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);

            while (rs.next()) {

                String l = rs.getString(1);
                listTT.add(l);

            }

        } catch (SQLException e) {
        }
        return listTT;

    }

    //GET ID THE RIENG CHO COMBOBOX
    public static List<String> getMaThe() {
        List<String> list = new ArrayList<>();
        try {
            String query = "SELECT IDTHE FROM THE";
            Connection con = sqlDao.getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);

            while (rs.next()) {

                String l = rs.getString(1);
                list.add(l);

            }

        } catch (SQLException e) {
        }
        return list;

    }

    //
    public static List<DANG_KI_HINH_THUC_XE> getDKXE() {
        List<DANG_KI_HINH_THUC_XE> list = new ArrayList<>();
        try {
            String query = "SELECT BIENSOXE,TENHINHTHUC ,HTG.IDHINHTHUC,IDTHE   FROM HINHTHUCGUI AS HTG , DANGKY_HINHTHUCGUI AS DKHTG WHERE HTG.IDHINHTHUC=DKHTG.IDHINHTHUC";
            Connection con = sqlDao.getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                DANG_KI_HINH_THUC_XE lg = new DANG_KI_HINH_THUC_XE(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));

                list.add(lg);
            }
        } catch (Exception e) {
        }
        return list;
    }

    // them moi xe dang ki 
    public static void themMoiXe(String bienSo, String tenXe, String mauXe, String idLoai, String idHinhThuc, String NgayDK, String ngayKetThuc, String idDangKi, String tienDaThu, String idThe, String idTinhTrang) throws ParseException {

        Date ngayDK = new SimpleDateFormat("dd/MM/yyyy").parse(NgayDK);
        Date ngayKT = new SimpleDateFormat("dd/MM/yyyy").parse(ngayKetThuc);
        try {
            String query = "INSERT INTO XE VALUE ('" + bienSo + "','" + tenXe + "', '" + mauXe + "', '" + idLoai + "');";
            String query1 = "INSERT INTO XE VALUE ('" + bienSo + "','" + idHinhThuc + "', '" + ngayDK + "', '" + ngayKT + "','" + idDangKi + "','" + tienDaThu + "','" + idThe + "','" + idTinhTrang + "');";
            Connection con = sqlDao.getConnection();
            Statement stm = con.createStatement();
            stm.execute(query);
            stm.execute(query1);
        } catch (Exception e) {
        }
    }
//the null

    public static List<THE1_MODEL> getTHENULL() {
        List<THE1_MODEL> list = new ArrayList<>();
        try {
            String query = "SELECT BIENSOXE , THE.IDTHE,TRANGTHAI FROM  DANGKY_HINHTHUCGUI as dkhtg , THE where dkhtg.IDTHE=THE.IDTHE  and TRANGTHAI IS NULL";
            Connection con = sqlDao.getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                THE1_MODEL lg = new THE1_MODEL(rs.getString(1), rs.getString(2), rs.getString(3));

                list.add(lg);
            }
        } catch (Exception e) {
        }
        return list;
    }

    // 
    public static List<DANG_KI_HINH_THUC_XE> getListDKHTX() {
        List<DANG_KI_HINH_THUC_XE> list = new ArrayList<>();

        try {
            String query = "SELECT IDTHE,BIENSOXE,IDHINHTHUC,NGAYDK,NGAYKT,TIENDATHU,IDTINHTRANG FROM  DANGKY_HINHTHUCGUI";
            Connection con = sqlDao.getConnection();
            Statement stm = con.createStatement();

            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                DANG_KI_HINH_THUC_XE lg = new DANG_KI_HINH_THUC_XE(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));

                list.add(lg);
            }
        } catch (Exception e) {
        }
        return list;
    }
  public static List<DANG_KI_HINH_THUC_XE> getListSearch(String text) {
    List<DANG_KI_HINH_THUC_XE> list = new ArrayList<>();

        try {
            String query = " SELECT IDTHE,BIENSOXE,IDHINHTHUC,NGAYDK,NGAYKT,TIENDATHU,IDTINHTRANG FROM  DANGKY_HINHTHUCGUI where   BIENSOXE like '%"+text+ "%' ";
            Connection con = sqlDao.getConnection();
            Statement stm = con.createStatement();

            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                DANG_KI_HINH_THUC_XE lg = new DANG_KI_HINH_THUC_XE(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));

                list.add(lg);
            }
        } catch (Exception e) {
        }
        return list;
    }
 
    public static void main(String[] args) {

        System.out.println(GUIXE_DTO.getDKXE());
    }
}
