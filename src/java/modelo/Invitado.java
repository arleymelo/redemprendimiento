package modelo;


/**
 * Class Invitado
 */
public class Invitado {

  //
  // Fields
  //

  private Integrante invitado;
  private long idNotificacion;
  private boolean estado;
  
  //
  // Constructors
  //
  public Invitado () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of invitado
   * @param newVar the new value of invitado
   */
  private void setInvitado ( Integrante newVar ) {
    invitado = newVar;
  }

  /**
   * Get the value of invitado
   * @return the value of invitado
   */
  private Integrante getInvitado ( ) {
    return invitado;
  }

  /**
   * Set the value of idNotificacion
   * @param newVar the new value of idNotificacion
   */
  private void setIdNotificacion ( long newVar ) {
    idNotificacion = newVar;
  }

  /**
   * Get the value of idNotificacion
   * @return the value of idNotificacion
   */
  private long getIdNotificacion ( ) {
    return idNotificacion;
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
