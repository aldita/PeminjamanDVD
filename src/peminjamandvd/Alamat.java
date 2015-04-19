/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peminjamandvd;

/**
 *
 * @author aldita
 */
public class Alamat {
    private String jalan;
    private String kota;
    private String provinsi;

    public void setJalan(String jalan) {
        this.jalan = jalan;
    }

    public void setKota(String kota) throws Exception {
        for (char x : kota.toCharArray()) {
            if (Character.isDigit(x)) {
                this.kota="-1";
                throw new Exception("Nama Kota tidak boleh angka");
            }
        }
        this.kota = kota;
    }
    
    public void setProvinsi(String provinsi) throws Exception {
        for (char x : provinsi.toCharArray()) {
            if (Character.isDigit(x)) {
                this.provinsi="-1";
                throw new Exception("Nama Provinsi tidak boleh angka");
            }
        }
        this.provinsi = provinsi;
    }
    
    public String getJalan() {
        return jalan;
    }
     
    public String getKota() {
        return kota;
    }
    
    public String getProvinsi() {
        return provinsi;
    }
}
