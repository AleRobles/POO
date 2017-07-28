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
public class Barco implements combustible{
    private float consumo;
    private float kilometros;
    float litros = (float) 0.142857142;

    public Barco(float kilometros){
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
        
        return gasolina*kilometros/7;
    }
}
