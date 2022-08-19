/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bicicletas;

/**
 *
 * @author ogil
 */
public class Bicicleta {
    
    private String marca;
    private String color;
    private double velocidad;
    private String pedales;
    public Bicicleta(){
        this.marca = "GW";
        this.color = "gris";
        this.velocidad = 0;
        this.pedales = "Shimano";
    }
    
    public Bicicleta(String marca,String color, double velocidad,String pedales){
        this.marca = marca;
        this.color = color;
        this.velocidad = velocidad;
        this.pedales = pedales;
    }
    
    
    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the velocidad
     */
    public double getVelocidad() {
        return velocidad;
    }

    /**
     * @param velocidad the velocidad to set
     */
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * @return the pedales
     */
    public String getPedales() {
        return pedales;
    }

    /**
     * @param pedales the pedales to set
     */
    public void setPedales(String pedales) {
        this.pedales = pedales;
    }
    
    public void pedalear(double aceleracion){
        this.velocidad = this.velocidad + aceleracion;
    }
    
    public void frenar(){
        if(this.velocidad > 0){
            this.velocidad--;
        }
    }
    
    public String getDescripcion(){
        return " de marca " + this.marca + " de color " + this.color + " con una velocidad de " +
                this.velocidad + " y con pedales " + this.pedales;
    }
    
}
