/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bicicletas;

/**
 *
 * @author ogil
 */
public class BicicletaRuta extends Bicicleta {
    
    private double anchoNeumatico;
    
    public BicicletaRuta(){
        super();
        this.anchoNeumatico = 28;
    }
    
    public BicicletaRuta(int anchoNeumatico,String marca,String color, double velocidadInicial,String pedales){
        //LLamo al constructor de la clase padre
        super(marca,color,velocidadInicial,pedales);
        if(anchoNeumatico > 17 && anchoNeumatico <= 62){
            this.anchoNeumatico = anchoNeumatico;
        }
        else{
            this.anchoNeumatico = 28;
        }
    }

    /**
     * @return the anchoNeumatico
     */
    public double getAnchoNeumatico() {
        return anchoNeumatico;
    }

    /**
     * @param anchoNeumatico the anchoNeumatico to set
     */
    public void setAnchoNeumatico(double anchoNeumatico) {
        this.anchoNeumatico = anchoNeumatico;
    }
    
    @Override
    public String getDescripcion(){
        return "Soy una bicicleta de ruta " + super.getDescripcion() + " y el ancho del neumatico es de: " + this.anchoNeumatico;
    }
    
}
