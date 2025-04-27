package com.teknologiinformasi.restapi.book.model;

import jakarta.persistence.*;


@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nama;
    private String pengarang;
    private String kategori;
    
    // Constructor tanpa parameter
    public Book() {}

    // Constructor dengan parameter
    public Book(String nama, String pengarang, String kategori) {
        this.nama = nama;
        this.pengarang = pengarang;
        this.kategori = kategori;
    }

    // Getters dan Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getPengarang() {
        return pengarang;
    }
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
    public String getKategori() {
        return kategori;
    }
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
}