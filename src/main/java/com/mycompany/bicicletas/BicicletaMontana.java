/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bicicletas;

/**
 *
 * @author ogil
 */
public class BicicletaMontana extends Bicicleta {
    
    private int cambio;
    
    public BicicletaMontana(){
        //Llamo al constructor de la clase padre
        super();
        this.cambio = 6;
    }
    
    public BicicletaMontana(int cambio,String marca,String color, double velocidadInicial,String pedales){
        //LLamo al constructor de la clase padre
        super(marca,color,velocidadInicial,pedales);
        
        if(cambio > 0 && cambio <= 12){
            this.cambio = cambio;
        }
        else{
            this.cambio = 6;
        }
    }
    
    public void subirCambio(){
        if(this.getCambio() < 12){
            cambio++;
        }
    }
    
    public void bajarCambio(){
        if(this.getCambio() > 1){
            cambio--;
        }
    }

    /**
     * @return the cambio
     */
    public int getCambio() {
        return this.cambio;
    }
    
    @Override
    public void pedalear(double aceleracion){
        double aceleracionConCambios = aceleracion * (this.cambio / 6.0);
        super.pedalear(aceleracionConCambios);
    }
    
    @Override
    public String getDescripcion(){
        return "Soy una bicicleta de montana " +  super.getDescripcion() + " y estoy en el cambio: " + this.cambio;
    }
    
}
