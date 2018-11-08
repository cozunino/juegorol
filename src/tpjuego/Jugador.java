/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpjuego;

import java.util.Random;

/**
 *
 * @author conizunino
 */
public class Jugador {
    
    String nombre;
    int vida;
    int minpower;
    int maxpower;
    int golpe;
    
    
    public Jugador (String nommbre, int vida, int minPower, int maxPower) {
        this.nombre = nommbre;
        this.vida = vida;
        this.minpower = minPower;
        this.maxpower = maxPower;
    }

    public void Nombre(String nombre) {
        this.nombre = nombre;
    }


    public void Vida(int vida) {
        this.vida = vida;
    }
    
    public int Vida (){
        return vida--;
    }

    public void Golpe (int golpe){
        this.golpe = golpe;
    }
    
    public int Golpe() {
        
        Random aleatorio = new Random();    
        
        int n = aleatorio.nextInt(10);
        
        System.out.println("Poder de golpe "+n);
        
        return  (Vida()-n);
    }
    
    public void minpower(){
        this.minpower = minpower;
    }
    
    public int minpower(int minpower){
        return minpower;
    }
    
    public void maxpower(){
        this.maxpower = maxpower;
    }
    
    public int maxpower(int maxpower){
        return maxpower;
    }

    public void datosxconsola (){
        System.out.println("Nombre: "+nombre);
        System.out.println("Vida: "+vida);
        System.out.println("Golpe minimo: "+minpower);
        System.out.println("Golpe maximo: "+maxpower);
        
       
       
       
    }
    
}
