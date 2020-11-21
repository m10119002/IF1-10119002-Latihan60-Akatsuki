/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan60.target.village;

/**
 *
 * @author
 */
// (2/2) Class Cabang Polymorphism
public class Iwagakure extends Village {
    public Iwagakure() {
        // Contoh Override Constructor
        super("Iwagakure", "Tsuchikage", "Land of Earth");
    }
    
    // (2/2) Contoh Override Method
    @Override
    public void printDesa() {
        // nama desa - hak akses private
        System.out.println("Berasal dari ".concat(this.getNamaDesaPanjang()));
        if(!this.negara.equals(""))
            System.out.println("dengan sebutan negara ".concat(this.negara).
                    concat(","));
        // pemimpin - hak akses protected
        if(!this.pemimpin.equals(""))
            System.out.println("yang dipimpin oleh ".concat(this.pemimpin).
                    concat("."));
        else System.out.println(".");
        System.out.println("");
    }
}
