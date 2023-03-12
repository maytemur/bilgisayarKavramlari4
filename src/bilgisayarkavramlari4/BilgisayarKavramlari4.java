/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bilgisayarkavramlari4;

/**
 *
 * @author maytemur java 21 - Metot ve Fonksiyonlar f(x) = 5x +10 fonksiyonunu
 * yapalım
 */

///

///
public class BilgisayarKavramlari4 {

    static void yaz() {
        System.out.println("hello milyon");
    }

    static int f(int x) { //main fonksyionun içinden erişebilmemiz için statik olması lazım
        return 5 * x + 10;
    }

    static int g(int x, int y) {
        return y + 2 * x;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println(f(10));
        System.out.println(f(g(5, 3)));
        yaz();
    }
}
