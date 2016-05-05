/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolBinario;

import nodo.Nodo;

/**
 *
 * @author Ariel
 */
public class arbolBinario {
    
    protected Nodo raiz;
    
    public arbolBinario()
    {
        raiz= null;
    }
    public arbolBinario(Nodo raiz)
    {
        this.raiz= raiz;
    }
    
    public Nodo raizArbol()
    {
        return raiz;
    }
    //comprueba el status del arbol
    
    boolean esVacio()
    {
        return raiz== null;
    }
    
    }
}
