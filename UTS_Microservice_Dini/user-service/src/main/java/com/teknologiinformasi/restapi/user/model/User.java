package com.teknologiinformasi.restapi.user.model;

import jakarta.persistence.*;


@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nama;
    private String nobp;
    private String divisi;
    
    // Constructor tanpa parameter
    public User() {}

    // Constructor dengan parameter
    public User(String nama, String nobp, String divisi) {
        this.nama = nama;
        this.nobp = nobp;
        this.divisi = divisi;
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
    public String getNobp() {
        return nobp;
    }
    public void setNobp(String nobp) {
        this.nobp = nobp;
    }
    public String getDivisi() {
        return divisi;
    }
    public void setDivisi(String devisi) {
        this.divisi = divisi;
    }
}