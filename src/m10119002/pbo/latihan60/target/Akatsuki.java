/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan60.target;

import m10119002.pbo.latihan60.target.village.Village;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Class untuk objek Akatsuki
 * Pertemuan 5
 * 
 */
// Contoh Kelas Final
public final class Akatsuki {
    // Contoh Atribut Final
    private final String NAMA;
    private final Village DESA;
    
    public Akatsuki(String nama, Village desa) {
        this.NAMA = nama;
        this.DESA = desa;
    }
    
    public String getNama() {return this.NAMA;}
    public Village getDesa() {return this.DESA;}
    public void printNama() {System.out.println(this.NAMA);}
}