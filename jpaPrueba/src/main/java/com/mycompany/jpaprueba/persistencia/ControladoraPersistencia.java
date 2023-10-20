
package com.mycompany.jpaprueba.persistencia;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    AlumnoJpaController aluJpa= new AlumnoJpaController();
    CarreraJpaController carJpa= new CarreraJpaController();
//----------------------    METODOS DE ALUMNOS -------------------------------------
    public void crearAlumno(Alumno alu) {
       aluJpa.create(alu);
    }

    public void eliminarAlumno(int id) {
        try {
            aluJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAlumno(Alumno alu) {
        try { 
            aluJpa.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Alumno traerAlumno(int id) {
        return aluJpa.findAlumno(id);
    }
 
    public ArrayList<Alumno> traerListaAlumnos() {
        List<Alumno> listita = aluJpa.findAlumnoEntities();
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>(listita);
        return listaAlumnos;
    }
//----------------------    METODOS DE CARRERAS -------------------------------------
    public void crearCarrera(Carrera car) {
        carJpa.create(car);
    }

    public void eliminarCarrera(int id) {
        try {
            carJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarCarrera(Carrera car) {
        try {
            carJpa.edit(car);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera traerCarrera(int id) { 
        return carJpa.findCarrera(id);
    }

    public ArrayList<Carrera> traerListaCarreras() {
       List<Carrera> lista = carJpa.findCarreraEntities();
        ArrayList<Carrera> listaCarreras = new ArrayList(lista);
        return listaCarreras;
    }
       
}
