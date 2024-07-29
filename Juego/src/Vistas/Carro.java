/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;
import java.awt.Point;
import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class Carro extends Thread {
    private final JLabel eti;
    private final Vistas p;
    private final int velocidad; // Velocidad de movimiento del carro

    public Carro(JLabel eti, Vistas p, int velocidad){
        this.eti = eti;
        this.p = p;
        this.velocidad = velocidad; // Establece la velocidad del carro
    }

    Carro(Carro carro1, Vistas aThis, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void run(){
        while (true) {
            try {
                Point location = eti.getLocation();
                int x = location.x + velocidad; // Incrementa la posición x
                
                if (x > p.getWidth()) {
                    x = -eti.getWidth(); // Reinicia a la izquierda
                }

                // Actualiza la posición del carro
                eti.setLocation(x, location.y);
                
                // Pausa el hilo por un intervalo de tiempo
                sleep(100); // Ajusta el valor según la velocidad deseada

            } catch (InterruptedException e) { // Maneja la excepción de interrupción
                // Maneja la excepción de interrupción
                break; // Sale del bucle si el hilo es interrumpido
            }
        }
    }
}


   
