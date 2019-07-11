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
public class BusquedaAasterisco implements Busqueda {

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
         System.out.println( " Busqueda A* " );    
         int p=0;
        int pesoNodo = MatrizDePesos[inicio.getNombre()][inicio.getNombre()];
        inicio.setPeso(pesoNodo);
         NodoComparaGDN n = new NodoComparaGDN();
         PriorityQueue<Nodo> ColaDeP = new PriorityQueue<>(n);
         ArrayList<Integer> listavisitados = new ArrayList<Integer>();
         ColaDeP.add(inicio);
         listavisitados.add(-1);
         while(!ColaDeP.isEmpty()){
             inicio.setVisited(true);
               System.out.print( " : Nodo  " + ColaDeP.peek().getNombre()+" peso gn " + ColaDeP.peek().getGdn()+" : ");
             ColaDeP.remove();
              //System.out.print( " Nodo " +inicio.getNombre()+" Nodo Peso gn " +inicio.getGdn());
             // System.out.println();
              //System.out.print( " lista vi ++++++" +listavisitados.get(p));
              p++;
             // System.out.println();
             if (!listavisitados.contains(inicio.getNombre())) {
                 if (inicio.isVisited()==true && (busqueda.getNombre()==inicio.getNombre())) {
                     return" encontrado";
                 } else {
                     if(inicio.getLista().isEmpty()!=true)
                 {
                     for (int i = 0; i < inicio.getLista().size(); i++) {
                         Nodo Nodohijo =inicio.getLista().get(i);
                         int pesohijo = MatrizDePesos[inicio.getNombre()][Nodohijo.getNombre()];
                         if (Nodohijo.isExpandido()==true) {
                             Nodo Duplicado = clonarnodo(Nodohijo);
                           //  System.out.println("ADuplicado "+Duplicado.toString()+" Nodo Peso gn " +Duplicado.getGdn());
                             int PesoE=inicio.getPeso()+pesohijo;
                             Duplicado.setPeso(PesoE);
                            
                             Duplicado.setGdn(PesoE + Nodohijo.getHeuristica());
                            //  System.out.println("DDuplicado "+Duplicado.toString()+" Nodo Peso gn " +Duplicado.getGdn());
                              if(!Duplicado.isVisited()){
                                 ColaDeP.add(Duplicado);
                               //  System.out.println(" Entro Duplicado a Cola "+Duplicado.toString()+" Nodo Peso gn " +Duplicado.getGdn());
//                                 System.out.println("Entro A hijo a Cola "+Nodohijo.getNombre()+" peso "+Nodohijo.getPeso());
                              }
                             
                             PesoE=0;
                         } else {
                             Nodohijo.setExpandido(true);
                             int PesoNuevo = inicio.getPeso() + pesohijo;
                             Nodohijo.setPeso(PesoNuevo);
                             Nodohijo.setGdn(PesoNuevo + Nodohijo.getHeuristica());
                             //System.out.println(" S2 "+Nodohijo.toString()+" Nodo Peso gn " +Nodohijo.getGdn()); 
                             if(!Nodohijo.isVisited()){
                                  ColaDeP.add(Nodohijo);
                                  //System.out.println("Entro A hijo a Cola "+Nodohijo.getNombre()+" peso "+Nodohijo.getPeso()+" Nodo Peso gn " +Nodohijo.getGdn());
                             }
//                             
//                             for(Nodo v: ColaDeP){
//                                    System.out.println(v.getNombre()+"  peso  "+v.getPeso()+" Nodo Peso gn " +v.getGdn());
//                                    }
                            
                             PesoNuevo=0;
                             
                         }
                         
                     }
                 }
                     
                 }
             } else {
                 listavisitados.add(inicio.getNombre());
                 //ColaDeP.remove();
                  if(!ColaDeP.isEmpty()){
                  
                 inicio=ColaDeP.peek();
                 }
//                   for(Nodo v: ColaDeP){
//                                      System.out.println(v.getNombre()+"  peso "+v.getPeso()+" Nodo Peso gn " +v.getGdn());
//                                      }
//                 System.out.println("[[[[[[[[[continue ====== ");
                 continue;
             }
             if(!ColaDeP.isEmpty()){
                  listavisitados.add(inicio.getNombre());
                 inicio=ColaDeP.peek();
             }
//             System.out.println("  before while ");
//             for(Nodo v: ColaDeP){
//                                      System.out.println(v.getNombre()+"  peso "+v.getPeso()+" Nodo Peso gn " +v.getGdn());
//                                      }
//             System.out.println("  fin while ");
//              System.out.println("  ====== "+ColaDeP.peek());
             
             
         }
       return "No encontrado";  
    }//fin Metodo asterisco

    @Override
    public String Buscar(Nodo inicio, String op) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Buscar(Nodo inicio, Nodo busqueda, int profundidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Nodo clonarnodo(Nodo Adup) {
       Nodo Nododup = new Nodo();
        Nododup.setPeso(Adup.getPeso());
        Nododup.setNombre(Adup.getNombre());
        Nododup.setLista(Adup.getLista());
        Nododup.setExpandido(Adup.isExpandido());
        Nododup.setVisited(Adup.isVisited());
        Nododup.setGdn(Adup.getGdn());
        return Nododup;
    }
    
}
