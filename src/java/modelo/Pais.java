package modelo;

/**
 * Class Pais
 */
public class Pais {

  //
  // Fields
  //

  private String descripcion;
  private int idPais;
  
  //
  // Constructors
  //
  public Pais () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

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
   * Set the value of idPais
   * @param newVar the new value of idPais
   */
  private void setIdPais ( int newVar ) {
    idPais = newVar;
  }

  /**
   * Get the value of idPais
   * @return the value of idPais
   */
  private int getIdPais ( ) {
    return idPais;
  }

  //
  // Other methods
  //

}
