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
public class NonMember {
private String nama;
private String ktp;
private String hp;

    public void setNama(String nama) throws Exception {
        for (char x : nama.toCharArray()) {
            if (Character.isDigit(x)) {
                this.nama="-1";
                throw new Exception("Nama tidak boleh angka");
            }
        }
        this.nama = nama;
    }
    
    
    public void setKtp(String ktp) throws Exception {
        if(ktp.length()!= 16){
                this.ktp="-1";
                throw new Exception("KTP harus 16 digit");
        }
        else {
            for (char x : ktp.toCharArray()) {
            if (!Character.isDigit(x)) {
                this.ktp="-1";
                throw new Exception("No KTP harus angka");
            }
        }
        }
        this.ktp = ktp;
    }
    
    public void setHp(String hp) throws Exception {
        for (char x : hp.toCharArray()) {
            if (!Character.isDigit(x)) {
                this.hp="-1";
                throw new Exception("Nomor Telepon harus angka");
            }
        }
        this.hp = hp;
    }
    
    
    String getNama(){
        return nama;
    }
    
    String getKtp(){
        return ktp;
    }
    
    String getHp(){
        return hp;
    }
}