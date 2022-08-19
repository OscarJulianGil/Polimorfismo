/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bicicletas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ogil
 */

public class Bicicletas {

    public static void main(String[] args) {
        
        Bicicleta cicla1,cicla2,cicla3;
        
        cicla1 = new Bicicleta();
        cicla2 = new BicicletaMontana(5, "Trek","Rojo",0,"SRAM");
        cicla3 = new BicicletaRuta();
        
        //System.out.println(cicla1.getDescripcion());
        //System.out.println(cicla2.getDescripcion());
        //System.out.println(cicla3.getDescripcion());


        //Crear una lista de bicicletas.
        List<Bicicleta> bicicletas = new ArrayList<>();
        //Adiciono biciletas a la lista.
        bicicletas.add(cicla1);
        bicicletas.add(cicla2);
        bicicletas.add(cicla3);

        //Mecanico
        Mecanico juancho = new Mecanico();
        juancho.getMisPedales().add("Pinarello");
        juancho.getMisPedales().add("Scott");
        juancho.getMisPedales().add("Cannondale");
        juancho.getMisPedales().add("Giant");

        //For each
        for (Bicicleta miCicla : bicicletas) {
            juancho.ponerPedales(miCicla);
        }

        System.out.println("Fin del programa");
    }
}
