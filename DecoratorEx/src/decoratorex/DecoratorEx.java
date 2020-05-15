/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorex;

import BieuThucDecorator.Cong;
import BieuThucDecorator.Nhan;
import Bieuthuc.BieuThuc;
import Bieuthuc.BieuThucDonGian;

/**
 *
 * @author huuph
 */
public class DecoratorEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BieuThuc t = new BieuThucDonGian(3);
        t = new Nhan(t,2);
        System.out.println(t.bieuThuc() + " = "+t.giaTri());
        t = new Cong(t,5);
        System.out.println(t.bieuThuc() + " = "+t.giaTri());
    }
    
}
