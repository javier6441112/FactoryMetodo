/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymetodo;

/**
 *
 * @author lestu
 */
public class AduanaAerea implements CalcularImpuesto {

    @Override
    public Double calcularImpuesto(Double cantidadBultos, Double pesoPaquete) {
    Double precioKilo = 10.00;   
    Double total = (cantidadBultos*(pesoPaquete*precioKilo));
    return total;
    }

    @Override
    public Double precioViaje(String destino) {
        Double precio = 0.0;
      if (destino.equals("Guatemala")){
          precio= 200.68;
      }
          if (destino.equals("Mexico")){
          precio= 450.68;
      }
          return precio;
    }
    
}
