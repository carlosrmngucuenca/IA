/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagrafos;

import java.util.ArrayList;

/**
 *
 * @author danny
 */
public class Grafo {
    Nodo Minodo;
    Rutas Miruta;
    ArrayList<Nodo> MisNodos = new ArrayList<Nodo>();
    ArrayList<Rutas> MisRutas = new ArrayList<Rutas>();
    int[][] MatrizAdyacenciaPR ;
    int tam;
    
   
    
    public void agregar_hijo(Rutas ruta){
     
        
        
    }
    
    public void crarMatriz(int tam){
        this.tam=tam;
        MatrizAdyacenciaPR = new int [this.tam+1][this.tam+1];
        for(int i=0; i< tam; i++){
            for(int j=0; j<tam; j++){
                MatrizAdyacenciaPR[i][j] = 0;
            }            
        }
        
    }
    
    
    
     public int rpesom (Nodo inicio , Nodo fin){
         int p=0;
         p=MatrizAdyacenciaPR[inicio.getNombre()][fin.getNombre()];
         return p;
    }
    
    
    public void agregar_nodo(Nodo Minodo){
        ArrayList<Nodo> lista = new ArrayList<Nodo>();
        MisNodos.add(Minodo);
        Minodo.setLista(lista);
        
    }
    
    public void agregar_arista(Rutas ruta){
        MisRutas.add(ruta);
        Nodo Inicio = ruta.getNodoInicio();
        Nodo Fin = ruta.getNodoFin();
        //System.out.println("Nodo Inicio - : "+ Inicio.getNombre()+" Nodo Fin : -  "+Fin.getNombre());
        System.out.println("Nodo Inicio : "+ MisNodos.get(ruta.getNodoInicio().getNombre()-1).getNombre()+" Nodo Fin : "+MisNodos.get(ruta.getNodoFin().getNombre()-1).getNombre());
        MisNodos.get(Inicio.getNombre()-1).setLista(MisNodos.get(Fin.getNombre()-1));
        MatrizAdyacenciaPR[ruta.getNodoInicio().getNombre()][ruta.getNodoFin().getNombre()] = ruta.getPesoRuta();
        
        
    }
   
    public  void limpiar(){
        for (int i = 0; i <MisNodos.size(); i++) {
              Nodo purga =MisNodos.get(i);
              purga.setAdded(false);
              purga.setVisited(false);
              purga.setExpandido(false);
              purga.setPeso(0);
              purga.setGdn(0);
              purga.setNivel(0);
        }
    }
    
    public void imprimir(){
        for(int i=1; i<= tam; i++){
            for(int j=1; j<= tam; j++){
                System.out.print( MatrizAdyacenciaPR[i][j] + "  " );        
            }
            System.out.println();
        }  
    }

    public ArrayList<Nodo> getMisNodos() {
        return MisNodos;
    }

    public void setMisNodos(ArrayList<Nodo> MisNodos) {
        this.MisNodos = MisNodos;
    }

    public ArrayList<Rutas> getMisRutas() {
        return MisRutas;
    }

    public void setMisRutas(ArrayList<Rutas> MisRutas) {
        this.MisRutas = MisRutas;
    }

    public int[][] getMatrizAdyacencia() {
        return MatrizAdyacenciaPR;
    }

    public void setMatrizAdyacencia(int[][] MatrizAdyacencia) {
        this.MatrizAdyacenciaPR = MatrizAdyacencia;
    }
    
    
    
    
    
    
}
