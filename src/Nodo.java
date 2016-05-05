/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ariel
 */
public class Nodo {
    
    protected Object dato;
    protected Nodo izdo;
    protected Nodo dcho;
    private Object valor;
    
    public Nodo(Object valor)
    {
        dato= valor;
        izdo= dcho= null;
        
    }
    
    public Nodo(Nodo ramaIzdo, Object valor, Nodo ramaDcho)
    {
        this(valor);
        izdo= ramaIzdo;
        dcho= ramaDcho;
        
    }
    
    //operaciones de acceso
    
    public Object valorNodo() {
        
        return valor;
    }
    
    public Nodo subarbolIzdo(){
        return izdo;
        
    }
    public Nodo subarbolDcho(){
        return dcho;
        
    }
    public void nuevoValor(Object d){
        dato= d;
        
    }
    public void ramaIzdo(Nodo n){
        izdo= n;
        
    }
    public void ramaDcho(Nodo n){
        dcho= n;
    }
}
