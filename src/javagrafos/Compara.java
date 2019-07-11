/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javagrafos;
import java.util.Comparator;
/**
 *
 * @author danny
 */
public class Compara implements Comparator<Nodo> {

    @Override
    public int compare(Nodo o1, Nodo o2) {
        if (o1.getPesoAcumulado()>o2.getPesoAcumulado()){
                return 1;
            }else{
                return -1;
            }
    }

       
    }
