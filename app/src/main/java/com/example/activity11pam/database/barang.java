package com.example.activity11pam.database;

import java.io.Serializable;

public class barang implements Serializable{
    private String kode;
    private String nama;


    public barang(){
    }
    public String getKode(){
        return kode;
    }

    public void barang(String kode) {
        this.kode = kode;
    }

    public String getNama(){
        return nama;
    }

    public barang(String nama) {
        this.nama = nama;
    }

    public barang(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Barang{" +
                "kode='" + kode + '\'' +
                ", nama='" + nama + '\'' +
                '}';
    }

    public void setKode(String key) {
    }
}