package com.teknologiinformasi.restapi.loan.model;

import jakarta.persistence.*;


@Entity
@Table(name = "loans")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long bookNo;
    private String nama;
    private int jumlah;
    private String kondisi;
    
    // Constructor tanpa parameter
    public Loan() {}

    // Constructor dengan parameter
    public Loan(Long  bookNo, String nama, int jumlah, String kondisi) {
        this.bookNo = bookNo;
        this.nama = nama;
        this.jumlah = jumlah;
        this.kondisi = kondisi;
    }

    // Getters dan Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getBookNo() {
        return bookNo;
    }
    public void setBookNo(Long bookNo) {
        this.bookNo = bookNo;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getJumlah() {
        return jumlah;
    }
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    public String getKondisi() {
        return kondisi;
    }
    public void setKondisi(String kondisi) {
        this.kondisi =kondisi;
    }
}