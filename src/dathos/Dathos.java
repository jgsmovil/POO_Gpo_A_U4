/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dathos;

/**
 *
 * @author Juana García
 */
public class Dathos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Informacion info = new Informacion("JGS","Sistemas",3);
        //encapsulamiento
        String NumCon = info.getNombre()+" "+info.getCarrera()+" "+info.getSemestre();
        System.out.println("\nDatos generales alumno(a) : "+NumCon);
        
    }
    // se crean metodos
}
