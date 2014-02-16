package modelo;


import java.util.*;


/**
 * Class Proyecto
 */
public class Proyecto {

  //
  // Fields
  //

  private long idProyecto;
  private String descripcion;
  private Integrante lider;
  private Equipo equipo;
  private List<Profesion> profesiones;
  
  //
  // Constructors
  //
  public Proyecto () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of idProyecto
   * @param newVar the new value of idProyecto
   */
  private void setIdProyecto ( long newVar ) {
    idProyecto = newVar;
  }

  /**
   * Get the value of idProyecto
   * @return the value of idProyecto
   */
  private long getIdProyecto ( ) {
    return idProyecto;
  }

  /**
   * Set the value of descripcion
   * @param newVar the new value of descripcion
   */
  private void setDescripcion ( String newVar ) {
    descripcion = newVar;
  }

  /**
   * Get the value of descripcion
   * @return the value of descripcion
   */
  private String getDescripcion ( ) {
    return descripcion;
  }

  /**
   * Set the value of lider
   * @param newVar the new value of lider
   */
  private void setLider ( Integrante newVar ) {
    lider = newVar;
  }

  /**
   * Get the value of lider
   * @return the value of lider
   */
  private Integrante getLider ( ) {
    return lider;
  }

  /**
   * Set the value of equipo
   * @param newVar the new value of equipo
   */
  private void setEquipo ( Equipo newVar ) {
    equipo = newVar;
  }

  /**
   * Get the value of equipo
   * @return the value of equipo
   */
  private Equipo getEquipo ( ) {
    return equipo;
  }

  /**
   * Set the value of profesiones
   * @param newVar the new value of profesiones
   */
  private void setProfesiones ( List<Profesion> newVar ) {
    profesiones = newVar;
  }

  /**
   * Get the value of profesiones
   * @return the value of profesiones
   */
  private List<Profesion> getProfesiones ( ) {
    return profesiones;
  }

  //
  // Other methods
  //

}
