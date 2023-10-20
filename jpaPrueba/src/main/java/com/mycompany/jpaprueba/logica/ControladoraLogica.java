package com.mycompany.jpaprueba.logica;

import com.mycompany.jpaprueba.persistencia.ControladoraPersistencia;
import java.util.ArrayList;

public class ControladoraLogica {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
//---------------------ALUMNO-----------------------------------------------------------
    public void crearAlumno(Alumno alu) {
        controlPersis.crearAlumno(alu);
    }
    public void eliminarAlumno(int id) {
        controlPersis.eliminarAlumno(id);
    }
    public void editarAlumno(Alumno alu) {
        controlPersis.editarAlumno(alu);
    
    }
    //¿Por que Alumno y NO void?=>xq trar alumno es una funcion que tiene que devolver un objeto
    public Alumno traerAlumno(int id){
            
        return controlPersis.traerAlumno(id);    
    }
    public ArrayList<Alumno> traerListaAlumnos(){
    
        return controlPersis.traerListaAlumnos();  
    }
    ///////////////-----CARRERA--------------------------
    
    public void crearCarrera(Carrera car) {
        controlPersis.crearCarrera(car);
    }
    public void eliminarCarrera(int id) {
        controlPersis.eliminarCarrera(id);
    }
    public void editarCarrera(Carrera car) {
        controlPersis.editarCarrera(car);
    
    }
    //¿Por que Alumno y NO void?=>xq trar alumno es una funcion que tiene que devolver un objeto
    public Carrera traerCarrera(int id){
            
        return controlPersis.traerCarrera(id);    
    }
    public ArrayList<Carrera> traerListaCarreras(){
    
        return controlPersis.traerListaCarreras();  
    }
}
