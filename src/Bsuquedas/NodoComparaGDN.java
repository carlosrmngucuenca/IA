/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bsuquedas;

import java.util.Comparator;
import javagrafos.Nodo;

/**
 *
 * @author danny
 */
public class NodoComparaGDN implements Comparator<Nodo>{

    @Override
    public int compare(Nodo o1, Nodo o2) {
         if(o1.getGdn() > o2.getGdn()) {
            return 1;
        } else if (o1.getGdn() < o2.getGdn()) {
            return -1;
        } else {
            return 0;
        }
        
    }
    
}
