package t4ej07;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class Entropy {
    static void eljass(int num1,int num2,int num3,int num4){
    int temp;
    //primera pasada para llevar el mayor al final
    if(num1 > num2){temp = num1; num1 = num2; num2 = temp;}
    if(num2 > num3){temp = num2; num2 = num3; num3 = temp;}
    if(num3 > num4){temp = num3; num3 = num4; num4 = temp;}
    
    //segunda pasada 
    if(num1 > num2){temp = num1; num1 = num2; num2 = temp;}
    if(num2 > num3){temp = num2; num2 = num3; num3 = temp;}
    
    //ultima pasada
    if(num1 > num2){temp = num1; num1 = num2; num2 = temp;}
        
    System.out.println("El orden es: " + num1 + "/" + num2 + "/" +
                num3 + "/" + num4);
    
    

    
}
    
}
