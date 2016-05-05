/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preorden;

/**
 *
 * @author Ariel
 */
public static void preorden(Nodo r) 
{
    if(r !=null)
{
    r.visitar();
    preorden (r.subarbolIzdo());
    preorden (r.subarbolDcho());
}

}

//recurrido de un arbol binario en inorden

public static void inorden(Nodo r)
{
    if(r !=null)
{
    inorden (r.subarbolIzdo());
    r.visitar();
    inorden (r.subarbolDcho());
}
}
//recurrido de un arbol binario en postorden

public static void postorden(Nodo r)
{
    if(r !=null)
    {
        postorden (r.subarbolIzdo());
        postorden (r.subarbolDcho());
        r.visitar();
} 

}
