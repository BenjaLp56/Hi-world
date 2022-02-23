/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Matematica;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class MatematicaServicio {

    Scanner read = new Scanner(System.in);
    Matematica mat = new Matematica();

    public void relleno() {

        mat.setNum1(Math.random());
        mat.setNum2(Math.random());

        System.out.println("Los numeros se generaron aleatoreamente y son, numero 1; " + mat.getNum1() + " y el numero 2; " + mat.getNum2());

        this.devolverMayor();
        this.calcularPotencia();
        this.calcularRaiz();
    }

    public void devolverMayor() {
        System.out.println("El numero mayor es: " + Math.max(mat.getNum1(), mat.getNum2()));

    }

    public void calcularPotencia() {

        double pot = Math.round(Math.max(mat.getNum1(), mat.getNum2()));
        
        double min = Math.round(Math.min(mat.getNum1(), mat.getNum2()));
        
        
        System.out.println("La potencia del numero mayor es " + Math.pow(pot, min));

    }
    
    public void calcularRaiz(){
        
        double abst = Math.abs(Math.min(mat.getNum1(), mat.getNum2()));
            System.out.println("La raiz cuadrada es : " + Math.sqrt(abst));
        }
}
