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
public class Member {
private String nama;
private String id;

    public void setNama(String nama) throws Exception {
        for (char x : nama.toCharArray()) {
            if (Character.isDigit(x)) {
                this.nama="-1";
                throw new Exception("Nama tidak boleh angka");
            }
        }
        this.nama = nama;
    }
    
    
    public void setId(String id) throws Exception {
        if(id.length()!= 8){
                this.id="-1";
                throw new Exception("ID harus 8 digit");
        }
        else {
            for (char x : id.toCharArray()) {
            if (!Character.isDigit(x)) {
                this.id="-1";
                throw new Exception("ID harus angka");
            }
        }
        }
        this.id = id;
    }
    
    String getNama(){
        return nama;
    }
    
    String getId(){
        return id;
    }
}
