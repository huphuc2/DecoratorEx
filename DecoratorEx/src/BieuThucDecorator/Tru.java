/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BieuThucDecorator;

import Bieuthuc.BieuThuc;

/**
 *
 * @author huuph
 */
public class Tru extends BieuThucDecorator{
    float toanhang;

    public Tru(BieuThuc bieuthuc,float toanhang) {
        super(bieuthuc);
        this.toanhang = toanhang;
    }
    
    @Override
    public String bieuThuc() {
        return bieuthuc.bieuThuc() + " - "+toanhang; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float giaTri() {
        return bieuthuc.giaTri() - toanhang; //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
