/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymetodo;

/**
 *
 * @author lestu
 */
public class AduanaMaritima implements CalcularImpuesto {

    @Override
    public Double calcularImpuesto(Double cantidadBultos, Double pesoPaquete) {
    Double precioBulto = 8.00;   
    Double total = (cantidadBultos*precioBulto);
    return total;
    }

    @Override
    public Double precioViaje(String destino) {
              Double precio = 0.0;
      if (destino.equals("OceanoPacifico")){
          precio= 1000.688;
      }
          if (destino.equals("OceanoAtlantico")){
          precio= 750.98;
      }
          return precio;
    }
    
}
