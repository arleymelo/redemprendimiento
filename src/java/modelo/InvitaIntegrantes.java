package modelo;
import java.util.*;


/**
 * Class InvitaIntegrantes
 */
public class InvitaIntegrantes {

  //
  // Fields
  //

  private Proyecto proyecto;
  private List<Invitado> invitados;
  private long idNotificacion;
  
  //
  // Constructors
  //
  public InvitaIntegrantes () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

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
   * Set the value of invitados
   * @param newVar the new value of invitados
   */
  private void setInvitados ( List<Invitado> newVar ) {
    invitados = newVar;
  }

  /**
   * Get the value of invitados
   * @return the value of invitados
   */
  private List<Invitado> getInvitados ( ) {
    return invitados;
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

  //
  // Other methods
  //

}
