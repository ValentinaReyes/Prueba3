
package model;

/**
 *
 * @author Valentina
 */
public class Profesor extends Persona{
    
    private Integer idProfesor;
    private String titulo;
    private String departamento;

    public Integer getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Integer idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    public Profesor(String nombre, String apellido, String direccion, Integer idProfesor, String titulo, String departamento) {
        super(nombre, apellido, direccion);
        this.idProfesor = idProfesor;
        this.titulo = titulo;
        this.departamento = departamento;
    }
    
    
}
