/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso_15;

/**
 *
 * @author Admin
 */
public class Direccion {

    private String calle;
    private int numero;
    private int piso;
    private String ciudad;

    public Direccion() {
        calle = "";
        numero = 0;
        piso = 0;
        ciudad = "";
    }

    public Direccion(String cll, int num, int ps, String ciu) {
        calle = cll;
        numero = num;
        piso = ps;
        ciudad = ciu;
    }

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public int getPiso() {
        return piso;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCalle(String cll) {
        calle = cll;
    }

    public void setNumero(int num) {
        numero = num;
    }

    public void setPiso(int ps) {
        piso = ps;
    }

    public void setCiudad(String ciu) {
        ciudad = ciu;
    }
        @Override
    public String toString() {
        return calle + ", " + numero + ", " + piso + " , " + ciudad;}
    
    

}
