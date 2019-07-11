/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagrafos;

import java.util.ArrayList;

/**
 *
 * @author danny
 */
public class Rutas {
    
    Nodo NodoInicio;
    Nodo NodoFin;
    int pesoRuta;
    int[][] MatrizAdyacenciaPR ;
    int tam;
   
    
    public Rutas(Nodo NodoInicio, Nodo NodoFin, int pesoRuta) {
        this.NodoInicio = NodoInicio;
        this.NodoFin = NodoFin;
        this.pesoRuta = pesoRuta;
    
        
    }
    
    
    
    
    
    public void Rutas(int Matriz[][] , int f , int c){
        
    }
    
    

    public Nodo getNodoInicio() {
        return NodoInicio;
    }

    public void setNodoInicio(Nodo NodoInicio) {
        this.NodoInicio = NodoInicio;
    }

    public Nodo getNodoFin() {
        return NodoFin;
    }

    public void setNodoFin(Nodo NodoFin) {
        this.NodoFin = NodoFin;
    }

    public int getPesoRuta() {
        return pesoRuta;
    }

    public void setPesoRuta(int pesoRuta) {
        this.pesoRuta = pesoRuta;
    }
    
    
    
}
