/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan60;

import m10119002.pbo.latihan60.target.Akatsuki;
import m10119002.pbo.latihan60.target.village.*;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program Akatsuki
 * Pertemuan 5
 * 
 */
public class Program {
    public static void main(String[] args) {
        Akatsuki deidara = new Akatsuki("Deidara", new Iwagakure());
        Akatsuki hidan = new Akatsuki("Hidan", new Yugakure());
        Akatsuki itachi = new Akatsuki("Itachi Uchiha", new Konohagakure());
        Akatsuki juzo = new Akatsuki("Juzo Biwa", new Kirigakure());
        Akatsuki kakuzu = new Akatsuki("Kakuzu", new Takigakure());
        Akatsuki kisame = new Akatsuki("Kisame Hoshigaki", new Kirigakure());
        Akatsuki konan = new Akatsuki("Konan", new Amegakure());
        Akatsuki nagato = new Akatsuki("Nagato", new Amegakure());
        Akatsuki orochimaru = new Akatsuki("Orochimaru", new Konohagakure());
        Akatsuki sasori = new Akatsuki("Sasori", new Sunagakure());
        Akatsuki tobi = new Akatsuki("Tobi", new Konohagakure());
        Akatsuki wZetsu = new Akatsuki("White Zetsu", new Village());
        Akatsuki bZetsu = new Akatsuki("Black Zetsu", new Village());
        
        Akatsuki[] akatsuki = new Akatsuki[]
        {deidara, hidan, itachi, juzo, kakuzu, kisame, konan, nagato,
        orochimaru, sasori, tobi, wZetsu, bZetsu};
        
        for(int i=0; i<akatsuki.length; i++) {
            akatsuki[i].printNama();
            akatsuki[i].getDesa().printDesa();
        }
    }
}
