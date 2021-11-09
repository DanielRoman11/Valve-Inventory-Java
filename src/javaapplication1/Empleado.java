/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author nikos
 */
public class Empleado extends Persona{

    public Empleado(int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
    }
    
    public Empleado() {
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setId(int id) {
        super.setId(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEdad(int edad) {
        super.setEdad(edad); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setApellido(String apellido) {
        super.setApellido(apellido); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getEdad() {
        return super.getEdad(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getApellido() {
        return super.getApellido(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        return super.getNombre(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getId() {
        return super.getId(); //To change body of generated methods, choose Tools | Templates.
    }
    ArrayList<Persona> listaEmpleados = new ArrayList<>();
    public void crearEmpleado(){
        Persona persona = new Persona();
        persona.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del empleado: "));
        persona.setApellido(JOptionPane.showInputDialog("Ingrese el apellido del empleado: "));
        persona.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado: ")));
        persona.setId(listaEmpleados.size()+1);
        listaEmpleados.add(persona);
    }
    public void añadirEmpleado(String nombre, String apellido, int edad){
       Persona persona = new Persona();
       persona.setNombre(nombre);
       persona.setApellido(apellido);
       persona.setEdad(edad);
       persona.setId(listaEmpleados.size()+1);
       listaEmpleados.add(persona);
    }
    public void revisarListaEmpleados(){
        for (int i = 0; i < listaEmpleados.size(); i++) {
            System.out.print(listaEmpleados.get(i).getNombre());
            System.out.print(" ");
            System.out.print(listaEmpleados.get(i).getApellido());
            System.out.print(", edad ");
            System.out.println(listaEmpleados.get(i).getEdad()); 
            System.out.println("*****"); 
        }
        
    }
    public void revisarEmpleado(){
        int iden = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de la persona a revisar: "));
        System.out.println(listaEmpleados.get(iden));
    }
}
