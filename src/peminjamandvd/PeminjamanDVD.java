/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peminjamandvd;
import java.util.*;
/**
 *
 * @author aldita
 */

public class PeminjamanDVD {
    
    static Scanner input = new Scanner(System.in);
    static Scanner input2 = new Scanner (System.in);
    public static void main(String[] args) {
      
    System.out.println("Selamat Datang di Aplikasi Rental DVD Dividi");
    int pil;
    do {
    System.out.println("Apakah Anda Member Dividi? \n" + "1.Ya \n" + "2.Tidak");
                            pil = input.nextInt();
                            if (pil > 2) {
                                System.out.println("Pilihan yang anda masukkan salah, Silahkan coba lagi");
                            }
                        } while (pil > 2);
    
    if (pil == 1){
       Member member = new Member(); 
       String nama;
       do {
            System.out.print("Masukan Nama Anda : ");
            nama = input2.nextLine();
            try {
                member.setNama(nama);
            } catch (Exception ex) {
                System.out.println("Terjadi Kesalahan : " + ex.getMessage());
            }
        } while (member.getNama() == "-1");
        String id;
       do {
            System.out.print("Masukan Member ID Anda : ");
            id = input2.nextLine();
            try {
                member.setId(id);
            } catch (Exception ex) {
                System.out.println("Terjadi Kesalahan : " + ex.getMessage());
            } 
       } while (member.getId() == "-1"); 
    }
        
    if(pil == 2 ){
       NonMember nonmember = new NonMember(); 
       String nama2;
       do {
            System.out.print("Masukan Nama Anda : ");
            nama2 = input2.nextLine();
            try {
                nonmember.setNama(nama2);
            } catch (Exception ex) {
                System.out.println("Terjadi Kesalahan : " + ex.getMessage());
            }
        } while (nonmember.getNama() == "-1");
        
       Alamat alamat = new Alamat();     
       String jalan;
            do {
            System.out.print("Masukan Alamat (Jalan) Anda : ");
            jalan = input2.nextLine();
            try {
                alamat.setJalan(jalan);
            } catch (Exception ex) {
                System.out.println("Terjadi Kesalahan : " + ex.getMessage());
            }
       } while (alamat.getJalan() == "-1");
         
            String kota;
            do {
            System.out.print("Masukan Kab./Kota Anda : ");
            kota = input2.nextLine();
            try {
                alamat.setKota(kota);
            } catch (Exception ex) {
                System.out.println("Terjadi Kesalahan : " + ex.getMessage());
            }
       } while (alamat.getKota() == "-1");
            
            String provinsi;
            do {
            System.out.print("Masukan Provinsi Anda : ");
            provinsi = input2.nextLine();
            try {
                alamat.setProvinsi(provinsi);
            } catch (Exception ex) {
                System.out.println("Terjadi Kesalahan : " + ex.getMessage());
            }
       } while (alamat.getProvinsi() == "-1");
        
        String ktp;
        do {
            System.out.print("Masukan Nomor KTP Anda : ");
            ktp = input2.nextLine();
            try {
                nonmember.setKtp(ktp);
            } catch (Exception ex) {
                System.out.println("Terjadi Kesalahan : " + ex.getMessage());
            } 
       }while (nonmember.getKtp() == "-1"); 
        
        String hp;
        do {
            System.out.print("Masukan Nomor Telepon Aktif Anda : ");
            hp = input2.nextLine();
            try {
                nonmember.setHp(hp);
            } catch (Exception ex) {
                System.out.println("Terjadi Kesalahan : " + ex.getMessage());
            } 
       } while (nonmember.getHp() == "-1");
    
    }
        int pilihan, i;
                        System.out.println("1. Peminjaman \n" + "2. Pengembalian \n" + "3. Exit");
                        
                        int pilihanTipe;
                        do {
                            System.out.print("Pilihan : ");
                            pilihanTipe = input.nextInt();
                            if (pilihanTipe > 3) {
                                System.out.println("Pilihan yang anda masukkan salah, Silahkan coba lagi");
                            }
                        } while (pilihanTipe > 3);
        if (pilihanTipe == 3) {
                            
                        System.exit(0);
                        
                        }
        else {

        
        Film film = new Film ();
        System.out.print("Judul Film : ");
        film.setFilm(input2.nextLine());

        int jumlah;
System.out.print("Jumlah DVD : ");
do {
    while (!input.hasNextInt()) {
            System.out.println("Harus angka!");
            input.next();
    }    
    jumlah = input.nextInt();
            try {
                film.setJumlah(jumlah);
            } catch (Exception ex) {
                System.out.println("Terjadi Kesalahan : " + ex.getMessage());
            }
        } while (film.getJumlah() == -1);  
           
if (pilihanTipe == 2) {
        Transaksi transaksi = new Transaksi ();                   
        String tangpin;
        do {
            System.out.print("Tanggal Peminjaman (DD-MM-YYYY) : ");
            tangpin = input2.nextLine();
            try {
                transaksi.setTangPin(tangpin);
            } catch (Exception ex) {
                System.out.println("Terjadi Kesalahan : " + ex.getMessage());
            }
        } while (transaksi.getTangPin() == "-1");
        
        int lama;
    System.out.print("Lama Peminjaman : ");
        do {
    while (!input.hasNextInt()) {
            System.out.println("Harus angka!");
            input.next();
    }    
    lama = input.nextInt();
            try {
                transaksi.setLama(lama);
            } catch (Exception ex) {
                System.out.println("Terjadi Kesalahan : " + ex.getMessage());
            }
        } while (transaksi.getLama() == -1);
        
        System.out.println("Denda : Rp." + transaksi.setDenda());
        System.out.println("Keterangan : Denda dimungkinkan terjadi karena keterlambatan pengembalian");                
                          
                        } else if (pilihanTipe == 1) {
                            Transaksi transaksi = new Transaksi ();
                            System.out.println("Biaya : Rp." + transaksi.getBiaya(film.getJumlah()));
                            System.out.println("Keterangan : \n" + "1.Sewa berlaku hanya untuk 7 hari \n" + "2.Keterlambatan pengembalian akan menimbulkan denda");
                        } else {
                            System.out.println("Input yang anda masukan salah, Silahkan coba lagi");
                        }                   
        }
                        

                }
}
