/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peminjamandvd;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author aldita
 */
public class Transaksi {
    private String tangpin;
    private String tanggalnow;
    private double biaya;
    private int lama;
    private double denda;
    private String tangjib;
    Film film;
    
    
    public void setTangPin(String tangpin) throws Exception{
        if(tangpin.length()!= 10){
                this.tangpin="-1";
                throw new Exception("Tanggal harus 10 digit");
        }
        else {
            for (int i = 0; i < 10; i++) {
            if(i != 2 && i != 5){
                if(!Character.isDigit(tangpin.charAt(i))){
                this.tangpin="-1";
                throw new Exception("Tanggal harus angka");
            }
        }
        }
        this.tangpin = tangpin;
    }
    }
    
    public void setTanggalNow (String tanggalnow) {
        Date tanggal = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(sdf.format(tanggal));
    }
    
    public String getTanggalNow (){
        return tanggalnow;
    }
    
    
    public String getTangPin (){
    return tangpin;
    }
    
    public double getBiaya(double a){
        this.biaya = a*20000;
        return biaya;
    }
    public void setLama (int lama) throws Exception{
        if (lama > 0) {
            this.lama = lama;
        } else {
        this.lama=-1;   
        throw new Exception("Jumlah tidak boleh negatif atau nol");
    }
    }
    
    public int getLama (){
        return lama;
    }
    
    public double setDenda(){
        double b = getLama();
        this.denda = b*5000;
        return denda;
    }
    
    public void setTanggalWajib (String tangjib){
        SimpleDateFormat sdfdate = new SimpleDateFormat("dd-MM-yyyy");
        Date tanggal = new Date();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 7); 
        Date tigaharilagi = cal.getTime();
        this.tangjib = sdfdate.format(tigaharilagi);
    }
    
    public String getTanggalWajib (){
        return tangjib;
    }
    }