/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author juanoviedo28
 */
public class Persona {
    
    private String apellido;
    private String nombre;
    private String documento;

    public Persona() {
    }

    public Persona(String apellido, String nombre, String documento) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.documento = documento;
    }
    
    public void mostrarDatos(){
    
        System.out.println("El apellido de la persona1 es: "+apellido);
        System.out.println("El nombre de la persona1 es: "+nombre);
        System.out.println("El apellido de la persona1 es: "+documento);
    }
    
    
}
