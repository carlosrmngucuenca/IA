/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bsuquedas;

import java.util.ArrayList;
import java.util.PriorityQueue;
import javagrafos.Nodo;

/**
 *
 * @author danny
 */
public class PrimeroElMejor implements Busqueda {

    @Override
    public void Buscar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Buscar(Nodo inicio) {
        System.out.println("Busqueda Primero Mejor ");
     NodoComparadorHeuristicas n = new NodoComparadorHeuristicas();
         PriorityQueue<Nodo> cola = new PriorityQueue<>(n);
         ArrayList<Integer> listavisitados = new ArrayList<Integer>();
         cola.add(inicio);
         
         while(!cola.isEmpty()){
                System.out.print( " : Nodo  " + cola.peek().getNombre()+" heuristica " + cola.peek().getHeuristica()+" : ");
            
             
             if (inicio.getNombre() == 0) {
                 System.err.println(""+inicio.getNombre());
                return "nodo Encontrado"+inicio.getNombre();
             } else {
                 inicio.setVisited(true);
                 cola.remove();
           
              if(inicio.getLista().isEmpty()!=true)
                 {
            
                   for(int i=0 ; i<inicio.getLista().size() ; i++){
                       Nodo Nodohijo = inicio.getLista().get(i);
                       if(!Nodohijo.isVisited()){
                            cola.add(Nodohijo);
                         }//// fin if
                     
                
                 }/////fin for
                   
              }///// fin if
              
              if(!cola.isEmpty()){
                   inicio=cola.peek();
              }///// fin if
                 
             }///// fin if
             
        }///// fin while
         
         return "nodo no encontrado ";
    }

    @Override
    public String Buscar(Nodo inicio, Nodo busqueda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Buscar(Nodo inicio, Nodo busqueda, int[][] MatrizDePesos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Buscar(Nodo inicio, String op) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Buscar(Nodo inicio, Nodo busqueda, int profundidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
