/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.clases.estructurat2;

import java.util.Arrays;

/**
 *
 * @author HP
 */
public class EstructuraT2 {

    public static void main(String[] args) {
        System.out.println("colas y pilas implementos generica");
        //instancias de las clases
        ColaTarea<String> colaTareas = new ColaTarea<>();
        ColaTarea<Integer> colaTareasInt = new ColaTarea<>();//ingresar 3 elementos
        ColaTarea<int[]> colaTareasArregloEnteros = new ColaTarea<>();//Ingresar 3 elementos
        ColaTarea<String[]> colaTareasArregloString = new ColaTarea<>();//Ingresar 3 elementos
        
        //clase pilatarea
        PilaTareas<Integer>pilaTareas = new PilaTareas<>();
        PilaTareas<ColaTarea>pilaTareasDeColas = new PilaTareas<>();
        
        //Insercion de tareas a la cola
        colaTareas.agregarTarea(new Tarea(1, "Taea1"));
        colaTareas.agregarTarea(new Tarea(2, "Taea2"));
        colaTareas.agregarTarea(new Tarea(3, "Taea3"));
        colaTareas.agregarTarea(new Tarea(4, "Taea5"));
        colaTareas.agregarTarea(new Tarea(5, "Taea6"));
        
        colaTareasInt.agregarTarea(new Tarea(6,6 ));
        colaTareasInt.agregarTarea(new Tarea(7,7 ));
        colaTareasInt.agregarTarea(new Tarea(8,8 ));
        
        
        //int[] a =[1,2,3];
        
        Tarea<int[]> t2= new Tarea(8, new int []{212,21,});
        colaTareasArregloEnteros.agregarTarea(t2);
        colaTareasArregloEnteros.agregarTarea(new Tarea(9, new int []{212,21,}));
        
        
        //Iinsercion
        pilaTareas.agregarTarea(new Tarea(6,6));
        pilaTareas.agregarTarea(new Tarea(7,7));
        pilaTareas.agregarTarea(new Tarea(8,8));

        //prosesar las tareas de la cola <Strign>
         while (!colaTareas.estaVacia()) {
            Tarea<String> tareaProcesada = colaTareas.procesarTarea();

            //prosesar tareas de las pila<Integer>
            System.out.println("Procesando tarea de la cola: \n\t Sale-->" + tareaProcesada.getId() + "-" + tareaProcesada.getAtributo());
        }
        System.out.println("-------------------------------------------------");

        while (!colaTareasInt.estaVacia()) {
            Tarea<Integer> tareaProcesadaInt = colaTareasInt.procesarTarea();
            System.out.println("Procesando tarea cola: \n\t Sale-->" + tareaProcesadaInt.getId() + "-" + tareaProcesadaInt.getAtributo());
        }
        System.out.println("-------------------------------------------------");
        while (!colaTareasArregloEnteros.estaVacia()) {
            Tarea<int[]> tProceAE = colaTareasArregloEnteros.procesarTarea();
            System.out.println("Procesando \n\t Sale-->" + tProceAE.getId() + "-" + Arrays.toString(tProceAE.getAtributo()));
        }
        
        System.out.println("---------------------------------------------------------");
        while(!colaTareasArregloString.estaVacia()){
            Tarea<String[]> tProAS = colaTareasArregloString.procesarTarea();
            System.out.println("Procesando \n\t Sale-->" + tProAS.getId() + "-" + Arrays.toString(tProAS.getAtributo()));
        }
        
        System.out.println("---------------------------------------------------");
        while (!pilaTareas.estaVacia()) {
            Tarea<Integer> tareaProcesadaP = pilaTareas.procesarTarea();
            System.out.println("Procesando tarea de pila: \n\t Sale-->" + tareaProcesadaP.getId() + "-" + tareaProcesadaP.getAtributo());
        }
        
        System.out.println("------------------------------------------");
    }
}
