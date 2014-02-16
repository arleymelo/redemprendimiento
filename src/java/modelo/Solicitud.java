package modelo;

/**
 * Class Solicitud
 */
public class Solicitud {

  //
  // Fields
  //

  private Integrante solicitante;
  private long idSolicitud;
  private Proyecto proyecto;
  private boolean estado;
  
  //
  // Constructors
  //
  public Solicitud () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of solicitante
   * @param newVar the new value of solicitante
   */
  private void setSolicitante ( Integrante newVar ) {
    solicitante = newVar;
  }

  /**
   * Get the value of solicitante
   * @return the value of solicitante
   */
  private Integrante getSolicitante ( ) {
    return solicitante;
  }

  /**
   * Set the value of idSolicitud
   * @param newVar the new value of idSolicitud
   */
  private void setIdSolicitud ( long newVar ) {
    idSolicitud = newVar;
  }

  /**
   * Get the value of idSolicitud
   * @return the value of idSolicitud
   */
  private long getIdSolicitud ( ) {
    return idSolicitud;
  }

  /**
   * Set the value of proyecto
   * @param newVar the new value of proyecto
   */
  private void setProyecto ( Proyecto newVar ) {
    proyecto = newVar;
  }

  /**
   * Get the value of proyecto
   * @return the value of proyecto
   */
  private Proyecto getProyecto ( ) {
    return proyecto;
  }

  /**
   * Set the value of estado
   * @param newVar the new value of estado
   */
  private void setEstado ( boolean newVar ) {
    estado = newVar;
  }

  /**
   * Get the value of estado
   * @return the value of estado
   */
  private boolean getEstado ( ) {
    return estado;
  }

  //
  // Other methods
  //

}
