/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagrafos;

import Bsuquedas.Amplitud;
import Bsuquedas.Avara;
import Bsuquedas.Bidireccional;
import Bsuquedas.BusquedaAasterisco;
import Bsuquedas.BusquedacostoUniforme;
import Bsuquedas.Gradiente;
import Bsuquedas.PrimeroElMejor;
import Bsuquedas.Profundidad;
import Bsuquedas.ProfundidadIterativa;
import Datos.AccessData;
import Datos.Conexion;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class JavaGrafos {

    
     static Grafo Migrafo ;
    
    public static void main(String[] args) {
      
        Conexion conexion = new Conexion();

        int cantidad =0;
        int dato=0;
        Migrafo = new Grafo();
        System.out.println("Ingrese cantidad de objetos");
        Scanner ingreso = new Scanner(System.in);
        cantidad=ingreso.nextInt();
        Random aleatorionum1= new Random();
    
   
  
      
        for (int i=1;i<=cantidad;i++){
             int al =aleatorionum1.nextInt(100);
             Nodo MiNodo = new Nodo(i,i,al);
             //System.out.println(""+MiNodo.toString());
             Migrafo.agregar_nodo(MiNodo);
           
        }
//        
//         Nodo minodo1 = new Nodo(1,1,5);
//         Nodo minodo2  = new Nodo(2,2,7);
//         Nodo minodo3 = new Nodo(3,3,3);
//         Nodo minodo4 = new Nodo(4,4,4);
//         Nodo minodo5 = new Nodo(5,5,6);
//         Nodo minodo6 = new Nodo(6,6,5);
//         Nodo minodo7 = new Nodo(7,7,6);
//         Nodo minodo8 = new Nodo(8,8,0);
//         Nodo minodo9 = new Nodo(9,9,0);
//         Nodo minodo10 = new Nodo(10,10,0);
      
        Migrafo.crarMatriz(cantidad);
//        Rutas miruta1 = new Rutas(minodo1, minodo2, 5);
//        Rutas miruta2 = new Rutas(minodo1, minodo3, 9);
//        Rutas miruta3 = new Rutas(minodo4, minodo1, 6);
//        Rutas miruta4 = new Rutas(minodo1, minodo5, 6);
//        Rutas miruta5 = new Rutas(minodo2, minodo8, 9);
//        Rutas miruta6 = new Rutas(minodo2, minodo3, 3);
//        Rutas miruta7 = new Rutas(minodo3, minodo2, 2);
//        Rutas miruta8 = new Rutas(minodo3, minodo4, 1);
//        Rutas miruta9 = new Rutas(minodo5, minodo4, 2);
//        Rutas miruta10 = new Rutas(minodo4, minodo9, 5);
//        Rutas miruta11 = new Rutas(minodo4, minodo7, 7);
//        Rutas miruta12 = new Rutas(minodo7, minodo5, 2);
//        Rutas miruta13 = new Rutas(minodo5, minodo6, 2);
//        Rutas miruta14 = new Rutas(minodo6, minodo10, 7);
//        Rutas miruta15 = new Rutas(minodo7, minodo10, 8);
         
        
//       
//        Migrafo.agregar_nodo(minodo1);
//        Migrafo.agregar_nodo(minodo2);
//        Migrafo.agregar_nodo(minodo3);
//        Migrafo.agregar_nodo(minodo4);
//        Migrafo.agregar_nodo(minodo5);
//        Migrafo.agregar_nodo(minodo6);
//        Migrafo.agregar_nodo(minodo7);
//        Migrafo.agregar_nodo(minodo8);
//        Migrafo.agregar_nodo(minodo9);
//        Migrafo.agregar_nodo(minodo10);
        
//        Migrafo.agregar_arista(miruta1);
//        Migrafo.agregar_arista(miruta2);
//        Migrafo.agregar_arista(miruta3);
//        Migrafo.agregar_arista(miruta4);
//        Migrafo.agregar_arista(miruta5);
//        Migrafo.agregar_arista(miruta6);
//        Migrafo.agregar_arista(miruta7);
//        Migrafo.agregar_arista(miruta8);
//        Migrafo.agregar_arista(miruta9);
//        Migrafo.agregar_arista(miruta10);
//        Migrafo.agregar_arista(miruta11);
//        Migrafo.agregar_arista(miruta12);
//        Migrafo.agregar_arista(miruta13);
//        Migrafo.agregar_arista(miruta14);
//        Migrafo.agregar_arista(miruta15);
        aleatorio();
        Amplitud am = new Amplitud();
        Profundidad pr = new Profundidad();
        Bidireccional bd = new Bidireccional();
        ProfundidadIterativa pit = new ProfundidadIterativa();
        BusquedacostoUniforme bcu = new  BusquedacostoUniforme();
        BusquedaAasterisco As = new BusquedaAasterisco();
         int inicio = 0;
        int fin = 0;
        System.out.println("Ingrese Inicio");
        Scanner i = new Scanner(System.in);
        inicio=i.nextInt();
        System.out.println("Ingrese Fin");
        Scanner f = new Scanner(System.in);
        fin=f.nextInt();
       
        Nodo  minodo1 = Migrafo.getMisNodos().get(inicio-1);
        Nodo  minodo9 = Migrafo.getMisNodos().get(fin-1);
        System.out.println("   ");
        System.out.println(" "+am.Buscar(minodo1, minodo9)); ;
         System.out.println("  ");
//         for (int i = 0; i <Migrafo.getMisNodos().size(); i++) {
//              Nodo purga =Migrafo.getMisNodos().get(i);
//              purga.setAdded(false);
//              purga.setVisited(false);
//        }
         String[][] nombre = new String[8][2];
        Migrafo.limpiar();
        pr.Buscar(minodo1, minodo9);
       // nombre[0][0]=pr;
        System.out.println("  ");
        Migrafo.limpiar();
      //  bd.Buscar(minodo1, minodo9);
        System.out.println("  ");
         Migrafo.limpiar();
        // pit.EjecucionProfundidadIterativa(minodo1, minodo9);
        bcu.Buscar(minodo1, minodo9,Migrafo.getMatrizAdyacencia());
        Migrafo.limpiar();
        System.out.println("  ");
        As.Buscar(minodo1, minodo9,Migrafo.getMatrizAdyacencia());
        Migrafo.limpiar();
        System.out.println("  ");
        Gradiente gr = new Gradiente();
        gr.Buscar(minodo1);
         System.out.println("  ");
         Migrafo.limpiar();
        System.out.println("  ");
        PrimeroElMejor pm = new PrimeroElMejor();
        pm.Buscar(minodo1);
         System.out.println("  ");
         Migrafo.limpiar();
        Avara av = new Avara();
        av.Buscar(minodo1, minodo9,Migrafo.getMatrizAdyacencia());
         System.out.println("  ");
         //Guardar();
//       
//        
        
        
        
        
//         Migrafo = new Grafo();
//         for (int i = 0; i <cantidad; ++i) {
//            Nodo MiNodo = new Nodo();
//            MiNodo.setNombre(i);
//            Migrafo.agregar_nodo(MiNodo);
//            
//             }
//         
//         int matrizAD[][] = new int[cantidad+1][cantidad+1];
//         int matrizADP[][] = new int[cantidad+1][cantidad+1];
//         
//   String nombreArchivo = "Ecuador_Distancias.csv";
//   String rutaArchivo = "/home/danny/Escritorio" + nombreArchivo;
//   String hoja = "Hoja1";
//   BufferedReader br = null;
//   
//   
//        System.out.println("entra "); 
//      try {
//         
//         br =new BufferedReader(new FileReader("/home/danny/Escritorio/Ecuador_Distancias.csv"));
//         String line = br.readLine();
//         while (null!=line) {
//            String [] fields = line.split(SEPARATOR);
//           
//            
//            fields = removeTrailingQuotes(fields);
//            System.out.println(Arrays.toString(fields));
//           
//            line = br.readLine();
//         }
//         
//      } catch (Exception e) {
//        
//      } finally {
//         if (null!=br) {
//             try {
//                 br.close();
//             } catch (IOException ex) {
//                 Logger.getLogger(JavaGrafos.class.getName()).log(Level.SEVERE, null, ex);
//             }
//         }
//       
//         
//         
//         
//       

    }//fin main
     
    
//    public static void generaraleatorio(){
//        Migrafo.MisNodos.get(0);
//        
//    }
    static Random aleatorionum;
    static Random aleatoriopeso;
   
   public static void aleatorio(){
      aleatorionum = new Random();
      aleatoriopeso = new Random();
      
       int vector[] = {1, 2};
       for(int i=1 ; i<=Migrafo.getMisNodos().size() ; i++){
           if (i==1) {
               Nodo Inicio = Migrafo.getMisNodos().get(i - 1);
               Nodo Fin = Migrafo.getMisNodos().get(i);
               CreaArista(Inicio, Fin, i);
           } else {
               if (i==2) {
                   continue;
               }
               
               int a = aleatorionum.nextInt(i-1);
               int p= 1+aleatoriopeso.nextInt(100);
               Nodo Inicio = Migrafo.getMisNodos().get(a);
               Nodo Fin = Migrafo.getMisNodos().get(i-1);
               CreaArista(Inicio, Fin, p);
           }
          
           
       }
   }
   
   public static void CreaArista(Nodo Inicio , Nodo Fin , int peso){
       Rutas miruta1 = new Rutas(Inicio, Fin, peso);
       Migrafo.agregar_arista(miruta1);
       
       
   }
      
      
         
        
            
	
 private static void Guardar() {
     AccessData Data = new AccessData();
     for(Nodo minodo : Migrafo.getMisNodos())
{
    Data.insetarNodo(minodo);
}
     
   for(Rutas miruta : Migrafo.getMisRutas())
{
    Data.insetarArista(miruta);
}
     
 }
		
    
    
    
    
    
}// fin main clase
    
//     private static String[] removeTrailingQuotes(String[] fields) {
//
//      String result[] = new String[fields.length];
//
//      for (int i=0;i<result.length;i++){
//         result[i] = fields[i].replaceAll("^"+QUOTE, "").replaceAll(QUOTE+"$", "");
//      }
//      return result;
//   }

