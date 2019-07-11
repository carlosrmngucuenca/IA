/*
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bsuquedas;

import javagrafos.Nodo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author morotxo
 */
public class Bidireccional implements Busqueda {

    @Override
    public void Buscar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Buscar(Nodo inicio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param inicio
     * @param busqueda
     * @return
     */
    @Override
    public String Buscar(Nodo inicio, Nodo busqueda) {
        System.out.println("Bsuqueda   Bidireccional  ");
        long start_time = System.nanoTime();
        
        Nodo fin = busqueda;
        LinkedList<Nodo> nInicio = new LinkedList<>();
        LinkedList<Nodo> nFin = new LinkedList<>();
        nInicio.push(inicio);
        nFin.push(fin);
        while (!nInicio.isEmpty()) {
          
                //analizamos el inicio
                
                Nodo tmpI = nInicio.pop();
                System.out.println(tmpI.getNombre());
                tmpI.setVisited(true);
              
                boolean cE = false;
                ArrayList<Nodo> hijos = tmpI.getLista();
                for (Nodo hijo : hijos) {
                    if (!hijo.isVisited() && !hijo.isAddedInicio()) {
                        cE = combrobarExistencia(nFin.iterator(), hijo);
                        if (cE) {
                           
                            System.out.println("Encontrado");
                            System.out.println(hijo.getNombre());
                            nInicio.add(tmpI);
                            long end_time = System.nanoTime();
                            double difference = (end_time - start_time) / 1e6;
                           
                            return "encontrado";
                        } else {
                            nInicio.addLast(hijo);
                            hijo.setAddedInicio(true);
                        }

                    }
                }
                //analizamos el final
                try {
                    Nodo tmpF = nFin.pop();
                    System.out.println(tmpF.getNombre());
                    tmpF.setVisited2(true);
                    
                    ArrayList<Nodo> hijos2 = tmpF.getLista();
                    for (Nodo hijo : hijos2) {
                        if (!hijo.isVisited2() && !hijo.isAddedFin()) {
                            cE = combrobarExistencia(nInicio.iterator(), hijo);
                            if (cE) {
                              
                                System.out.println("Encontrado");
                                
                                System.out.println(hijo.getNombre());
                                nFin.add(tmpI);
                                long end_time = System.nanoTime();
                                double difference = (end_time - start_time) / 1e6;
                               
                                return "hola";
                            } else {
                                nFin.addLast(hijo);
                                hijo.setAddedFin(true);
                            }
                        }
                    }
                } catch (NoSuchElementException ex) {

                }

           

        }
        //Cuando no ha encontrado el final
        long end_time = System.nanoTime();
        double difference = (end_time - start_time) / 1e6;
        
        return "no hay nada ";
    }


    public boolean combrobarExistencia(Iterator it, Nodo b) {
        while (it.hasNext()) {
            Nodo tmpIt = (Nodo) it.next();
            if (tmpIt.equals(b)) {
                System.out.println("    " + b.getNombre() + ": Esta en la otra lista");
                return true;
            }
        }
        System.out.println("    " + b.getNombre() + ": No esta en la otra Lista");
        return false;
    }

    @Override
    public String Buscar(Nodo inicio, Nodo busqueda, int profundidad) {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Buscar(Nodo inicio, String op) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

    @Override
    public String Buscar(Nodo inicio, Nodo busqueda, int[][] MatrizDePesos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
