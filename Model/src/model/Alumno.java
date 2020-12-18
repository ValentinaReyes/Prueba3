
package model;

/**
 *
 * @author Valentina
 */
public class Alumno extends Persona {
    
    private Integer idAlumno;
    private Integer añoIngreso;
    private String carrera;

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Integer getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(Integer añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
    public Alumno(String nombre, String apellido, String direccion, Integer idAlumno, Integer añoIngreso, String carrera) {
        super(nombre, apellido, direccion);
        this.idAlumno = idAlumno;
        this.añoIngreso = añoIngreso;
        this.carrera = carrera;
    }
    
    
}
