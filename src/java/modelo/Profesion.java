package modelo;
import java.util.*;


/**
 * Class Profesion
 */
public class Profesion {

  //
  // Fields
  //

  private int idProfesion;
  private String descripcion;
  
  //
  // Constructors
  //
  public Profesion () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of idProfesion
   * @param newVar the new value of idProfesion
   */
  private void setIdProfesion ( int newVar ) {
    idProfesion = newVar;
  }

  /**
   * Get the value of idProfesion
   * @return the value of idProfesion
   */
  private int getIdProfesion ( ) {
    return idProfesion;
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

  //
  // Other methods
  //

}
