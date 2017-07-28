/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author Peña Robles
 */
public class Motociclista implements combustible {
     private float consumo;
    private float kilometros;
    float litros = (float) 0.055555555;

    public Motociclista(float kilometros){
        this.kilometros = kilometros;
    }

    @Override
    public float consumoRecorrido() {
        consumo = kilometros*litros;
        return consumo;
    }
    
    @Override
    public float costoRecorrido() {
        float gasolina=(float) 15.37;
        
        return gasolina*kilometros/18;
    }
}
