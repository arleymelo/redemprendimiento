package modelo;

/**
 * Class Ciudad
 */
public class Ciudad {

  //
  // Fields
  //

  private int idCiudad;
  private String descripcion;
  private Departamento departamento;
  
  //
  // Constructors
  //
  public Ciudad () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of idCiudad
   * @param newVar the new value of idCiudad
   */
  private void setIdCiudad ( int newVar ) {
    idCiudad = newVar;
  }

  /**
   * Get the value of idCiudad
   * @return the value of idCiudad
   */
  private int getIdCiudad ( ) {
    return idCiudad;
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
   * Set the value of departamento
   * @param newVar the new value of departamento
   */
  private void setDepartamento ( Departamento newVar ) {
    departamento = newVar;
  }

  /**
   * Get the value of departamento
   * @return the value of departamento
   */
  private Departamento getDepartamento ( ) {
    return departamento;
  }

  //
  // Other methods
  //

}
