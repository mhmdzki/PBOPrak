/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.security.interfaces.RSAKey;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Pegawai {
    private int idPegawai;
    private  String nama;
    private String alamat;
    private String telepon;
    private String jabatan;
    private String username;
    private String password;

    public int getIdpegawai() {
        return idPegawai;
    }

    public void setIdpegawai(int idpegawai) {
        this.idPegawai = idpegawai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String toString() {
        return this.nama;
    }

    

    public Pegawai() {
    }

    public Pegawai(String nama, String alamat, String telepon, String jabatan, String username, String password) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.jabatan = jabatan;
        this.username = username;
        this.password = password;
    }

    
    public Pegawai getById(int id) {
        Pegawai pegawai = new Pegawai();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM pegawai WHERE idpegawai = " + id + ";");
        try {
            while (rs.next()) {
                pegawai = new Pegawai();
                pegawai.setIdpegawai(rs.getInt("idpegawai"));
                pegawai.setNama(rs.getString("nama"));
                pegawai.setAlamat(rs.getString("alamat"));
                pegawai.setTelepon(rs.getString("telepon"));
                pegawai.setJabatan(rs.getString("jabatan"));
                pegawai.setUsername(rs.getString("username"));
                pegawai.setPassword(rs.getString("password"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pegawai;
    }
    
    public ArrayList<Pegawai> getAll() {
        ArrayList<Pegawai> listPegawai = new ArrayList<>();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM pegawai");
        try {
            while (rs.next()) {
                Pegawai pegawai = new Pegawai();
                pegawai.setIdpegawai(rs.getInt("idpegawai"));
                pegawai.setNama(rs.getString("nama"));
                pegawai.setAlamat(rs.getString("alamat"));
                pegawai.setTelepon(rs.getString("telepon"));
                pegawai.setJabatan(rs.getString("jabatan"));
                pegawai.setUsername(rs.getString("username"));
                pegawai.setPassword(rs.getString("password"));
                listPegawai.add(pegawai);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listPegawai;
    }

    public ArrayList<Pegawai> search(String keyword) {
        ArrayList<Pegawai> listPegawai = new ArrayList<>();
        String sql = "SELECT * FROM pegawai WHERE " +
                     "nama LIKE '%" + keyword + "%' " +
                     "OR alamat LIKE '%" + keyword + "%'";
        ResultSet rs = DBHelper.selectQuery(sql);
        try {
            while (rs.next()) {
                Pegawai pegawai = new Pegawai();
                pegawai.setIdpegawai(rs.getInt("idpegawai"));
                pegawai.setNama(rs.getString("nama"));
                pegawai.setAlamat(rs.getString("alamat"));
                pegawai.setTelepon(rs.getString("telepon"));
                pegawai.setJabatan(rs.getString("jabatan"));
                pegawai.setUsername(rs.getString("username"));
                pegawai.setPassword(rs.getString("password"));
                listPegawai.add(pegawai);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listPegawai;
    }

    public void save() {
        if (getById(idPegawai).getIdpegawai()== 0) {
            String SQL = "INSERT INTO pegawai (nama, alamat, telepon, jabatan, username, password) VALUES (" +
                         "'" + this.nama + "', " +
                         "'" + this.alamat + "', " +
                        "'" + this.telepon + "', " +
                        "'" + this.jabatan + "', " +
                        "'" + this.username + "', " +
                         "'" + this.password + "' )";
            this.idPegawai = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE pegawai SET " +
             "nama = '" + this.nama + "', " +
             "alamat = '" + this.alamat + "', " +  
             "telepon = '" + this.telepon + "' " +
                    "telepon = '" + this.jabatan + "' " +
                    "telepon = '" + this.username + "' " +
                    "telepon = '" + this.password + "' " +
             "WHERE idpegawai = " + this.idPegawai;
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete(){
        String SQL = "DELETE FROM pegawai WHERE idpegawai = '" + this.idPegawai + "'";
        DBHelper.executeQuery(SQL);
    }
   
    public boolean isUsernameExists(String username) {
        boolean result = false;
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM pegawai WHERE username = '" + username + "'");
        try {
            if (rs.next()) { 
                result = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
}