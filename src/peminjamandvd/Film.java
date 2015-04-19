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
public class Film {
private String film;
private int jumlah;

public void setFilm(String film) {
    this.film = film;
    }

public void setJumlah(int jumlah) throws Exception {
    if (jumlah > 0) {
            this.jumlah = jumlah;
        } else {
        this.jumlah=-1;   
        throw new Exception("Jumlah tidak boleh negatif atau nol");
    }
}

public String getFilm(){
    return film;
}

public int getJumlah(){
    return jumlah;
}


}

