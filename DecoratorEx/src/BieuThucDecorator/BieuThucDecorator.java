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
public class BieuThucDecorator extends BieuThuc{
    BieuThuc bieuthuc;

    public BieuThucDecorator(BieuThuc bieuthuc) {
        this.bieuthuc = bieuthuc;
    }
    
    @Override
    public float giaTri() {
        return bieuthuc.giaTri();
    }

    @Override
    public String bieuThuc() {
        return bieuthuc.bieuThuc(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
