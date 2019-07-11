/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bsuquedas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;
import javagrafos.Nodo;

/**
 *
 * @author danny
 */
public class Profundidad implements Busqueda {

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
        System.out.println("Busqueda Profundidad ");
         Stack<Nodo> pila = new Stack<Nodo>();
         ArrayList<Nodo> lista = new ArrayList<Nodo>();
         ArrayList<Nodo> listaVisitados = new ArrayList<Nodo>();
         ArrayList<Integer> arrayListCantH = new ArrayList<Integer>();
         Comparator<Integer> comparador = Collections.reverseOrder();
         String cadena ="";
         pila.push(inicio);
         int profundidad =0;
         inicio.setNivel(profundidad);
         while(!pila.isEmpty()){
             //System.out.print("  " + pila.peek().getNombre()+"  ");
             if (inicio.getNombre() == busqueda.getNombre()) {
                 cadena = cadena+ "   "+pila.peek().getNombre()+"  ";
                 break;
             } else {
                 inicio.setVisited(true);
                 cadena = cadena+ "   "+pila.peek().getNombre()+"  ";
                 //System.out.println("Busqueda Profundidad ");
                  //System.out.print("" + pila.peek().getNombre());
                 pila.pop();
                 if (inicio.getLista().isEmpty() != true) {
                     
                     for (int i = 0; i < inicio.getLista().size(); i++) {
                          int cantidadH=inicio.getLista().size();
                          arrayListCantH.add(cantidadH);
                          Nodo Nodohijo = inicio.getLista().get(i);
                         // System.out.println("Busqueda Profundidad "+Nodohijo.getNombre());
                         if(!Nodohijo.isVisited()&& !Nodohijo.isAdded()){
                             Nodohijo.setAdded(true);
                             //System.out.println("encolando Busqueda Profundidad "+Nodohijo.getNombre());
                             Nodohijo.setNivel(1+inicio.getNivel());
                            pila.push(Nodohijo);
                         }//// fin if
                     }///// fin for

                 }/////fin if

                 if (!pila.isEmpty()) {
                     inicio = pila.peek();
                 }
                 
             }//// fin if
             
            
        }//// fin del while
        Collections.sort(arrayListCantH, comparador);
        int hijosp = arrayListCantH.get(0);
        //System.err.println(""+hijosp);
        int complejidad = (int) Math.pow(hijosp,inicio.getNivel());
        return " recorrido  " + cadena + "   complejidad   : "+complejidad;
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
