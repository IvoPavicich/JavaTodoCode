package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.logica.ControladoraLogica;
import java.util.Date;

public class JpaPrueba {

    public static void main(String[] args) {
        
        ControladoraLogica control = new ControladoraLogica();
        Carrera carre = new Carrera(3,"Ingenieria en Quimica");
        control.crearCarrera(carre);
        
        Alumno al= new Alumno(13,"Ivana","Marconich", new Date(),carre);
        control.crearAlumno(al);
        System.out.println("----------------------------------------------");
        System.out.println("-----------------DATOS ALUMNO------------------");
        Alumno alu = control.traerAlumno(13);
        System.out.println("Alumno : "+ alu.getNombre()+" "+alu.getApellido());
        System.out.println("Cursa la carrera de :"+ alu.getCarre().getNombre());
        
        
        //CARGA DE UN NUEVO ALUMNO
        /*Alumno al2= new Alumno(23,"Ibra","Th Yorkie"+ " ", new Date());*/
        /*control.crearAlumno(al2);*/
        //ELIMINACION
        /*control.eliminarAlumno(23);*/
        //MODIFICACION
        /*al2.setApellido("The Yorkie");
        control.editarAlumno(al2);*/
        //------------------------TRAER UN REGISTRO/S DE LA BD--------------
        /*Alumno alu = control.traerAlumno(15);
        System.out.println("-------BÚSQUEDA INDIVIDUAL--------");
        System.out.println("El alumno :"+ alu.toString());
    
        System.out.println("-------BÚSQUEDA DE TODOS--------------");
        ArrayList<Alumno> listaAlumnos= control.traerListaAlumnos();
        for(Alumno al :listaAlumnos){
            System.out.println("El alumnos es: "+ al.toString());
        }*/
    }
}
