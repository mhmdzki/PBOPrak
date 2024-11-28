/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frontend;

import backend.*;
/**
 *
 * @author ASUS
 */
public class TestBackend {
    public static void main(String[] args) {
//        Kategori kat1 = new Kategori("Novel", "Koleksi buku novel");
//        Kategori kat2 = new Kategori("Referensi", "Buku referensi ilmiah");
//        Kategori kat3 = new Kategori("Komik", "Komik anak-anak");
//        
//        // test insert
//        kat1.save();
//        kat2.save();
//        kat3.save();
// 
//        // test update
//        kat2.setKeterangan("Koleksi buku referensi ilmiah");
//        kat2.save();
// 
//        // test delete
//        kat3.delete();
// 
//        // test select all
//        for(Kategori k : new Kategori().getAll()) {
//            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
//        }
// 
//        // test search
//        for(Kategori k : new Kategori().search("ilmiah")) {
//            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
//        }
        
        Anggota ang1 = new Anggota("Muhammad Zaki", "Kota  Pasuruan", "085954711445");
        Anggota ang2 = new Anggota("Febriansyah adi N", "Malang", "089635596818");
        Anggota ang3 = new Anggota("Vemas Bagus V", "Malang", "085719040578");
 
        // test insert
        ang1.save();
        ang2.save();
        ang3.save();
        
        // test update
        ang2.setAlamat("Kediri");
        ang2.save();
        
        // test delete
        ang3.delete();
        
        // test select all
        for(Anggota a : new Anggota().getAll()) {
            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat() + ", Telepon: " + a.getTelepon());
        }
 
        // test search
        for(Anggota a : new Anggota().search("Sidoarjo")) {
            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat() + ", Telepon: " + a.getTelepon());
        }
    }
}