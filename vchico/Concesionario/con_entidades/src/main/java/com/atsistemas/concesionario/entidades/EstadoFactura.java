/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atsistemas.concesionario.entidades;

/**
 *
 * @author vchico
 */
public enum EstadoFactura {
    ENPROCESO("En proceso"),
    ENTREGADO("Entregado"),
    SINSTOCK("Sin stock");
    
    EstadoFactura(String valor){}
}
