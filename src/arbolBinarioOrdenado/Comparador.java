/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolBinarioOrdenado;

/**
 *
 * @author Ariel
 */
public interface Comparador {
    
    boolean igualQue(Object q);
    boolean menorQue(Object q);
    boolean menorIgualQue(Object q);
    boolean mayorQue(Object q);
    boolean mayorIgualQue(Object q);
}

class Estudiante implements Comparador
{
    int numMat;
    String nombre;
    
    public boolean menorQue(Object op2) {
        Estudiante p2= (Estudiante) op2;
        return numMat <p2.numMat;
    }
    
    public boolean igualQue(Object op2) {
       Estudiante p2= (Estudiante) op2;
        return p2.numMat == numMat;
    }

    
    public boolean menorIgualQue(Object op2) {
       Estudiante p2= (Estudiante) op2;
        return numMat <=p2.numMat;
    }

    
    public boolean mayorQue(Object op2) {
     Estudiante p2= (Estudiante) op2;
        return numMat >p2.numMat;
    }

    
    public boolean mayorIgualQue(Object op2) {
       Estudiante p2= (Estudiante) op2;
        return numMat >=p2.numMat;
    }

}