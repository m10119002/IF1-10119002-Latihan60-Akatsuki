/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan60.target.village;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Class untuk objek Village / Desa Asal
 * Pertemuan 5
 * 
 */
// (1/2) Class Dasar Polymorphism
public class Village {
    // Contoh Atribut final
    private final String suffikDesa = " no Sato";
    
    // Contoh hak akses Private
    private String namaPendek, namaPanjang;
    
    // Contoh hak akses Protected
    protected String pemimpin, negara;
    
    // (1/2) Konsep Overloading
    public Village() {
        this.namaPendek = "N/A";
        this.namaPanjang = "N/A";
        this.pemimpin = "N/A";
        this.negara = "N/A";
    }
    
    // (2/2) Konsep Overloading
    public Village(String naPen, String pemp, String neg) {
        this.namaPendek = naPen;
        this.namaPanjang = naPen.concat(suffikDesa);
        this.pemimpin = pemp;
        this.negara = neg;
    }
    
    // (1/2) Contoh Override Method
    public void printDesa() {
        System.out.println("N/A");
        System.out.println("");
    }
    
    // Contoh Metode Final - Getter Setter
    public final void setNamaDesa(String naPen)
    {this.namaPendek = naPen; this.namaPanjang = naPen.concat(suffikDesa);}
    public final String getNamaDesaPendek() {return this.namaPendek;}
    public final String getNamaDesaPanjang() {return this.namaPanjang;}
}
