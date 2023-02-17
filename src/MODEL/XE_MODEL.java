/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author HUU77
 */
public class XE_MODEL {
    private String bienSoXe;
    private String tenXe;
    private String mauXe;
    private String loaiXe;
  

    public String getBienSoXe() {
        return bienSoXe;
    }

    public void setBienSoXe(String bienSoXe) {
        this.bienSoXe = bienSoXe;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    

    public XE_MODEL(String bienSoXe, String tenXe, String mauXe, String loaiXe) {
        this.bienSoXe = bienSoXe;
        this.tenXe = tenXe;
        this.mauXe = mauXe;
        this.loaiXe = loaiXe;
    }

    public XE_MODEL() {
    }
   
     
    
}
