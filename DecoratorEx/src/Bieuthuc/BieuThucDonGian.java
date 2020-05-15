/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bieuthuc;

/**
 *
 * @author huuph
 */
public class BieuThucDonGian extends BieuThuc{

    float toanhang;

    public BieuThucDonGian(float toanhang) {
        this.toanhang = toanhang;
    }

    
    
    @Override
    public String bieuThuc() {
        return Float.toString(toanhang); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float giaTri() {
        return this.toanhang;
    }
    
    
}
