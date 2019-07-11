/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bsuquedas;

import java.util.Stack;
import javagrafos.Grafo;
import javagrafos.Nodo;

/**
 *
 * @author danny
 */
public class ProfundidadIterativa implements Busqueda {
    
    private Nodo NodoObjetivo;
    private boolean ObjetivoEncontrado;
    private Grafo Migrafo = new Grafo();
    public ProfundidadIterativa(Nodo objetivo){
       this.NodoObjetivo=objetivo;
    } 

    public ProfundidadIterativa() {
        
    }
    
    public void EjecucionProfundidadIterativa(Nodo Inicio , Nodo Busqueda){
        int profundidad=0;
        while (!ObjetivoEncontrado) {   
            Buscar(Inicio,Busqueda, profundidad);
            profundidad++;
            System.out.println("");
              
        }
    }
    @Override
    public void Buscar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Buscar(Nodo inicio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        
        Stack<Nodo> pila = new Stack<>();
        inicio.setNivel(0);
        pila.push(inicio);
        
        while(!pila.isEmpty()){
            
             Nodo nodoactual =pila.pop();
             System.out.print("  " + nodoactual.getNombre()+" nivel  " + nodoactual.getNivel());
             if (nodoactual.getNombre() == busqueda.getNombre()) {
                 this.ObjetivoEncontrado=true;
                 return "encontrado";
             } 
                 nodoactual.setVisited(true);
                if(nodoactual.getNivel() >= profundidad){
                      System.out.print(" Devuelve ");
                    continue;
                }
                 if (nodoactual.getLista().isEmpty() != true) {
                     for (int i = 0; i < nodoactual.getLista().size(); i++) {
                          Nodo Nodohijo = nodoactual.getLista().get(i);
                         if(!Nodohijo.isVisited() && !Nodohijo.isAdded()){
                            Nodohijo.setNivel(nodoactual.getNivel()+1);
                            Nodohijo.setAdded(true);
                            pila.push(Nodohijo);
                         }//// fin if
                     }///// fin for

                 }/////fin if

                 if (!pila.isEmpty()) {
                    // inicio = pila.peek();
                    
                        // pila.pop().setAdded(false);
                         
                     
                 }
                 
            
             
            
        }//// fin del while
         System.out.print(" Si limpia ");
        Migrafo.limpiar();
        return "Nodo NO encontrado";
    }

    private void dfs(Nodo Inicio, int profundidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
