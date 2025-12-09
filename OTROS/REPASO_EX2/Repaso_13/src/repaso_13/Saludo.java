/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso_13;

/**
 *
 * @author Admin
 */
public class Saludo {
    private String frase;
    
    public Saludo(){
        frase = "";
    }
    
    public Saludo(String f){
        frase = f;
    }
    public String getFrase(){
        return frase;
    }
    
    public void setFrase(String f){
        frase = f;
    }
    
}
