/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bsuquedas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import javagrafos.Nodo;

/**
 *
 * @author danny
 */
public class Amplitud implements Busqueda{

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
        System.out.println(" Usqueda Amplitud");
         Queue<Nodo> cola=new LinkedList();
         ArrayList<Nodo> lista = new ArrayList<Nodo>();
         ArrayList<Nodo> listac = new ArrayList<Nodo>();
         ArrayList<Integer> arrayListCantH = new ArrayList<Integer>();
         Comparator<Integer> comparador = Collections.reverseOrder();
         String cadena ="";
         cola.add(inicio);
         int profundidad =0;
         inicio.setNivel(profundidad);
         while(!cola.isEmpty()){
           
             if (inicio.getNombre() == busqueda.getNombre()) {
                 //System.out.print("   "+inicio.getNombre()+"  " + "en el nivel : "+ inicio.getNivel());
                 cadena = cadena+ "   "+cola.peek().getNombre()+"  ";
                break;
             } else {
                 inicio.setVisited(true);
                  cadena = cadena + "   "+cola.peek().getNombre()+"  ";
                  //System.out.print("   "+cola.peek().getNombre()+"  ");
                 cola.remove();
                
              if(inicio.getLista().isEmpty()!=true)
                 {
                  
                   for(int i=0 ; i<inicio.getLista().size() ; i++){
                       int cantidadH=inicio.getLista().size();
                       arrayListCantH.add(cantidadH);
                       Nodo Nodohijo = inicio.getLista().get(i);
                       //System.out.print("   "+Nodohijo.getNombre()+"  ");
                       if(!Nodohijo.isVisited() && !Nodohijo.isAdded()){
                            Nodohijo.setAdded(true);
                           // System.out.print("   "+Nodohijo.getNombre()+"  ");
                            Nodohijo.setNivel(1+inicio.getNivel());
                           // System.out.println("|| ---  "+Nodohijo.getNombre()+" --- "+Nodohijo.getNivel()+" --- ||");
                            cola.add(Nodohijo);
                            
                           
                         }//// fin if
                    
                
                 }/////fin for
                   
              }///// fin if
              
              if(!cola.isEmpty()){
                   inicio=cola.peek();
                   
              }///// fin if
                 
             }///// fin if
             
        }///// fin while
         
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
