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
public class TPJuego {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        Jugador jugador1 = new Jugador("Superman",100,30,60);
        Jugador jugador2 = new Jugador("Batman",100,30,60);
        
        
        System.out.println("Jugador 1 "+jugador1.nombre);
        System.out.println("Vida "+jugador1.Vida());
        System.out.println("Max power "+jugador1.maxpower);
        System.out.println("Min power "+jugador1.minpower);
        System.out.println("-------------------------------------------------");
        System.out.println("");
        System.out.println("Jugador 2 "+jugador2.nombre);
        System.out.println("Vida "+jugador2.Vida());
        System.out.println("Max power "+jugador2.maxpower);
        System.out.println("Min power "+jugador2.minpower);
        System.out.println("");
        
        System.out.println("--------------------Pelea------------------------");
        System.out.println("");
        System.out.println(jugador1.nombre+" tiene una vida de: "+jugador1.Vida());
        System.out.println("");
        System.out.println(jugador2.nombre+" tiene una vida de: "+jugador2.Vida());
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        
      
        while (jugador1.Vida() > 0 && jugador2.Vida() > 0);
        
        System.out.println("Es el turno de Superman ");//turno1
        System.out.println("");
        System.out.println("Vida de Batman : "+(jugador2.Golpe()));   
        System.out.println("");
        System.out.println("-------------------------------------------------");
        
        System.out.println("Es el turno de Batman ");//turno2
        System.out.println("");  
        System.out.println("Vida de Superman: "+(jugador1.Golpe()));
        System.out.println("");
        System.out.println("-------------------------------------------------");
        
        
        if (jugador1.Vida() <= 0){
        System.out.println("Batman es el ganador");
        
        }else{
            System.out.println("Superman es el ganador");
        } 
        System.out.println("-------------------------------------------------");
        System.out.println("Fin del juego");
        System.out.println("-------------------------------------------------");
        }
        }
       
    
 
 


      
  

