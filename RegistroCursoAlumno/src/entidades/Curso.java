/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;
import entidades.Alumno;
import java.util.List;

/**
 *
 * @author MIKI
 */
public class Curso {
    
    private String cursoNombre;
    private String Turno;
    private List<Alumno> alumnos;

    public Curso(String cursoNombre, String Turno, List<Alumno> alumnos) throws Exception {
        this.cursoNombre = cursoNombre;
        this.Turno = Turno;
        this.alumnos = alumnos;
        if(alumnos == null){
            throw new Exception("No se puede crear");            
        }
    }
    
    public void agregarAlumno(Alumno alumnos){
        this.alumnos.add(alumnos);
    }
    
    public List<Alumno> getAlumnos(){
        return alumnos;
    }
    public void setAlumnnos(List<Alumno> alumnos){
        this.alumnos = alumnos;
    }
    
    public String getDatosMostrar(){
        return this.cursoNombre + " | Turno : "+this.Turno;
        
    }

    public String getCursoNombre() {
        return cursoNombre;
    }

    public void setCursoNombre(String cursoNombre) {
        this.cursoNombre = cursoNombre;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String Turno) {
        this.Turno = Turno;
    }
    
    
}
