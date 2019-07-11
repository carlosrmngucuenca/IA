/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bsuquedas;
import javagrafos.Nodo;

/**
 *
 * @author danny
 */
public interface Busqueda {
    
    public void Buscar();
    public String Buscar(Nodo inicio);
    public String Buscar(Nodo inicio, Nodo busqueda);
    public String Buscar(Nodo inicio, Nodo busqueda, int[][] MatrizDePesos);
    public String Buscar(Nodo inicio, String op);
    public String Buscar(Nodo inicio, Nodo busqueda, int profundidad );
    
}
