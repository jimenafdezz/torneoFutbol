/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.torneofutbol;

/**
 *
 * @author DAW105
 */
public class TorneoFutbol {

    public static void main(String[] args) {
         System.out.println("Accediendo a la base de datos del torneo de FP");
        
        // Crear una instancia de la clase Equipo
        equipo equipoMH = new equipo("IES MH FC");

        // Agregar jugadores al equipoMH
        equipoMH.agregarJugador("Pepe", 1);
        equipoMH.agregarJugador("Aitana", 8);
        equipoMH.agregarJugador("Marco Sangalli", 15);
        

        // Mostrar la lista de jugadores del equipoMH
        System.out.println("\nLista de jugadores en el equipo "+equipoMH.getNombreEquipo()+":");
        equipoMH.mostrarJugadores();

        // Obtener y mostrar el número de jugadores en el equipoMH
        int numeroDeJugadores = equipoMH.obtenerNumeroDeJugadores();
        System.out.println("\nNumero de jugadores en el equipo: " + numeroDeJugadores);
    }
}
