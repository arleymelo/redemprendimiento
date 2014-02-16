package modelo;

/**
 * Class Departamento
 */
public class Departamento {

  //
  // Fields
  //

  private int idDepartamento;
  private String descripcion;
  private Pais pais;
  
  //
  // Constructors
  //
  public Departamento () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of idDepartamento
   * @param newVar the new value of idDepartamento
   */
  private void setIdDepartamento ( int newVar ) {
    idDepartamento = newVar;
  }

  /**
   * Get the value of idDepartamento
   * @return the value of idDepartamento
   */
  private int getIdDepartamento ( ) {
    return idDepartamento;
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
   * Set the value of pais
   * @param newVar the new value of pais
   */
  private void setPais ( Pais newVar ) {
    pais = newVar;
  }

  /**
   * Get the value of pais
   * @return the value of pais
   */
  private Pais getPais ( ) {
    return pais;
  }

  //
  // Other methods
  //

}
