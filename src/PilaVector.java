/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ariel
 */
import TipoPila.PilaVector;


    
    ArbolBinario arbol;
    Nodo a1, a2, a;
    PilaVector pila= new PilaVector();
    
    
    a1= ArbolBinario.nuevoArbol(null, "Maria", null);
    a2= ArbolBinario.nuevoArbol(null, "Rodrigo", null);
    a= ArbolBinario.nuevoArbol(a1, "Esperanza", a2);
    pila.insertar(a);
    
    a1= ArbolBinario.nuevoArbol(null, "Anyora", null);
    a2= ArbolBinario.nuevoArbol(null, "Abel", null);
    a= ArbolBinario.nuevoArbol(a1, "M Jesus", a2);
    pila.insertar(a);
    
    a2=(Nodo) pila.quitar();
    a1= (Nodo) pila.quitar();
    a= ArbolBinario.nuevoArbol(a1,"Esperanza",a2);
    arbol= new ArbolBi;
