/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AES;

import DAO.QLNHANVIEN_DTO;
import MODEL.VaiTro;
import java.util.ArrayList;
import java.util.List;
import MODEL.NHANVIEN;

/**
 *
 * @author ginku
 */
public class NhanVienModify {
    private final String numberPhonePattern = "^0\\d{9}$";
    private final String CMNDPattern ="^\\d{12}$";
    private List<VaiTro> listVaiTro = new ArrayList<>();
    public boolean validatePhoneNumber(String phoneNumber){
        return phoneNumber.matches(numberPhonePattern);
    }
    public boolean validateCMND(String CMND){
        return CMND.matches(CMNDPattern);
    }
    public boolean checkForDuplicatePhoneNumber(String phoneNumber, List <NHANVIEN> listNhanVien){
        for(NHANVIEN n:listNhanVien){
            if (n.getSDT().equalsIgnoreCase(phoneNumber)){
                return true;
            }
        }
        return false;
    }
    public boolean checkForDuplicateCMND(String CMND, List <NHANVIEN> listNhanVien){
        for(NHANVIEN n:listNhanVien){
            if (n.getCMND().equalsIgnoreCase(CMND)){
                return true;
            }
        }
        return false;
    }
     public boolean checkForExistanceMANV(String MANV, List <NHANVIEN> listNhanVien){
        for(NHANVIEN n:listNhanVien){
            if (n.getMANV().equalsIgnoreCase(MANV)){
                return true;
            }
        }
        return false;
    }
   
    public String chuyenDoiMaVaiTro(String tenCongViec){
        QLNHANVIEN_DTO loadDAO = new QLNHANVIEN_DTO();
        listVaiTro = loadDAO.getAllTenVaiTro();
        for (VaiTro vt: listVaiTro){
            if(vt.getTenVaiTro().equalsIgnoreCase(tenCongViec)){
                return vt.getId();
            }
        }
        return "";
    };
   
    
}
