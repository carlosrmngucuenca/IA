/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagrafos;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Estudiante
 */
public class Nodo {
    
    int Nombre;

    public boolean isAdded() {
        return added;
    }

    public void setAdded(boolean added) {
        this.added = added;
    }

    public boolean isAddedInicio() {
        return addedInicio;
    }

    public void setAddedInicio(boolean addedInicio) {
        this.addedInicio = addedInicio;
    }

    public boolean isAddedFin() {
        return addedFin;
    }

    public void setAddedFin(boolean addedFin) {
        this.addedFin = addedFin;
    }

    public boolean isVisited2() {
        return visited2;
    }

    public void setVisited2(boolean visited2) {
        this.visited2 = visited2;
    }
    private boolean visited;
    private int nivel;
    private boolean expandido;
    private int peso;
    private boolean added;
    private boolean addedInicio;
    private boolean addedFin;
     private boolean visited2;
     private int heuristica;
     private int gdn;
     private int id;
     
      public Nodo() {
      
    }

    public Nodo(String data) {
        
    }

    public Nodo(int id,int Nombre, int heuristica) {
       
        
        this.id = id;
        this.Nombre = Nombre;
        this.heuristica = heuristica;
    }

    
     

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
     
    public int getGdn() {
        return gdn;
    }

    public void setGdn(int gdn) {
        this.gdn = gdn;
    }
     

    public int getHeuristica() {
        return heuristica;
    }

    public void setHeuristica(int heuristica) {
        this.heuristica = heuristica;
    }

    public int getPeso() {
        return peso;
    }
    
    

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    
   

    public HashMap<String, Integer> getPesos() {
        return pesos;
    }

    public void setPesos(HashMap<String, Integer> pesos) {
        this.pesos = pesos;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    private HashMap<String, Integer> pesos;
    private Nodo anterior;
    private int pesoAcumulado;
    
    ArrayList<Nodo> Lista ;

    public int getNombre() {
        return Nombre;
    }

    public void setNombre(int Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Nodo> getLista() {
        return Lista;
    }

    public void setLista(ArrayList<Nodo> Lista) {
        this.Lista = Lista;
    }
    
    public void ingresar(int i, int num2){
        
    }

    void setLista(Nodo Nodo2) {
        Lista.add(Nodo2); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean isVisited) {
        this.visited = isVisited;
    }

    public boolean isExpandido() {
        return expandido;
    }

    public void setExpandido(boolean expandido) {
        this.expandido = expandido;
    }
    
  
    
     public int getPesoAcumulado() {
        return pesoAcumulado;
    }

    public void setPesoAcumulado(int pesoAcumulado) {
        this.pesoAcumulado = pesoAcumulado;
    }
    
    public int getPeso(Nodo n) {
        Integer p = pesos.get(n.getNombre());
        if (p == null) {
            return 0;
        }
        return p;
    }
    
    public Nodo clonarnodo(Nodo Adup){
        Nodo Nododup = new Nodo();
        Nododup.setPeso(Adup.getPeso());
        Nododup.setNombre(Adup.getNombre());
        Nododup.setLista(Adup.getLista());
        return Nododup;
        
    }

    @Override
    public String toString() {
        return "Nodo{" + "Nombre=" + Nombre + ", visited=" + visited + ", expandido=" + expandido + ", peso=" + peso + ", heuristica=" + heuristica + ", gdn=" + gdn + '}';
    }

   
    
    
    
    
}
