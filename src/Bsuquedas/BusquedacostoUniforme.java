/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bsuquedas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import javagrafos.Grafo;
import javagrafos.Nodo;

/**
 *
 * @author danny
 */
public class BusquedacostoUniforme implements Busqueda {
    Grafo Migrafo;
    @Override
    public void Buscar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Buscar(Nodo inicio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Buscar(Nodo inicio, Nodo busqueda, int[][] MatrizDePesos) {
        int p=0;
        System.out.println( " Busqueda Costo Uniforme " );    
        int pesoNodo = MatrizDePesos[inicio.getNombre()][inicio.getNombre()];
//         System.out.println( "  " +pesoNodo);
        inicio.setPeso(pesoNodo);
         NodoComparaPesos n = new NodoComparaPesos();
         PriorityQueue<Nodo> ColaDeP = new PriorityQueue<>(n);
         ArrayList<Integer> listavisitados = new ArrayList<Integer>();
         ArrayList<Integer> arrayListCantH = new ArrayList<Integer>();
         Comparator<Integer> comparador = Collections.reverseOrder();
         String cadena ="";
         
         ColaDeP.add(inicio);
         listavisitados.add(0);
         int profundidad =0;
         inicio.setNivel(profundidad);
          
         while(!ColaDeP.isEmpty()){
             inicio.setVisited(true);
             System.out.print( " : Nodo  " + ColaDeP.peek().getNombre()+" peso " + ColaDeP.peek().getPeso()+" : ");
             ColaDeP.remove();
             // System.out.print( " Nodo " +inicio.getNombre()+" Nodo Peso" +inicio.getPeso());
//              System.out.println();
              
             // System.out.print( " lista vi " +listavisitados.get(p));
              p++;
              
             if (!listavisitados.contains(inicio.getNombre())) {
                  System.out.print( " ");
                 if (inicio.isVisited()==true && (busqueda.getNombre()==inicio.getNombre())) {
                     return" encontrado";
                 } else {
                     if(inicio.getLista().isEmpty()!=true)
                 {
                     for (int i = 0; i < inicio.getLista().size(); i++) {
                         int cantidadH=inicio.getLista().size();
                         arrayListCantH.add(cantidadH);
                         Nodo Nodohijo =inicio.getLista().get(i);
                         int pesohijo = MatrizDePesos[inicio.getNombre()][Nodohijo.getNombre()];
                         if (Nodohijo.isExpandido()==true) {
                             Nodo Duplicado = clonarnodo(Nodohijo);
                            // System.out.println("ADuplicado "+Duplicado.toString());
                             int PesoE=inicio.getPeso()+pesohijo;
                             Duplicado.setPeso(PesoE);
                               //System.out.println("DDuplicado "+Duplicado.toString());
                               if(!Duplicado.isVisited()){
                                   ColaDeP.add(Duplicado);
                                   //System.out.println("Entro A Dup Cola"+Duplicado.getNombre()+" peso "+Duplicado.getPeso());
                               }
//                                for(Nodo v: ColaDeP){
//                                      System.out.println(v.getNombre()+" Peso "+v.getPeso());
//                                      }
                             
                             PesoE=0;
                         } else {
                             Nodohijo.setExpandido(true);
                             int PesoNuevo = inicio.getPeso() + pesohijo;
                             Nodohijo.setPeso(PesoNuevo);
//                             System.out.println(" S2 "+Nodohijo.toString()); 
                             if(!Nodohijo.isVisited()){
                                 ColaDeP.add(Nodohijo);
                                 Nodohijo.setNivel(1+inicio.getNivel());
                                  //System.out.println("Entro A hijo a Cola "+Nodohijo.getNombre()+" peso "+Nodohijo.getPeso());
                             }
//                             for(Nodo v: ColaDeP){
//                                     // System.out.println(v.getNombre()+"  peso "+v.getPeso());
//                                      }
                             PesoNuevo=0;
                             
                         }
                         
                     }
                 }
                     
                 }// fin if principal
             } else {
//                 System.out.println( " Entra para sacar  ");
                   listavisitados.add(inicio.getNombre());
                 //ColaDeP.remove();
                  if(!ColaDeP.isEmpty()){
                  
                 inicio=ColaDeP.peek();
                 }// fin lista compara 
                // System.out.println("continue   ppp");
                 continue;
             }
             if(!ColaDeP.isEmpty()){
                  listavisitados.add(inicio.getNombre());
                 inicio=ColaDeP.peek();
             }
//              System.out.println("  before while ");
//             for(Nodo v: ColaDeP){
//                                      System.out.println(v.getNombre()+"  peso "+v.getPeso());
//                                      }
//             System.out.println("  fin while ");
//              System.out.println("  ====== "+ColaDeP.peek());
             
         }//fin while
         
       return "No encontrado";  
    }
     public void recorrerEspera()  {
     
    }
     public Nodo clonarnodo(Nodo Adup){
        Nodo Nododup = new Nodo();
        Nododup.setPeso(Adup.getPeso());
        Nododup.setNombre(Adup.getNombre());
        Nododup.setLista(Adup.getLista());
        Nododup.setExpandido(Adup.isExpandido());
        Nododup.setVisited(Adup.isVisited());
        return Nododup;
        
    }

    

    @Override
    public String Buscar(Nodo inicio, String op) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Buscar(Nodo inicio, Nodo busqueda, int profundidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Buscar(Nodo inicio, Nodo busqueda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
