/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagrafos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;

/**
 *
 * @author danny
 */
public class Busqueda {
    int i=0;
    int pos;
    int j=0;
    public  void recorrido(Nodo inicio,Nodo busqueda) {
         System.out.println("Recorriendo Profundidad ");
         Stack<Nodo> pila = new Stack<Nodo>();
         ArrayList<Nodo> lista = new ArrayList<Nodo>();
         ArrayList<Nodo> listaVisitados = new ArrayList<Nodo>();
         pila.push(inicio);
         while(!pila.isEmpty()){
             System.out.println("" + pila.peek().getNombre());
             if (inicio.getNombre() == busqueda.getNombre()) {
                 System.out.println("encontrado");
             } else {
                 inicio.setVisited(true);
                 pila.pop();
                 if (inicio.getLista().isEmpty() != true) {
                     for (int i = 0; i < inicio.getLista().size(); i++) {
                         if(!inicio.isVisited()){
                            pila.push(inicio.getLista().get(i));
                         }//// fin if
                     }///// fin for

                 }/////fin if

                 if (!pila.isEmpty()) {
                     inicio = pila.peek();
                 }
                 
             }//// fin if
             
            
        }//// fin del while
}
    
    
    public static void recorridoa(Nodo inicio,Nodo busqueda) {
        
         System.out.println("Recorriendo  Anchura ");
        
         Queue<Nodo> cola=new LinkedList();
         ArrayList<Nodo> lista = new ArrayList<Nodo>();
         ArrayList<Nodo> listac = new ArrayList<Nodo>();
         cola.add(inicio);
         
         while(!cola.isEmpty()){
             System.out.println(""+cola.peek().getNombre());
             if (inicio.getNombre() == busqueda.getNombre()) {
                 System.out.println("encontrado");
             } else {
                 inicio.setVisited(true);
                 cola.remove();
           
              if(inicio.getLista().isEmpty()!=true)
                 {
            
                   for(int i=0 ; i<inicio.getLista().size() ; i++){
                       if(!inicio.isVisited()){
                            cola.add(inicio.getLista().get(i));
                         }//// fin if
                     
                
                 }/////fin for
                   
              }///// fin if
              
              if(!cola.isEmpty()){
                   inicio=cola.peek();
              }///// fin if
                 
             }///// fin if
             
        }///// fin while
         
        
    }  
    
    
    
    public static Nodo recorridoAM(Nodo inicio, Nodo meta , int nivel) {
        
         System.out.println("Recorriendo  Anchura ");
         int i=0;
         Queue<Nodo> cola=new LinkedList();
         ArrayList<Nodo> lista = new ArrayList<Nodo>();
         ArrayList<Nodo> listac = new ArrayList<Nodo>();
         cola.add(inicio);
         
         if(inicio.getNombre()==meta.getNombre() & nivel==0){
             inicio.setNivel(0);
             return meta;
         }else{
             
            i++;
            
             for (int j = 0; j < i; j++) {
                 
               //  recorridoAM()
                 
             }
            
           
         
    }
         
        
         return inicio;
        
    }
    
    public ArrayList<Nodo> expandirNodo(Nodo Minodo){
        
        ArrayList<Nodo> Hijos;
         
        Hijos = new ArrayList<Nodo>(Minodo.getLista());
               
        return Hijos;
        
        
       
        
    }
   
   Stack<Nodo> pilap = new Stack<Nodo>();
    
   public  String profundidadIterativa(Nodo inicio, Nodo busqueda, int profundidad) {
        String rstd = "";
        inicio.setNivel(-1);
        for (int k = 0; k <= profundidad; k++) {
            System.out.println("");
            bpl(inicio);
            Stack<Nodo> s = new Stack<>();
            inicio.setNivel(0);
            s.push(inicio);
            while (!s.isEmpty()) {
                Nodo p = s.pop();
                rstd += p.getNombre()+ " ";
                System.out.print(p.getNombre()+ " ");
                p.setVisited(true);
                if (p.equals(busqueda)) {
                    System.out.println(":::Encontrado");
                    break;
                } else {
                    if (p.getNivel() < k && p.getNivel() != k) {
                        ArrayList<Nodo> hijos = p.getLista();
                        for (int i = (hijos.size() - 1); i >= 0; i--) {
                            if (!hijos.get(i).isVisited() && !hijos.get(i).isAdded()) {
                                hijos.get(i).setNivel(p.getNivel() + 1);
                                s.push(hijos.get(i));
                                hijos.get(i).setAdded(true);
                            }
                        }

                    }
                }

            }
        }
        return rstd;
    }

    
    public void bpl(Nodo n)
    {
       
        Stack<Nodo> s = new Stack<>();
        s.push(n);
        while (!s.isEmpty()) {
            Nodo p = s.pop();
//            System.out.println(p.getData());
            p.setVisited(false);
            p.setAdded(false);
            ArrayList<Nodo> hijos = p.getLista();
            for (int i = (hijos.size() - 1); i >= 0; i--) {
                if (hijos.get(i).isVisited() || hijos.get(i).isAdded()) {
                    hijos.get(i).setAdded(false);
                    hijos.get(i).setVisited(false);
                    s.push(hijos.get(i));
                }

            }

        }
    
    }
    
     public  void costoUniforme(Nodo inicio, Nodo busqueda) {
        LinkedHashSet<Nodo> ln = new LinkedHashSet<>();
        Compara n = new Compara();
        TreeSet<Nodo> ts = new TreeSet<>(n);
        ts.add(inicio);
        while (!ts.isEmpty()) {
            Nodo tmp = ts.first();
            removeFirst(ts);
//            ts.remove(ts);
            tmp.setVisited(true);
            System.out.println(tmp);
            if (tmp.equals(busqueda)) {
                System.out.println("Encontrado");
                break;
            } else {
                ArrayList<Nodo> hijos = tmp.getLista();
                
                for (Nodo hijo : hijos) {
                    if (!hijo.isVisited()) {
                        int peso = tmp.getPesoAcumulado() + tmp.getPeso(hijo);
                        if (hijo.isAdded()) {
                            Nodo nHijo = (Nodo) hijo;//                                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                            nHijo.setAnterior(tmp);
                            nHijo.setPesoAcumulado(peso);
                            ts.add(nHijo);
                        } else {
                            hijo.setAnterior(tmp);
                            hijo.setPesoAcumulado(peso);
//                          System.out.print(hijos.get(i)+ " ");
                            ts.add(hijo);
                            hijo.setAdded(true);
                        }
                    }
                }
                printPorVisitar(ts);
            }

        }

    }

    private  void removeFirst(TreeSet ts) {
        Iterator<Nodo> iterator = ts.iterator();
        iterator.hasNext();
        iterator.next();
        iterator.remove();
        iterator.toString();
    }

    private  void printPorVisitar(TreeSet ts) {
        Iterator<Nodo> iterator = ts.iterator();
        System.out.println("");
        System.out.println("Ordenado Dentro por Visitar");
        while (iterator.hasNext()) {
            Nodo nit = iterator.next();
            System.out.println(nit.toString());
        }
        System.out.println("Fin");
        System.out.println("");
    }
    
    
    
}
